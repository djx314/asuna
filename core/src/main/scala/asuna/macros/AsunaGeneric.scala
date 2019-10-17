package asuna.macros

import asuna._

import scala.language.experimental.macros

class PropertyTag[T]
class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag[R]] = new AppendTag[PropertyTag[R]]
}
object PropertyApply {
  def apply[R]: PropertyApply[R] = new PropertyApply[R]
}

trait AsunaGeneric[H] {
  type WT <: ItemTag
  def tag: WT
}

object AsunaGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: ItemTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag](i: AppendTag[K]): Aux[M, K] = {
      new AsunaGeneric[M] {
        override type WT = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: ItemTag] = AsunaGeneric[H] { type WT = II }

  implicit def macroImpl[H, II <: ItemTag]: AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaGenericCodeGenSample {

  case class Test10(i1: String, i2: Int, i3: Int, i4: Long, i5: String, i6: List[String], i7: Long, i8: Option[Long], i9: List[Long], i10: String)
  val genResult: AsunaGeneric.Aux[Test10, NodeTag2[ItemTag8[
    PropertyTag[String],
    `Number： 1`,
    PropertyTag[Int],
    `Number： 2`,
    PropertyTag[Int],
    `Number： 3`,
    PropertyTag[Long],
    `Number： 4`,
    PropertyTag[String],
    `Number： 5`,
    PropertyTag[List[String]],
    `Number： 6`,
    PropertyTag[Long],
    `Number： 7`,
    PropertyTag[Option[Long]],
    `Number： 8`
  ], `Number： 1`, ItemTag2[PropertyTag[List[Long]], `Number： 1`, PropertyTag[String], `Number： 2`], `Number： 2`]] = {
    val pro = PropertyApply[Test10]
    AsunaGeneric.init[Test10].init1 {
      BuildContent.lift(
        BuildContent.nodeTag(
          BuildContent.tag(pro.to(_.i1), pro.to(_.i2), pro.to(_.i3), pro.to(_.i4), pro.to(_.i5), pro.to(_.i6), pro.to(_.i7), pro.to(_.i8)),
          BuildContent.tag(pro.to(_.i9), pro.to(_.i10))
        )
      )
    }
  }

}

object AsunaGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: ItemTag: c.WeakTypeTag]: c.Expr[AsunaGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val proTypeTag = props.map(s => q"""asuna.macros.PropertyApply[${hType}].to(_.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""asuna.BuildContent.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.lift(asuna.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildContent.nodeTag(..${s})"""))
          }

        c.Expr[AsunaGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaGeneric.init[${hType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
