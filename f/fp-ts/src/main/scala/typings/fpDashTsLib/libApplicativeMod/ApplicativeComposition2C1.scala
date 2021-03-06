package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicativeComposition2C1[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition2C1[F, G, LF] {
  def ap[A, B](
    fgab: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Function1[/* a */ A, B]]],
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, B]]
  def of[A](a: A): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]]
}

object ApplicativeComposition2C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](
    ap: (fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Function1[js.Any, js.Any]]], fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]) => fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
  ): ApplicativeComposition2C1[F, G, LF] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ApplicativeComposition2C1[F, G, LF]]
  }
}

