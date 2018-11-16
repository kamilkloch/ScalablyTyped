package typings
package fpDashTsLib.libConstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Const", JSImport.Namespace)
@js.native
object libConstModMembers extends js.Object {
  val URI: /* Const */ java.lang.String = js.native
  val `const_`: fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libContravariantMod.Contravariant2[URI] = js.native
  val getApplicative: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, js.Any]
  ] = js.native
  val getApply: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, js.Any]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[Const[js.Any, js.Any]]
  ] = js.native
}
