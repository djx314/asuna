package asuna
import scala.language.higherKinds
trait Application8[F[_, _, _, _, _, _, _, _], Tag, X1, X2, X3, X4, X5, X6, X7, X8] extends Any {
  def application(context: Context8[F]): F[X1, X2, X3, X4, X5, X6, X7, X8]
}
