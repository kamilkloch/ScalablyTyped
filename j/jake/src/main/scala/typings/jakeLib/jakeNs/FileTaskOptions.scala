package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileTaskOptions extends js.Object {
  /**
  		 * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 * @default false
  		 */
  var async: js.UndefOr[scala.Boolean] = js.undefined
}
