package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyNetworkInterfaceAttributeRequest extends js.Object {
  /**
    * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify the ID of the interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.undefined
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Changes the security groups for the network interface. The new set of groups you specify replaces the current set. You must specify at least one group, even if it's just the default security group in the VPC. You must specify the ID of the security group, not the name.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
  /**
    * Indicates whether source/destination checking is enabled. A value of true means checking is enabled, and false means checking is disabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
}

object ModifyNetworkInterfaceAttributeRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    Attachment: NetworkInterfaceAttachmentChanges = null,
    Description: AttributeValue = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Groups: SecurityGroupIdStringList = null,
    SourceDestCheck: AttributeBooleanValue = null
  ): ModifyNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId)
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    __obj.asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
  }
}

