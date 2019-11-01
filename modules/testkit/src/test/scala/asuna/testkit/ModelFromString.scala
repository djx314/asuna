package asuna.testkit

import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, AsunaSetterGeneric, PropertyTag}
import asuna.{AppendTag, Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList, TypeHList1, TypeHList2}

trait ModelDecoder[M] {
  def getData(str: String): (String, M)
}

class MContext extends KindContext {

  override type M[T <: TypeHList] = ModelDecoder[T#H]

}

object decoderContext extends Context[MContext] {

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: ModelDecoder[X#H],
    y: ModelDecoder[Y#H],
    p: Plus[X, Y, Z]
  ): ModelDecoder[Z#H] = {
    { (str: String) =>
      val (str1, d1) = x.getData(str)
      val (str2, d2) = y.getData(str1)
      (str2, p.plus(d1, d2))
    }
  }

  override def start: ModelDecoder[AsunaTuple0] = { str: String =>
    (str, AsunaTuple0.value)
  }

}

object reverseDecoderContext extends Context[MContext] {

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: ModelDecoder[X#H],
    y: ModelDecoder[Y#H],
    p: Plus[X, Y, Z]
  ): ModelDecoder[Z#H] = {
    { (str: String) =>
      val (str1, d1) = y.getData(str)
      val (str2, d2) = x.getData(str1)
      (str2, p.plus(d2, d1))
    }
  }

  override def start: ModelDecoder[AsunaTuple0] = { str: String =>
    (str, AsunaTuple0.value)
  }

}

object out {

  def decoder[I1, I2 <: TupleTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[MContext, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3#H]
  ): ModelDecoder[I1] = {
    { str: String =>
      val c         = pp.application(reverseDecoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2 <: TupleTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[MContext, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3#H]
  ): ModelDecoder[I1] = {
    { str: String =>
      val c         = pp.application(decoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  /*def init1[I2 <: TupleTag](appendTag: AppendTag[I2]) = new ToStringApply2[I2]

  class ToStringApply2[I2 <: TupleTag] {
    def init2[I3 <: TypeHList](implicit app1: Application[IContext, I2, I3]) = new ToStringApply3[I2, I3] {
      override def app: Application[IContext, I2, I3] = app1
    }
  }

  trait ToStringApply3[I2 <: TupleTag, I3 <: TypeHList] {
    def app: Application[IContext, I2, I3]
    def encode[Model](ii: Model => I3#H, name: I3#T#H): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i)(ii(model), name).init(List.empty)
      }
    }
  }*/

  implicit val outImplicit1: Application[MContext, PropertyTag[String], TypeHList1[String]] = {
    context =>
      { (str: String) =>
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2)
      }
  }

  implicit val outImplicit2: Application[MContext, PropertyTag[Int], TypeHList1[Int]] = {
    context =>
      { (str: String) =>
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2.toInt)
      }
  }

  implicit val outImplicit3: Application[MContext, PropertyTag[Long], TypeHList1[Long]] = (context => {
    (str: String) =>
      val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
      val str2 = str1.takeWhile(s => s != ')')
      val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
      (str3, str2.toLong)
  })

}
