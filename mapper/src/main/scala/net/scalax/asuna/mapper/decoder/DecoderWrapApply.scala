package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderWrapApply[RepCol, DataCol] {
  def withLazyModel[Input, Output, Sub]: LazyModelWrap[Input, Output, Sub]           = new LazyModelWrap[Input, Output, Sub]      {}
  def withSingleModel[Case]: TableWrap[Case]                                         = new TableWrap[Case]                        {}
  def debugWithLazyModel[Input, Output, Sub]: DebugLazyModelWrap[Input, Output, Sub] = new DebugLazyModelWrap[Input, Output, Sub] {}
  def debugWithSingleModel[Output]: DebugTableWrap[Output]                           = new DebugTableWrap[Output]                 {}

  trait LazyModelWrap[Input, Output, Sub] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: DecoderInputTable.Aux[FirstDecoderInputTableImplicit, Table, Input, Output, Sub, Rep, TempData]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel[Input, Output, Sub]] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel[Input, Output, Sub]] {
        override def compile[Target1](
            implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]
        ): DecoderShapeValue[LazyModel[Input, Output, Sub], RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content)
          }
        }
      }

  }

  trait TableWrap[Case] {
    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: DecoderInputTable.Aux[FirstDecoderInputTableImplicit, Table, EmptyLazyModel, Case, EmptyLazyModel, Rep, TempData]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] {
        override def compile[Target1](implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): DecoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content).apply(EmptyLazyModel.value)
          }
        }
      }
  }

  trait DebugTableWrap[Case] {
    def apply[Table](tableParam: Table): DecoderShapeValue[Case, RepCol, DataCol] =
      macro DecoderCaseClassMapper.BlackboxDecoderCaseClassMapperImpl
        .debugCaseClassSingleModelDecoderGeneric[FirstDecoderInputTableImplicit, Table, Case, RepCol, DataCol]
  }

  trait DebugLazyModelWrap[Input, Output, Sub] {
    def apply[Table](tableParam: Table): DecoderShapeValue[LazyModel[Input, Output, Sub], RepCol, DataCol] =
      macro DecoderCaseClassMapper.BlackboxDecoderCaseClassMapperImpl
        .debugCaseClassLazyModelDecoderGeneric[FirstDecoderInputTableImplicit, Table, Input, Output, Sub, RepCol, DataCol]
  }

}

object DecoderWrapApply {
  def decoderInstance[RepCol, DataCol]: DecoderWrapApply[RepCol, DataCol] = new DecoderWrapApply[RepCol, DataCol] {}
}
