package net.scalax.asuna.core

import cats.Traverse
import io.circe.{ Json, JsonObject }
import io.circe.syntax._
import cats.kernel.CommutativeSemigroup
import cats.data._
import cats.implicits._
import net.scalax.asuna.shape.DataShapeValue

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait CirceReaderQuery[U] {

  def shapeValue: DataShapeValue[U, CirceReaderAbs]

  implicit val commutativeSemigroupListString: CommutativeSemigroup[ValidateModel] = {
    new CommutativeSemigroup[ValidateModel] {
      override def combine(x: ValidateModel, y: ValidateModel): ValidateModel = {
        ValidateModel(whole = x.whole ::: y.whole, fields = x.fields ::: y.fields)
      }
    }
  }

  def sequence[T](list: List[Future[Validated[ValidateModel, T]]]): Future[Validated[ValidateModel, List[T]]] = {
    Traverse[List].sequence(list).map(models =>
      Traverse[List].sequence[Validated[ValidateModel, ?], T](models))
  }

  def validateJson(list: List[CirceReaderAbs], jsonObj: JsonObject): Future[Validated[ValidateModel, List[Any]]] = {
    val validatedList = list.map { r =>
      val json = jsonObj.apply(r.keyName).getOrElse(Json.Null)
      implicit val decoder = r.circeReader
      val dataEt = json.as[r.DataType]
      (dataEt match {
        case Left(e) =>
          Future.successful(Validated.invalid(ValidateModel(fields = List(ValidateField(r.keyName, s"${r.keyName}的属性类型不匹配或不能为空")))))
        case Right(d) =>
          r.validate(d)
      }): Future[Validated[ValidateModel, r.ResultType]]
    }
    sequence(validatedList)
  }

  def tranData(jsonObj: JsonObject): Future[Validated[ValidateModel, U]] = {
    val impl = implicitly[DataShape[DataShapeValue[U, CirceReaderAbs], U, DataShapeValue[U, CirceReaderAbs], CirceReaderAbs]]
    val rGroup = impl.toLawRep(impl.wrapRep(shapeValue))
    val listAnyData = validateJson(rGroup.reps, jsonObj)
    listAnyData.map(_.map(items => impl.takeData(DataGroup(items = items, subs = List.empty), shapeValue).right.get.current))
  }

}