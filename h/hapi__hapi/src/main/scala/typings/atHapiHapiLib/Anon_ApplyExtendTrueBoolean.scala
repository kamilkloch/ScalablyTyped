package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyExtendTrueBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[scala.Boolean] = js.undefined
  var extend: atHapiHapiLib.atHapiHapiLibNumbers.`true`
}

object Anon_ApplyExtendTrueBoolean {
  @scala.inline
  def apply(extend: atHapiHapiLib.atHapiHapiLibNumbers.`true`, apply: js.UndefOr[scala.Boolean] = js.undefined): Anon_ApplyExtendTrueBoolean = {
    val __obj = js.Dynamic.literal(extend = extend)
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply)
    __obj.asInstanceOf[Anon_ApplyExtendTrueBoolean]
  }
}

