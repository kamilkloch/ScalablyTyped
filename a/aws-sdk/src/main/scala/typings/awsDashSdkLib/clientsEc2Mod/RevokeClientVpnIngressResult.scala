package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeClientVpnIngressResult extends js.Object {
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.undefined
}

object RevokeClientVpnIngressResult {
  @scala.inline
  def apply(Status: ClientVpnAuthorizationRuleStatus = null): RevokeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[RevokeClientVpnIngressResult]
  }
}

