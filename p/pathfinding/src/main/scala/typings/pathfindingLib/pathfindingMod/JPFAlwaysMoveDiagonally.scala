package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPFAlwaysMoveDiagonally extends JumpPointFinderBase

@JSImport("pathfinding", "JPFAlwaysMoveDiagonally")
@js.native
class JPFAlwaysMoveDiagonallyCls () extends JPFAlwaysMoveDiagonally {
  def this(opt: JumpPointFinderBaseOptions) = this()
  /* CompleteClass */
  override def findPath(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double, matrix: Grid): js.Array[js.Array[scala.Double]] = js.native
}

