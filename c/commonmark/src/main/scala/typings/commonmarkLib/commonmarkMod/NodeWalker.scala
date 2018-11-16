package typings
package commonmarkLib.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeWalker extends js.Object {
  /**
       * Returns an object with properties entering and node. Returns null when we have finished walking the tree.
       */
  def next(): NodeWalkingStep = js.native
  /**
       * Resets the iterator to resume at the specified node and setting for entering. (Normally this isn't needed unless you do destructive updates to the Node tree.)
       */
  def resumeAt(node: Node): scala.Unit = js.native
  /**
       * Resets the iterator to resume at the specified node and setting for entering. (Normally this isn't needed unless you do destructive updates to the Node tree.)
       */
  def resumeAt(node: Node, entering: scala.Boolean): scala.Unit = js.native
}
