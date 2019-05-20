package org.scalax.asuna.ii.item
class ItemTagWithMessage10[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem =
    ItemTagWithMessage9[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7, T8, Message8, T9, Message9, T10, Message10]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type XyyItemType = XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage10[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage10[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], EatXyyType10[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
  ]] =
    ItemTag10.appendEatXyy10(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10)
}
