package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSecurityGroupRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the security group. Required for a nondefault VPC.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the security group ID.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object DeleteSecurityGroupRequest {
  @scala.inline
  def apply(DryRun: js.UndefOr[Boolean] = js.undefined, GroupId: String = null, GroupName: String = null): DeleteSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[DeleteSecurityGroupRequest]
  }
}

