package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for modifying exposure levels of captured photos. */
@JSGlobal("Windows.Media.Devices.ExposureCompensationControl")
@js.native
abstract class ExposureCompensationControl () extends js.Object {
  /** Gets the maximum exposure time. */
  var max: scala.Double = js.native
  /** Gets the minimum exposure time. */
  var min: scala.Double = js.native
  /** Gets the smallest exposure compensation increment supported by the capture device. */
  var step: scala.Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure compensation control. */
  var supported: scala.Boolean = js.native
  /** Gets the exposure compensation level. */
  var value: scala.Double = js.native
  /**
    * Asynchronously sets the exposure compensation.
    * @param value The exposure compensation level to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(value: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

