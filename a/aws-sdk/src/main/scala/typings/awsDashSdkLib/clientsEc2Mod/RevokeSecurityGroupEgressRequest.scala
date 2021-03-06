package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeSecurityGroupEgressRequest extends js.Object {
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the security group.
    */
  var GroupId: String
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}

object RevokeSecurityGroupEgressRequest {
  @scala.inline
  def apply(
    GroupId: String,
    CidrIp: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    FromPort: js.UndefOr[Integer] = js.undefined,
    IpPermissions: IpPermissionList = null,
    IpProtocol: String = null,
    SourceSecurityGroupName: String = null,
    SourceSecurityGroupOwnerId: String = null,
    ToPort: js.UndefOr[Integer] = js.undefined
  ): RevokeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort)
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions)
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol)
    if (SourceSecurityGroupName != null) __obj.updateDynamic("SourceSecurityGroupName")(SourceSecurityGroupName)
    if (SourceSecurityGroupOwnerId != null) __obj.updateDynamic("SourceSecurityGroupOwnerId")(SourceSecurityGroupOwnerId)
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort)
    __obj.asInstanceOf[RevokeSecurityGroupEgressRequest]
  }
}

