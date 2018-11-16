package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NewDeviceEvent extends js.Object {
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifies the extent to which the device is controlled by an Android EMM in various deployment configurations.
               *
               * Possible values include:
               * - "managedDevice", a device where the DPC is set as device owner,
               * - "managedProfile", a device where the DPC is set as profile owner.
               */
  var managementType: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}
