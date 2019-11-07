package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_3_5 {
  final implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    H2,
    H3,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5]
  ): Application5[F, (H1, H2, H3), (X1_C1, X2_C1, X3_C1), (X1_C2, X2_C2, X3_C2), (X1_C3, X2_C3, X3_C3), (X1_C4, X2_C4, X3_C4), (X1_C5, X2_C5, X3_C5)] = {
    context: Context5[F] =>
      context.append(context.append(t3.application(context), t2.application(context))(HListPlus5.plusWithTypeParameter1), t1.application(context))(
        PlusToTuple5.plusWithTypeParameter2
      )
  }
}
