package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to format a current paragraph with double line spacing.
  */
trait SetDoubleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetDoubleParagraphSpacingCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object SetDoubleParagraphSpacingCommand {
  @scala.inline
  def apply(execute: () => scala.Boolean, getState: () => js.Any): SetDoubleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[SetDoubleParagraphSpacingCommand]
  }
}

