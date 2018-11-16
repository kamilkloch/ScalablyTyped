package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an event that a Windows Runtime app can trigger to initiate a long-running operation with a device or sensor. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceUseTrigger")
@js.native
class DeviceUseTrigger () extends js.Object {
  /**
                   * Triggers the background task and returns a DeviceTriggerResult indicating success or failure of the trigger request. Takes the DeviceInformation.ID of the device or sensor that the background task will access.
                   * @param deviceId The DeviceInformation.ID of the device or sensor that the background task will access.
                   * @return This method returns a DeviceTriggerResult when it completes asynchronously.
                   */
  def requestAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceTriggerResult] = js.native
  /**
                   * Triggers the background task and returns a DeviceTriggerResult indicating success or failure of the trigger request. Takes the DeviceInformation.ID of the device or sensor that the background task will access, and an optional app-specific string passed to the background task identifying which operation to perform.
                   * @param deviceId The DeviceInformation.ID of the device or sensor that the background task will access.
                   * @param arguments Optional value. A string specified by your app and passed to the background task, identifying which operation to perform.
                   * @return This method returns a DeviceTriggerResult when it completes asynchronously.
                   */
  def requestAsync(deviceId: java.lang.String, args: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceTriggerResult] = js.native
}
