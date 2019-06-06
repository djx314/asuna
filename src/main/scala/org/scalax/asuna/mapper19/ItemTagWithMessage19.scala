package org.scalax.asuna.mapper.item
class ItemTagWithMessage19[
  T1,
  Message1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  Message2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  Message3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  Message4 <: org.scalax.asuna.mapper.item.Message,
  T5,
  Message5 <: org.scalax.asuna.mapper.item.Message,
  T6,
  Message6 <: org.scalax.asuna.mapper.item.Message,
  T7,
  Message7 <: org.scalax.asuna.mapper.item.Message,
  T8,
  Message8 <: org.scalax.asuna.mapper.item.Message,
  T9,
  Message9 <: org.scalax.asuna.mapper.item.Message,
  T10,
  Message10 <: org.scalax.asuna.mapper.item.Message,
  T11,
  Message11 <: org.scalax.asuna.mapper.item.Message,
  T12,
  Message12 <: org.scalax.asuna.mapper.item.Message,
  T13,
  Message13 <: org.scalax.asuna.mapper.item.Message,
  T14,
  Message14 <: org.scalax.asuna.mapper.item.Message,
  T15,
  Message15 <: org.scalax.asuna.mapper.item.Message,
  T16,
  Message16 <: org.scalax.asuna.mapper.item.Message,
  T17,
  Message17 <: org.scalax.asuna.mapper.item.Message,
  T18,
  Message18 <: org.scalax.asuna.mapper.item.Message,
  T19,
  Message19 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type XyyItemType = XyyItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage19[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T6,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T7,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T8,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T9,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T10,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T11,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T12,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T13,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T14,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T15,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T16,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T17,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T18,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T19,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam,
    I7 <: org.scalax.asuna.mapper.TypeParam,
    I8 <: org.scalax.asuna.mapper.TypeParam,
    I9 <: org.scalax.asuna.mapper.TypeParam,
    I10 <: org.scalax.asuna.mapper.TypeParam,
    I11 <: org.scalax.asuna.mapper.TypeParam,
    I12 <: org.scalax.asuna.mapper.TypeParam,
    I13 <: org.scalax.asuna.mapper.TypeParam,
    I14 <: org.scalax.asuna.mapper.TypeParam,
    I15 <: org.scalax.asuna.mapper.TypeParam,
    I16 <: org.scalax.asuna.mapper.TypeParam,
    I17 <: org.scalax.asuna.mapper.TypeParam,
    I18 <: org.scalax.asuna.mapper.TypeParam,
    I19 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, Message2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, Message3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, Message4],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, Message5],
    dapp6: org.scalax.asuna.mapper.DebugItemApplication[K, T6, I6, Message6],
    dapp7: org.scalax.asuna.mapper.DebugItemApplication[K, T7, I7, Message7],
    dapp8: org.scalax.asuna.mapper.DebugItemApplication[K, T8, I8, Message8],
    dapp9: org.scalax.asuna.mapper.DebugItemApplication[K, T9, I9, Message9],
    dapp10: org.scalax.asuna.mapper.DebugItemApplication[K, T10, I10, Message10],
    dapp11: org.scalax.asuna.mapper.DebugItemApplication[K, T11, I11, Message11],
    dapp12: org.scalax.asuna.mapper.DebugItemApplication[K, T12, I12, Message12],
    dapp13: org.scalax.asuna.mapper.DebugItemApplication[K, T13, I13, Message13],
    dapp14: org.scalax.asuna.mapper.DebugItemApplication[K, T14, I14, Message14],
    dapp15: org.scalax.asuna.mapper.DebugItemApplication[K, T15, I15, Message15],
    dapp16: org.scalax.asuna.mapper.DebugItemApplication[K, T16, I16, Message16],
    dapp17: org.scalax.asuna.mapper.DebugItemApplication[K, T17, I17, Message17],
    dapp18: org.scalax.asuna.mapper.DebugItemApplication[K, T18, I18, Message18],
    dapp19: org.scalax.asuna.mapper.DebugItemApplication[K, T19, I19, Message19]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.ItemTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    EatXyyType19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
  ] =
    ItemTag19.appendEatXyy19(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19
    )
}
object ItemTagWithMessage19 {
  implicit def appendEatXyy19[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    Message1 <: org.scalax.asuna.mapper.item.Message,
    Message2 <: org.scalax.asuna.mapper.item.Message,
    Message3 <: org.scalax.asuna.mapper.item.Message,
    Message4 <: org.scalax.asuna.mapper.item.Message,
    Message5 <: org.scalax.asuna.mapper.item.Message,
    Message6 <: org.scalax.asuna.mapper.item.Message,
    Message7 <: org.scalax.asuna.mapper.item.Message,
    Message8 <: org.scalax.asuna.mapper.item.Message,
    Message9 <: org.scalax.asuna.mapper.item.Message,
    Message10 <: org.scalax.asuna.mapper.item.Message,
    Message11 <: org.scalax.asuna.mapper.item.Message,
    Message12 <: org.scalax.asuna.mapper.item.Message,
    Message13 <: org.scalax.asuna.mapper.item.Message,
    Message14 <: org.scalax.asuna.mapper.item.Message,
    Message15 <: org.scalax.asuna.mapper.item.Message,
    Message16 <: org.scalax.asuna.mapper.item.Message,
    Message17 <: org.scalax.asuna.mapper.item.Message,
    Message18 <: org.scalax.asuna.mapper.item.Message,
    Message19 <: org.scalax.asuna.mapper.item.Message,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage19[
    H1,
    Message1,
    H2,
    Message2,
    H3,
    Message3,
    H4,
    Message4,
    H5,
    Message5,
    H6,
    Message6,
    H7,
    Message7,
    H8,
    Message8,
    H9,
    Message9,
    H10,
    Message10,
    H11,
    Message11,
    H12,
    Message12,
    H13,
    Message13,
    H14,
    Message14,
    H15,
    Message15,
    H16,
    Message16,
    H17,
    Message17,
    H18,
    Message18,
    H19,
    Message19
  ], EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage19[
      H1,
      Message1,
      H2,
      Message2,
      H3,
      Message3,
      H4,
      Message4,
      H5,
      Message5,
      H6,
      Message6,
      H7,
      Message7,
      H8,
      Message8,
      H9,
      Message9,
      H10,
      Message10,
      H11,
      Message11,
      H12,
      Message12,
      H13,
      Message13,
      H14,
      Message14,
      H15,
      Message15,
      H16,
      Message16,
      H17,
      Message17,
      H18,
      Message18,
      H19,
      Message19
    ], EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def application(
        context: org.scalax.asuna.mapper.Context[K]
      ): K#M[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.isReverse) {
          context.append(
              ItemTag18.appendEatXyy18(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context)
            , t1.application(context)
            , ArticleXyyPlus19.put19
          )
        } else {
          context.append(
              ItemTag18.appendEatXyy18(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context)
            , t19.application(context)
            , ArticleXyyPlus19.plus19
          )
        }
      }
    }
}
