package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePolicyResponse extends js.Object {
  /**
    * A structure that contains details about the specified policy.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object DescribePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): DescribePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[DescribePolicyResponse]
  }
}

