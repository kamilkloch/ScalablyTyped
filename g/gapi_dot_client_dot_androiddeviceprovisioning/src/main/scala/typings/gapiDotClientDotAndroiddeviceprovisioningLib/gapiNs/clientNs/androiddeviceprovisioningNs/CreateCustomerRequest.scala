package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateCustomerRequest extends js.Object {
  /**
               * Required. The company data to populate the new customer. Must contain a
               * value for `companyName` and at least one `owner_email` that's associated
               * with a Google Account. The values for `companyId` and `name` must be empty.
               */
  var customer: js.UndefOr[Company] = js.undefined
}
