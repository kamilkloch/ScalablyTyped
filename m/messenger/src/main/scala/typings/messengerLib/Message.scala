package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): scala.Unit
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): scala.Unit
  /**
    * Show the message, if it's hidden.
    */
  def show(): scala.Unit
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): scala.Unit
}

object Message {
  @scala.inline
  def apply(
    cancel: () => scala.Unit,
    hide: () => scala.Unit,
    show: () => scala.Unit,
    update: MessageOptions => scala.Unit
  ): Message = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Message]
  }
}

