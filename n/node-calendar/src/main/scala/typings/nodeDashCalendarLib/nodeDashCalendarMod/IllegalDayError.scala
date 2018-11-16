package typings
package nodeDashCalendarLib.nodeDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-calendar", "IllegalDayError")
@js.native
class IllegalDayError ()
  extends stdLib.Error {
  /**
  		 * @param {string} message
  		 *  Optional custom error message.
  		 */
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}
