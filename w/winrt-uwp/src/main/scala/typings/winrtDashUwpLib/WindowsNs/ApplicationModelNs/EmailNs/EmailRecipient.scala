package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipient")
@js.native
/** Initializes an instance of the EmailRecipient class. */
class EmailRecipient () extends js.Object {
  /**
    * Initializes an instance of the EmailRecipient class.
    * @param address The address of the recipient.
    */
  def this(address: java.lang.String) = this()
  /**
    * Initializes an instance of the EmailRecipient class.
    * @param address The address of the recipient.
    * @param name The name of the recipient.
    */
  def this(address: java.lang.String, name: java.lang.String) = this()
  /** Gets or sets the address of the email recipient. */
  var address: java.lang.String = js.native
  /** Gets or sets the name of the email recipient. */
  var name: java.lang.String = js.native
}

