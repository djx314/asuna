package net.scalax.asuna.core

trait DataShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: DataShape[RepType, U, RepType, T]

  def mapReader[F](cv: U => F): DataShapeValue[F, T] = {
    map((s: U) => Option(cv(s)))((_: F) => Option.empty)
  }

  def mapWriter[F](reCv: F => U): DataShapeValue[F, T] = {
    map((_: U) => Option.empty[F])((s: F) => Option(reCv(s)))
  }

  def mapFull[F](cv: U => F)(reCv: F => U): DataShapeValue[F, T] = {
    map((s: U) => Option(cv(s)))((s: F) => Option(reCv(s)))
  }

  def map[F](cv: U => Option[F])(reCv: F => Option[U]): DataShapeValue[F, T] = new DataShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DataShape[self.RepType, F, self.RepType, T] {
      innerSelf =>

      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType): DataRepGroup[T] = self.shape.toLawRep(self.rep)
      override def takeData(oldData: DataGroup, rep: self.RepType): Either[NotConvert, SplitData[F]] = {
        val data = self.shape.takeData(oldData, rep)

        data.right.flatMap { d =>
          val current = cv(d.current)
          current match {
            case Some(s) => Right(SplitData(
              current = s,
              left = d.left))
            case None =>
              Left(NotConvert.value)
          }
        }
      }

      override def buildData(splitData: F, rep: RepType): Either[NotConvert, DataGroup] = {
        reCv(splitData) match {
          case Some(s) =>
            self.shape.buildData(s, rep)
          case _ =>
            Left(NotConvert.value)
        }
      }
    }
  }
}

trait DataShapeValueInitWrap[D] {
  def apply[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, D]): C = {
    shape.wrapRep(rep)
  }
}

object DataShapeValue {

  implicit def dataShapeValueShape[U, T]: DataShape[DataShapeValue[U, T], U, DataShapeValue[U, T], T] = {

    new DataShape[DataShapeValue[U, T], U, DataShapeValue[U, T], T] {
      self =>
      override def wrapRep(base: DataShapeValue[U, T]): DataShapeValue[U, T] = base
      override def toLawRep(base: DataShapeValue[U, T]): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))
      override def takeData(oldData: DataGroup, rep: DataShapeValue[U, T]): Either[NotConvert, SplitData[U]] = rep.shape.takeData(oldData, rep.rep)
      override def buildData(splitData: U, rep: DataShapeValue[U, T]): Either[NotConvert, DataGroup] = rep.shape.buildData(splitData, rep.rep)
    }

  }

  def toShapeValue[D]: DataShapeValueInitWrap[D] = new DataShapeValueInitWrap[D] {}

}