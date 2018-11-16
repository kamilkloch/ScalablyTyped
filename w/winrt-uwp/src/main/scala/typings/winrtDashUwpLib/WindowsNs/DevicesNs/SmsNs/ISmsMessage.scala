package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is implemented by all types of SMS messages that are supported. */

trait ISmsMessage extends js.Object {
  /** Retrieves an ID for the message, which can later be specified in calling message store methods in order to get or delete the message. */
  var id: scala.Double
  /** Returns the message class, as determined by the operator's message network. The two most common classes are None (normal message) or Class0 (special operator message, such as a roaming warning that must be shown immediately to the user). A typical client for end-user messages ignores Class0 messages. */
  var messageClass: SmsMessageClass
}
