package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceIpv6Address extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}

object NetworkInterfaceIpv6Address {
  @scala.inline
  def apply(Ipv6Address: String = null): NetworkInterfaceIpv6Address = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address)
    __obj.asInstanceOf[NetworkInterfaceIpv6Address]
  }
}

