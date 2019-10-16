package asuna.test

import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, SealedTag}
import asuna.{Application, Context, Item0, ItemTag, KindContext, Plus, TypeParameter, TypeParameter1}

sealed trait Abc[T]
class AA[T](ii: T, iiii: String) extends Abc[T]
class BB[T](ii: T, iiii: String) extends Abc[T]

object SealedTraitTest extends App {

  //调试代码开始
  def init[H]: GenericApply1[H] = new GenericApply1[H]

  class GenericApply1[H] {
    def generic[T](implicit asunaSealedGeneric: AsunaSealedLabelledGeneric[H, T]): AsunaSealedLabelledGeneric[H, T] = asunaSealedGeneric
    def encode1[T <: ItemTag, TT <: TypeParameter](implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T], app: Application[KC, T, TT]): TT#H =
      throw new Exception()
  }
  //调试代码结束

  trait ListEncode[H] {
    def str: List[String]
  }

  def encode[H, T <: ItemTag, TT <: TypeParameter](
    implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T],
    app: Application[KC, T, TT],
    labelled: AsunaSealedLabelledGeneric[H, TT#H]
  ): ListEncode[H] = new ListEncode[H] {
    override def str: List[String] = app.application(i)(labelled.names.withContext(i))(List.empty)
  }

  class KC extends KindContext {
    override type M[T <: TypeParameter] = T#H => List[String] => List[String]
  }

  object i extends Context[KC] {
    override def isReverse: Boolean = false

    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](
      x: X#H => List[String] => List[String],
      y: Y#H => List[String] => List[String],
      p: Plus[X, Y, Z]
    ): Z#H => List[String] => List[String] = {
      { h: Z#H =>
        val xh = x(p.takeHead(h))
        val yh = y(p.takeTail(h));
        { ii: List[String] =>
          xh(yh(ii))
        }
      }
    }

    override def start: Item0 => List[String] => List[String] = { item: Item0 => (ii: List[String]) =>
      ii
    }
  }

  implicit def stringImplicit1[T, R]: Application[KC, SealedTag[T], TypeParameter1[String]] = new Application[KC, SealedTag[T], TypeParameter1[String]] {
    override def application(context: Context[KC]): String => List[String] => List[String] = {
      str: String =>
        { list: List[String] =>
          str :: list
        }
    }
  }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}