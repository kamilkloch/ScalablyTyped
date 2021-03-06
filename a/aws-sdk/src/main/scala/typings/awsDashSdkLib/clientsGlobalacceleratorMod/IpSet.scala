package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpSet extends js.Object {
  /**
    * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
    */
  var IpAddresses: js.UndefOr[IpAddresses] = js.undefined
  /**
    * The types of IP addresses included in this IP set.
    */
  var IpFamily: js.UndefOr[GenericString] = js.undefined
}

object IpSet {
  @scala.inline
  def apply(IpAddresses: IpAddresses = null, IpFamily: GenericString = null): IpSet = {
    val __obj = js.Dynamic.literal()
    if (IpAddresses != null) __obj.updateDynamic("IpAddresses")(IpAddresses)
    if (IpFamily != null) __obj.updateDynamic("IpFamily")(IpFamily)
    __obj.asInstanceOf[IpSet]
  }
}

