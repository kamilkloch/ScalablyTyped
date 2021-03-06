package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to lock a floating object's anchor.
  */
trait ChangeFloatingObjectLockAnchorCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectLockAnchorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param lockAnchor true to lock the anchor; false, otherwise.
    */
  def execute(lockAnchor: scala.Boolean): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectLockAnchorCommand {
  @scala.inline
  def apply(execute: scala.Boolean => scala.Boolean, getState: () => js.Any): ChangeFloatingObjectLockAnchorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectLockAnchorCommand]
  }
}

