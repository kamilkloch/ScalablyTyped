package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
trait SendParams extends js.Object {
  var Messages: js.Array[SendParamsMessage]
  var SandboxMode: js.UndefOr[scala.Boolean] = js.undefined
}

object SendParams {
  @scala.inline
  def apply(Messages: js.Array[SendParamsMessage], SandboxMode: js.UndefOr[scala.Boolean] = js.undefined): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages)
    if (!js.isUndefined(SandboxMode)) __obj.updateDynamic("SandboxMode")(SandboxMode)
    __obj.asInstanceOf[SendParams]
  }
}

