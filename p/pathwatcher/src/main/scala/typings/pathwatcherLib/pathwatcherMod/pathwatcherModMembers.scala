package typings
package pathwatcherLib.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathwatcher", JSImport.Namespace)
@js.native
object pathwatcherModMembers extends js.Object {
  def closeAllWatchers(): scala.Unit = js.native
  def getWatchedPaths(): js.Array[java.lang.String] = js.native
  def watch(): PathWatcher = js.native
}
