package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains updated properties for a DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationUpdate")
@js.native
abstract class DeviceInformationUpdate () extends js.Object {
  /** The DeviceInformation ID of the updated device. */
  var id: java.lang.String = js.native
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind = js.native
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
}
