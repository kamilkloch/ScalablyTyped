package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseLeaveData extends js.Object {
  var event: stdLib.Event
  var node: InternalTreeNode
}

object OnMouseLeaveData {
  @scala.inline
  def apply(event: stdLib.Event, node: InternalTreeNode): OnMouseLeaveData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnMouseLeaveData]
  }
}

