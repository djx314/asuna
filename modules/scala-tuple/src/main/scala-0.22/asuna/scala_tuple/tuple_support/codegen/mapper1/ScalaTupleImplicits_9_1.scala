package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_9_1 {
         given  tupleTagApplicationImplicit_tagNum9_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9
        ]( given 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3] , t4: Application1[F, Tag4, Plus1_X4] , t5: Application1[F, Tag5, Plus1_X5] , t6: Application1[F, Tag6, Plus1_X6] , t7: Application1[F, Tag7, Plus1_X7] , t8: Application1[F, Tag8, Plus1_X8] , t9: Application1[F, Tag9, Plus1_X9]): Application1[
            F,
            Tuple9[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9],
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ] = new Application1[
            F,
            Tuple9[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9],
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ] {
            override def application(context: Context1[F]): F[
                Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
            ] = {
                val asunaTuple2F = Application1.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag9]))))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter9)
            }
        }
}
object ScalaTupleImplicits_9_1 extends ScalaTupleImplicits_9_1