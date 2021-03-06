package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def extend[A, B](ea: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object Extend {
  @scala.inline
  def apply[F](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Extend[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend[F]]
  }
}

