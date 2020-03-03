package asuna.scala_tuple.tuple_support
import asuna.Application6
import asuna.Context6
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_2_6 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum6[
            F[_ , _ , _ , _ , _ , _],
            Tag1 , Tag2,
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2,
            Plus5_X1 , Plus5_X2,
            Plus6_X1 , Plus6_X2
        ]( given 
        t1: Application6[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1] , t2: Application6[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2]): Application6[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2]
        ] = new Application6[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2]
        ] {
            override def application(context: Context6[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2],
                Tuple2[Plus2_X1 , Plus2_X2],
                Tuple2[Plus3_X1 , Plus3_X2],
                Tuple2[Plus4_X1 , Plus4_X2],
                Tuple2[Plus5_X1 , Plus5_X2],
                Tuple2[Plus6_X1 , Plus6_X2]
            ] = {
                context.append(t2.application(context), t1.application(context))(PlusToTuple6.plus6WithTypeParameter2)
            }
        }
}
object ScalaTupleImplicits_2_6 extends ScalaTupleImplicits_2_6