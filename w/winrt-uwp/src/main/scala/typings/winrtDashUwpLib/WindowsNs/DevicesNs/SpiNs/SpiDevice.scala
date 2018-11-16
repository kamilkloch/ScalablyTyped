package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device connected through the SPI bus. */
@JSGlobal("Windows.Devices.Spi.SpiDevice")
@js.native
abstract class SpiDevice () extends js.Object {
  /** Gets the connection settings for the device. */
  var connectionSettings: SpiConnectionSettings = js.native
  /** Gets the unique ID associated with the device. */
  var deviceId: java.lang.String = js.native
  /** Closes the connection to the device. */
  def close(): scala.Unit = js.native
  /**
                   * Reads from the connected device.
                   * @return Array containing data read from the device.
                   */
  def read(): js.Array[scala.Double] = js.native
  /**
                   * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
                   * @param writeBuffer Array containing data to write to the device.
                   * @return Array containing data read from the device.
                   */
  def transferFullDuplex(writeBuffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
                   * Transfer data sequentially to the device.
                   * @param writeBuffer Array containing data to write to the device.
                   * @return Array containing data read from the device.
                   */
  def transferSequential(writeBuffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
                   * Writes to the connected device.
                   * @param buffer Array containing the data to write to the device.
                   */
  def write(buffer: js.Array[scala.Double]): scala.Unit = js.native
}

/** Represents a device connected through the SPI bus. */
@JSGlobal("Windows.Devices.Spi.SpiDevice")
@js.native
object SpiDevice extends js.Object {
  /**
                   * Opens a device with the connection settings provided.
                   * @param busId The id of the bus.
                   * @param settings The connection settings.
                   * @return The SPI device requested.
                   */
  def fromIdAsync(busId: java.lang.String, settings: winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiConnectionSettings): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiDevice] = js.native
  /**
                   * Retrieves the info about a certain bus.
                   * @param busId The id of the bus.
                   * @return The bus info requested.
                   */
  def getBusInfo(busId: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiBusInfo = js.native
  /**
                   * Gets all the SPI buses found on the system.
                   * @return String containing all the buses found on the system.
                   */
  def getDeviceSelector(): java.lang.String = js.native
  /**
                   * Gets all the SPI buses found on the system that match the input parameter.
                   * @param friendlyName Input parameter specifying an identifying name for the desired bus. This usually corresponds to a name on the schematic.
                   * @return String containing all the buses that have the input in the name.
                   */
  def getDeviceSelector(friendlyName: java.lang.String): java.lang.String = js.native
}
