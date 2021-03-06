package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHsmResponse extends js.Object {
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[Hsm] = js.undefined
}

object CreateHsmResponse {
  @scala.inline
  def apply(Hsm: Hsm = null): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (Hsm != null) __obj.updateDynamic("Hsm")(Hsm)
    __obj.asInstanceOf[CreateHsmResponse]
  }
}

