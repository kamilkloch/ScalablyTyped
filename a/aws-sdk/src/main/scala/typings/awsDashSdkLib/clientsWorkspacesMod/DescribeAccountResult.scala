package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountResult extends js.Object {
  /**
    * The IP address range, specified as an IPv4 CIDR block, used for the management network interface. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined
  /**
    * The status of BYOL (whether BYOL is enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
}

object DescribeAccountResult {
  @scala.inline
  def apply(
    DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange = null,
    DedicatedTenancySupport: DedicatedTenancySupportResultEnum = null
  ): DescribeAccountResult = {
    val __obj = js.Dynamic.literal()
    if (DedicatedTenancyManagementCidrRange != null) __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(DedicatedTenancyManagementCidrRange)
    if (DedicatedTenancySupport != null) __obj.updateDynamic("DedicatedTenancySupport")(DedicatedTenancySupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountResult]
  }
}

