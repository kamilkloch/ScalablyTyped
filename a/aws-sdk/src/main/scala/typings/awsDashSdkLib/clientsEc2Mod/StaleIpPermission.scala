package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaleIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The IP protocol name (for tcp, udp, and icmp) or number (see Protocol Numbers).
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  /**
    * The IP ranges. Not applicable for stale security group rules.
    */
  var IpRanges: js.UndefOr[IpRanges] = js.undefined
  /**
    * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdSet] = js.undefined
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
  /**
    * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the VPC peering connection.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.undefined
}

object StaleIpPermission {
  @scala.inline
  def apply(
    FromPort: js.UndefOr[Integer] = js.undefined,
    IpProtocol: String = null,
    IpRanges: IpRanges = null,
    PrefixListIds: PrefixListIdSet = null,
    ToPort: js.UndefOr[Integer] = js.undefined,
    UserIdGroupPairs: UserIdGroupPairSet = null
  ): StaleIpPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort)
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol)
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges)
    if (PrefixListIds != null) __obj.updateDynamic("PrefixListIds")(PrefixListIds)
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort)
    if (UserIdGroupPairs != null) __obj.updateDynamic("UserIdGroupPairs")(UserIdGroupPairs)
    __obj.asInstanceOf[StaleIpPermission]
  }
}

