package zsg
import scala.language.higherKinds
class ZNode10[  I1 <: zsg.TupleTag   ,  I2 <: zsg.TupleTag   ,  I3 <: zsg.TupleTag   ,  I4 <: zsg.TupleTag   ,  I5 <: zsg.TupleTag   ,  I6 <: zsg.TupleTag   ,  I7 <: zsg.TupleTag   ,  I8 <: zsg.TupleTag   ,  I9 <: zsg.TupleTag   ,  I10 <: zsg.TupleTag ](  val i1: I1   ,  val i2: I2   ,  val i3: I3   ,  val i4: I4   ,  val i5: I5   ,  val i6: I6   ,  val i7: I7   ,  val i8: I8   ,  val i9: I9   ,  val i10: I10 ) extends zsg.TupleTag
object ZNode10 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX1[F, T
                , Tuple1_Context1
        ]
         ,   inline  t2: ApplicationX1[F, T
                , Tuple2_Context1
        ]
         ,   inline  t3: ApplicationX1[F, T
                , Tuple3_Context1
        ]
         ,   inline  t4: ApplicationX1[F, T
                , Tuple4_Context1
        ]
         ,   inline  t5: ApplicationX1[F, T
                , Tuple5_Context1
        ]
         ,   inline  t6: ApplicationX1[F, T
                , Tuple6_Context1
        ]
         ,   inline  t7: ApplicationX1[F, T
                , Tuple7_Context1
        ]
         ,   inline  t8: ApplicationX1[F, T
                , Tuple8_Context1
        ]
         ,   inline  t9: ApplicationX1[F, T
                , Tuple9_Context1
        ]
         ,   inline  t10: ApplicationX1[F, T
                , Tuple10_Context1
        ]
            ) :  ApplicationX1[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
]  = new  ApplicationX1[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1), t10.application(context))(PlusInstanceTuple10.nodeContextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX2[F, T
                , Tuple1_Context1
                , Tuple1_Context2
        ]
         ,   inline  t2: ApplicationX2[F, T
                , Tuple2_Context1
                , Tuple2_Context2
        ]
         ,   inline  t3: ApplicationX2[F, T
                , Tuple3_Context1
                , Tuple3_Context2
        ]
         ,   inline  t4: ApplicationX2[F, T
                , Tuple4_Context1
                , Tuple4_Context2
        ]
         ,   inline  t5: ApplicationX2[F, T
                , Tuple5_Context1
                , Tuple5_Context2
        ]
         ,   inline  t6: ApplicationX2[F, T
                , Tuple6_Context1
                , Tuple6_Context2
        ]
         ,   inline  t7: ApplicationX2[F, T
                , Tuple7_Context1
                , Tuple7_Context2
        ]
         ,   inline  t8: ApplicationX2[F, T
                , Tuple8_Context1
                , Tuple8_Context2
        ]
         ,   inline  t9: ApplicationX2[F, T
                , Tuple9_Context1
                , Tuple9_Context2
        ]
         ,   inline  t10: ApplicationX2[F, T
                , Tuple10_Context1
                , Tuple10_Context2
        ]
            ) :  ApplicationX2[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
]  = new  ApplicationX2[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2), t10.application(context))(PlusInstanceTuple10.nodeContextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX3[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
        ]
         ,   inline  t2: ApplicationX3[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
        ]
         ,   inline  t3: ApplicationX3[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
        ]
         ,   inline  t4: ApplicationX3[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
        ]
         ,   inline  t5: ApplicationX3[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
        ]
         ,   inline  t6: ApplicationX3[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
        ]
         ,   inline  t7: ApplicationX3[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
        ]
         ,   inline  t8: ApplicationX3[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
        ]
         ,   inline  t9: ApplicationX3[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
        ]
         ,   inline  t10: ApplicationX3[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
        ]
            ) :  ApplicationX3[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
]  = new  ApplicationX3[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3), t10.application(context))(PlusInstanceTuple10.nodeContextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag  , Tuple6_Context4 <: TupleTag  , Tuple7_Context4 <: TupleTag  , Tuple8_Context4 <: TupleTag  , Tuple9_Context4 <: TupleTag  , Tuple10_Context4 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX4[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
        ]
         ,   inline  t2: ApplicationX4[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
        ]
         ,   inline  t3: ApplicationX4[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
        ]
         ,   inline  t4: ApplicationX4[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
        ]
         ,   inline  t5: ApplicationX4[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
        ]
         ,   inline  t6: ApplicationX4[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
                , Tuple6_Context4
        ]
         ,   inline  t7: ApplicationX4[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
                , Tuple7_Context4
        ]
         ,   inline  t8: ApplicationX4[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
                , Tuple8_Context4
        ]
         ,   inline  t9: ApplicationX4[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
                , Tuple9_Context4
        ]
         ,   inline  t10: ApplicationX4[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
                , Tuple10_Context4
        ]
            ) :  ApplicationX4[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
]  = new  ApplicationX4[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
         ,  ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4), t10.application(context))(PlusInstanceTuple10.nodeContextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag  , Tuple6_Context4 <: TupleTag  , Tuple7_Context4 <: TupleTag  , Tuple8_Context4 <: TupleTag  , Tuple9_Context4 <: TupleTag  , Tuple10_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag  , Tuple6_Context5 <: TupleTag  , Tuple7_Context5 <: TupleTag  , Tuple8_Context5 <: TupleTag  , Tuple9_Context5 <: TupleTag  , Tuple10_Context5 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX5[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
        ]
         ,   inline  t2: ApplicationX5[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
        ]
         ,   inline  t3: ApplicationX5[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
        ]
         ,   inline  t4: ApplicationX5[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
        ]
         ,   inline  t5: ApplicationX5[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
        ]
         ,   inline  t6: ApplicationX5[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
                , Tuple6_Context4
                , Tuple6_Context5
        ]
         ,   inline  t7: ApplicationX5[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
                , Tuple7_Context4
                , Tuple7_Context5
        ]
         ,   inline  t8: ApplicationX5[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
                , Tuple8_Context4
                , Tuple8_Context5
        ]
         ,   inline  t9: ApplicationX5[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
                , Tuple9_Context4
                , Tuple9_Context5
        ]
         ,   inline  t10: ApplicationX5[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
                , Tuple10_Context4
                , Tuple10_Context5
        ]
            ) :  ApplicationX5[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
]  = new  ApplicationX5[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
         ,  ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
         ,  ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5), t10.application(context))(PlusInstanceTuple10.nodeContextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag  , Tuple6_Context4 <: TupleTag  , Tuple7_Context4 <: TupleTag  , Tuple8_Context4 <: TupleTag  , Tuple9_Context4 <: TupleTag  , Tuple10_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag  , Tuple6_Context5 <: TupleTag  , Tuple7_Context5 <: TupleTag  , Tuple8_Context5 <: TupleTag  , Tuple9_Context5 <: TupleTag  , Tuple10_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag  , Tuple6_Context6 <: TupleTag  , Tuple7_Context6 <: TupleTag  , Tuple8_Context6 <: TupleTag  , Tuple9_Context6 <: TupleTag  , Tuple10_Context6 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX6[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
        ]
         ,   inline  t2: ApplicationX6[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
        ]
         ,   inline  t3: ApplicationX6[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
        ]
         ,   inline  t4: ApplicationX6[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
        ]
         ,   inline  t5: ApplicationX6[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
        ]
         ,   inline  t6: ApplicationX6[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
                , Tuple6_Context4
                , Tuple6_Context5
                , Tuple6_Context6
        ]
         ,   inline  t7: ApplicationX6[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
                , Tuple7_Context4
                , Tuple7_Context5
                , Tuple7_Context6
        ]
         ,   inline  t8: ApplicationX6[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
                , Tuple8_Context4
                , Tuple8_Context5
                , Tuple8_Context6
        ]
         ,   inline  t9: ApplicationX6[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
                , Tuple9_Context4
                , Tuple9_Context5
                , Tuple9_Context6
        ]
         ,   inline  t10: ApplicationX6[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
                , Tuple10_Context4
                , Tuple10_Context5
                , Tuple10_Context6
        ]
            ) :  ApplicationX6[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
]  = new  ApplicationX6[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
         ,  ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
         ,  ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
         ,  ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6), t10.application(context))(PlusInstanceTuple10.nodeContextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag  , Tuple6_Context4 <: TupleTag  , Tuple7_Context4 <: TupleTag  , Tuple8_Context4 <: TupleTag  , Tuple9_Context4 <: TupleTag  , Tuple10_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag  , Tuple6_Context5 <: TupleTag  , Tuple7_Context5 <: TupleTag  , Tuple8_Context5 <: TupleTag  , Tuple9_Context5 <: TupleTag  , Tuple10_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag  , Tuple6_Context6 <: TupleTag  , Tuple7_Context6 <: TupleTag  , Tuple8_Context6 <: TupleTag  , Tuple9_Context6 <: TupleTag  , Tuple10_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag  , Tuple4_Context7 <: TupleTag  , Tuple5_Context7 <: TupleTag  , Tuple6_Context7 <: TupleTag  , Tuple7_Context7 <: TupleTag  , Tuple8_Context7 <: TupleTag  , Tuple9_Context7 <: TupleTag  , Tuple10_Context7 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX7[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
        ]
         ,   inline  t2: ApplicationX7[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
        ]
         ,   inline  t3: ApplicationX7[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
        ]
         ,   inline  t4: ApplicationX7[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
                , Tuple4_Context7
        ]
         ,   inline  t5: ApplicationX7[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
                , Tuple5_Context7
        ]
         ,   inline  t6: ApplicationX7[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
                , Tuple6_Context4
                , Tuple6_Context5
                , Tuple6_Context6
                , Tuple6_Context7
        ]
         ,   inline  t7: ApplicationX7[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
                , Tuple7_Context4
                , Tuple7_Context5
                , Tuple7_Context6
                , Tuple7_Context7
        ]
         ,   inline  t8: ApplicationX7[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
                , Tuple8_Context4
                , Tuple8_Context5
                , Tuple8_Context6
                , Tuple8_Context7
        ]
         ,   inline  t9: ApplicationX7[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
                , Tuple9_Context4
                , Tuple9_Context5
                , Tuple9_Context6
                , Tuple9_Context7
        ]
         ,   inline  t10: ApplicationX7[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
                , Tuple10_Context4
                , Tuple10_Context5
                , Tuple10_Context6
                , Tuple10_Context7
        ]
            ) :  ApplicationX7[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
        , ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
]  = new  ApplicationX7[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
        , ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
         ,  ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
         ,  ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
         ,  ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
         ,  ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7), t10.application(context))(PlusInstanceTuple10.nodeContextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag  , Tuple6_Context1 <: TupleTag  , Tuple7_Context1 <: TupleTag  , Tuple8_Context1 <: TupleTag  , Tuple9_Context1 <: TupleTag  , Tuple10_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag  , Tuple6_Context2 <: TupleTag  , Tuple7_Context2 <: TupleTag  , Tuple8_Context2 <: TupleTag  , Tuple9_Context2 <: TupleTag  , Tuple10_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag  , Tuple6_Context3 <: TupleTag  , Tuple7_Context3 <: TupleTag  , Tuple8_Context3 <: TupleTag  , Tuple9_Context3 <: TupleTag  , Tuple10_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag  , Tuple6_Context4 <: TupleTag  , Tuple7_Context4 <: TupleTag  , Tuple8_Context4 <: TupleTag  , Tuple9_Context4 <: TupleTag  , Tuple10_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag  , Tuple6_Context5 <: TupleTag  , Tuple7_Context5 <: TupleTag  , Tuple8_Context5 <: TupleTag  , Tuple9_Context5 <: TupleTag  , Tuple10_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag  , Tuple6_Context6 <: TupleTag  , Tuple7_Context6 <: TupleTag  , Tuple8_Context6 <: TupleTag  , Tuple9_Context6 <: TupleTag  , Tuple10_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag  , Tuple4_Context7 <: TupleTag  , Tuple5_Context7 <: TupleTag  , Tuple6_Context7 <: TupleTag  , Tuple7_Context7 <: TupleTag  , Tuple8_Context7 <: TupleTag  , Tuple9_Context7 <: TupleTag  , Tuple10_Context7 <: TupleTag 
         , Tuple1_Context8 <: TupleTag  , Tuple2_Context8 <: TupleTag  , Tuple3_Context8 <: TupleTag  , Tuple4_Context8 <: TupleTag  , Tuple5_Context8 <: TupleTag  , Tuple6_Context8 <: TupleTag  , Tuple7_Context8 <: TupleTag  , Tuple8_Context8 <: TupleTag  , Tuple9_Context8 <: TupleTag  , Tuple10_Context8 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX8[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
                , Tuple1_Context8
        ]
         ,   inline  t2: ApplicationX8[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
                , Tuple2_Context8
        ]
         ,   inline  t3: ApplicationX8[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
                , Tuple3_Context8
        ]
         ,   inline  t4: ApplicationX8[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
                , Tuple4_Context7
                , Tuple4_Context8
        ]
         ,   inline  t5: ApplicationX8[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
                , Tuple5_Context7
                , Tuple5_Context8
        ]
         ,   inline  t6: ApplicationX8[F, T
                , Tuple6_Context1
                , Tuple6_Context2
                , Tuple6_Context3
                , Tuple6_Context4
                , Tuple6_Context5
                , Tuple6_Context6
                , Tuple6_Context7
                , Tuple6_Context8
        ]
         ,   inline  t7: ApplicationX8[F, T
                , Tuple7_Context1
                , Tuple7_Context2
                , Tuple7_Context3
                , Tuple7_Context4
                , Tuple7_Context5
                , Tuple7_Context6
                , Tuple7_Context7
                , Tuple7_Context8
        ]
         ,   inline  t8: ApplicationX8[F, T
                , Tuple8_Context1
                , Tuple8_Context2
                , Tuple8_Context3
                , Tuple8_Context4
                , Tuple8_Context5
                , Tuple8_Context6
                , Tuple8_Context7
                , Tuple8_Context8
        ]
         ,   inline  t9: ApplicationX8[F, T
                , Tuple9_Context1
                , Tuple9_Context2
                , Tuple9_Context3
                , Tuple9_Context4
                , Tuple9_Context5
                , Tuple9_Context6
                , Tuple9_Context7
                , Tuple9_Context8
        ]
         ,   inline  t10: ApplicationX8[F, T
                , Tuple10_Context1
                , Tuple10_Context2
                , Tuple10_Context3
                , Tuple10_Context4
                , Tuple10_Context5
                , Tuple10_Context6
                , Tuple10_Context7
                , Tuple10_Context8
        ]
            ) :  ApplicationX8[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
        , ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
        , ZNode10[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8 ]
]  = new  ApplicationX8[F, T
        , ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
        , ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
        , ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
        , ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
        , ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
        , ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
        , ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
        , ZNode10[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8 ]
]   {
                override def application(context: T):  F[
         ZNode10[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1 ]
         ,  ZNode10[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2 ]
         ,  ZNode10[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3 ]
         ,  ZNode10[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4 ]
         ,  ZNode10[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5 ]
         ,  ZNode10[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6 ]
         ,  ZNode10[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7 ]
         ,  ZNode10[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3.application(context), t4.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t5.application(context), t6.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t7.application(context), t8.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), t9.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8), t10.application(context))(PlusInstanceTuple10.nodeContextNum8)
                }
            }
}
