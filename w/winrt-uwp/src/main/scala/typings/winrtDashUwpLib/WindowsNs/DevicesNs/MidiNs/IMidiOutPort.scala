package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single MIDI out port. */
trait IMidiOutPort
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /** Gets the ID of the device that contains the MIDI out port. */
  var deviceId: java.lang.String
  /**
    * Sends the contents of the buffer through the MIDI out port.
    * @param midiData The data to send to the device.
    */
  def sendBuffer(midiData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  def sendMessage(midiMessage: IMidiMessage): scala.Unit
}

object IMidiOutPort {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    deviceId: java.lang.String,
    sendBuffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer => scala.Unit,
    sendMessage: IMidiMessage => scala.Unit
  ): IMidiOutPort = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceId = deviceId, sendBuffer = js.Any.fromFunction1(sendBuffer), sendMessage = js.Any.fromFunction1(sendMessage))
  
    __obj.asInstanceOf[IMidiOutPort]
  }
}

