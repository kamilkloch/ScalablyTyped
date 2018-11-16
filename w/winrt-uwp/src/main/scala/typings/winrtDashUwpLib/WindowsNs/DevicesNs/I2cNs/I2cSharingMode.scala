package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2cSharingMode extends js.Object

/** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
@JSGlobal("Windows.Devices.I2c.I2cSharingMode")
@js.native
object I2cSharingMode extends js.Object {
  /** Connects to the I²C bus address exclusively, so that no other connection to the I²C bus address can be made while you remain connected. This mode is the default mode. */
  @js.native
  sealed trait exclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cSharingMode
  
  /** Connects to the I²C bus address in shared mode, so that other connections to the I²C bus address can be made while you remain connected. */
  @js.native
  sealed trait shared
    extends winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cSharingMode
  
  val exclusive: exclusive with java.lang.String = js.native
  val shared: shared with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cSharingMode with java.lang.String] = js.native
}
