package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Rich Communication Services (RCS) end user message. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessage")
@js.native
abstract class RcsEndUserMessage () extends js.Object {
  /** Gets the actions to which the user can respond. */
  var actions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[RcsEndUserMessageAction] = js.native
  /** Gets a Boolean value that specifies whether a PIN is required to be sent back with the response. */
  var isPinRequired: scala.Boolean = js.native
  /** Gets the contents of the message. */
  var text: java.lang.String = js.native
  /** Gets the title of the message. */
  var title: java.lang.String = js.native
  /** Gets the ID of the transport where this message originated. */
  var transportId: java.lang.String = js.native
  /**
    * Asynchronously sends the user's selection back.
    * @param action Specifies the label of the action.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseAsync(action: RcsEndUserMessageAction): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sends the user's selection back with the specified PIN.
    * @param action Specifies the label of the action.
    * @param pin The PIN to send.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseWithPinAsync(action: RcsEndUserMessageAction, pin: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

