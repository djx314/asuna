package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_7_4 {
         given  tupleTagApplicationImplicit_tagNum7_typeParamNum4[
            F[_ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7
        ]( given 
        t1: Application4[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: Application4[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: Application4[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4] , t5: Application4[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5] , t6: Application4[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6] , t7: Application4[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7]): Application4[
            F,
            Tuple7[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7],
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]
        ] = new Application4[
            F,
            Tuple7[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7],
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]
        ] {
            override def application(context: Context4[F]): F[
                Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
                Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
                Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
                Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]
            ] = {
                val asunaTuple2F = Application4.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7])))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple4.plus4WithTypeParameter7)
            }
        }
}
object ScalaTupleImplicits_7_4 extends ScalaTupleImplicits_7_4