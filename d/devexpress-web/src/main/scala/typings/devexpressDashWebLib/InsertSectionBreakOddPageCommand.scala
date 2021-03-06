package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a section break and start a new section on the next odd-numbered page.
  */
trait InsertSectionBreakOddPageCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertSectionBreakOddPageCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object InsertSectionBreakOddPageCommand {
  @scala.inline
  def apply(execute: () => scala.Boolean, getState: () => SimpleCommandState): InsertSectionBreakOddPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[InsertSectionBreakOddPageCommand]
  }
}

