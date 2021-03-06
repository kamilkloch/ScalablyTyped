package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeState extends js.Object {
  // Id of the currently dragged item
  var draggedItemId: ItemId
  /** The flattened tree data structure transformed from props.tree */
  var flattenedTree: atAtlaskitTreeLib.FlattenedTree
}

object TreeState {
  @scala.inline
  def apply(draggedItemId: ItemId, flattenedTree: atAtlaskitTreeLib.FlattenedTree): TreeState = {
    val __obj = js.Dynamic.literal(draggedItemId = draggedItemId, flattenedTree = flattenedTree)
  
    __obj.asInstanceOf[TreeState]
  }
}

