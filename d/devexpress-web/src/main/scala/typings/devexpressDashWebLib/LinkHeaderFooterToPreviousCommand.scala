package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to link a header/footer to the previous section, so it has the same content.
  */
trait LinkHeaderFooterToPreviousCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the LinkHeaderFooterToPreviousCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object LinkHeaderFooterToPreviousCommand {
  @scala.inline
  def apply(execute: () => scala.Boolean, getState: () => SimpleCommandState): LinkHeaderFooterToPreviousCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[LinkHeaderFooterToPreviousCommand]
  }
}

