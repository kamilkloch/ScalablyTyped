package typings
package falcorLib.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Scheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): Scheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): Scheduler
}
