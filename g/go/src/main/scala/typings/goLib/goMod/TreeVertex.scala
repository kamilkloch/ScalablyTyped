package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds TreeLayout-specific information about Nodes.*/
@JSImport("go", "TreeVertex")
@js.native
class TreeVertex () extends LayoutVertex {
  /**Gets or sets how this parent node should be aligned relative to its children.*/
  var alignment: EnumValue = js.native
  /**Gets or sets the actual absolute angle at which this node should grow.*/
  var angle: scala.Double = js.native
  /**Gets or sets how broad a node and its descendants should be.*/
  var breadthLimit: scala.Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot, if .setsChildPortSpot is true and the node has only a single port.*/
  var childPortSpot: Spot = js.native
  /**Gets or sets the logical children for this node.*/
  var children: js.Array[TreeVertex] = js.native
  /**This read-only property returns the number of immediate children this node has.*/
  var childrenCount: scala.Double = js.native
  /**Gets or sets the space to leave between the node and the comments.*/
  var commentMargin: scala.Double = js.native
  /**Gets or sets the space to leave between consecutive comments.*/
  var commentSpacing: scala.Double = js.native
  /**Gets or sets an array of Nodes that will be positioned near this node.*/
  var comments: js.Array[Node] = js.native
  /**Gets or sets how the children of this node should be packed together.*/
  var compaction: EnumValue = js.native
  /**Gets or sets the number of descendants this node has.*/
  var descendantCount: scala.Double = js.native
  /**Gets or sets whether this node has been initialized as part of TreeLayout.doLayout when building the tree structures.*/
  var initialized: scala.Boolean = js.native
  /**Gets or sets the distance between this node and its children.*/
  var layerSpacing: scala.Double = js.native
  /**Gets or sets the fraction of this node's depth that may overlap with the children's layer.*/
  var layerSpacingParentOverlap: scala.Double = js.native
  /**Gets or sets the number of single-parent ancestors this node has.*/
  var level: scala.Double = js.native
  /**Gets or sets the maximum number of children of any descendant of this node.*/
  var maxChildrenCount: scala.Double = js.native
  /**Gets or sets the maximum depth of the subtrees below this node.*/
  var maxGenerationCount: scala.Double = js.native
  /**Gets or sets the distance the first child should be indented.*/
  var nodeIndent: scala.Double = js.native
  /**Gets or sets whether the first child should be indented past the parent node's breadth.*/
  var nodeIndentPastParent: scala.Double = js.native
  /**Gets or sets the distance between child nodes.*/
  var nodeSpacing: scala.Double = js.native
  /**Gets or sets the logical parent for this node.*/
  var parent: TreeVertex = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot, if .setsPortSpot is true and the node has only a single port.*/
  var portSpot: Spot = js.native
  /**Gets or sets the position of this node relative to its parent node.*/
  var relativePosition: Point = js.native
  /**Gets or sets the distance the first child of each row should be indented.*/
  var rowIndent: scala.Double = js.native
  /**Gets or sets the distance between rows within one layer, all sharing the same parent.*/
  var rowSpacing: scala.Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var setsChildPortSpot: scala.Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var setsPortSpot: scala.Boolean = js.native
  /**Gets or sets whether and in what order the children should be sorted.*/
  var sorting: EnumValue = js.native
  /**Gets or sets the offset of this parent node relative to its whole subtree.*/
  var subtreeOffset: Point = js.native
  /**Gets or sets the size of the subtree (including all descendants) parented by this node.*/
  var subtreeSize: Size = js.native
  /**Gets or sets how the children should be sorted.*/
  def comparer(a: TreeVertex, b: TreeVertex): scala.Double = js.native
  /**
    * Copy inherited properties from another TreeVertex to this one.
    * @param {TreeVertex} copy
    */
  def copyInheritedPropertiesFrom(copy: TreeVertex): scala.Unit = js.native
}

