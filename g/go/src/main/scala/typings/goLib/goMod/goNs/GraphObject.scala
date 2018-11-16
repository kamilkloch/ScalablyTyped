package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This is the abstract base class for all graphical objects.
    */
@js.native
trait GraphObject extends js.Object {
  /**This read-only property returns the bounds of this GraphObject in container coordinates.*/
  var actualBounds: Rect = js.native
  /**Gets or sets the alignment Spot of this GraphObject used in Panel layouts, to determine where in the area allocated by the panel this object should be placed.*/
  var alignment: Spot = js.native
  /**Gets or sets the spot on this GraphObject to be used as the alignment point in Spot and Fixed Panels.*/
  var alignmentFocus: Spot = js.native
  /**Gets or sets the angle transform, in degrees, of this GraphObject.*/
  var angle: scala.Double = js.native
  /**Gets or sets the areaBackground Brush (or CSS color string) of this GraphObject.*/
  var areaBackground: BrushLike = js.native
  /**Gets or sets the background Brush (or CSS color string) of this GraphObject, filling the rectangle of this object's local coordinate space.*/
  var background: BrushLike = js.native
  /**Gets or sets the column of this GraphObject if it is in a Table Panel.*/
  var column: scala.Double = js.native
  /**Gets or sets the number of columns spanned by this GraphObject if it is in a Table Panel.*/
  var columnSpan: scala.Double = js.native
  /**This Adornment is shown upon a context click on this object.*/
  var contextMenu: Adornment = js.native
  /**Gets or sets the mouse cursor to use when the mouse is over this object with no mouse buttons pressed.*/
  var cursor: java.lang.String = js.native
  /**Gets or sets the desired size of this GraphObject in local coordinates.*/
  var desiredSize: Size = js.native
  /**This read-only property returns the Diagram that this GraphObject is in, if it is.*/
  var diagram: Diagram = js.native
  /**Gets or sets how the direction of the last segment of a link coming from this port is computed when the node is rotated.*/
  var fromEndSegmentDirection: EnumValue = js.native
  /**Gets or sets the length of the last segment of a link coming from this port.*/
  var fromEndSegmentLength: scala.Double = js.native
  /**Gets or sets whether the user may draw Links from this port. The value must be either a boolean or null.*/
  var fromLinkable: scala.Boolean = js.native
  /**Gets or sets whether the user may draw duplicate Links from this port.*/
  var fromLinkableDuplicates: scala.Boolean = js.native
  /**Gets or sets whether the user may draw Links that connect from this port's Node.*/
  var fromLinkableSelfNode: scala.Boolean = js.native
  /**Gets or sets the maximum number of links that may come out of this port.*/
  var fromMaxLinks: scala.Double = js.native
  /**Gets or sets how far the end segment of a link coming from this port stops short of the actual port.*/
  var fromShortLength: scala.Double = js.native
  /**Gets or sets where a link should connect from this port.*/
  var fromSpot: Spot = js.native
  /**Gets or sets the desired height of this GraphObject in local coordinates.*/
  var height: scala.Double = js.native
  /**This property determines whether or not this GraphObject's events occur before all other events, including selection.*/
  var isActionable: scala.Boolean = js.native
  /**Gets or sets whether a GraphObject is the "main" object for some types of Panel.*/
  var isPanelMain: scala.Boolean = js.native
  /**This read-only property returns the GraphObject's containing Layer, if there is any.*/
  var layer: Layer = js.native
  /**Gets or sets the size of empty area around this GraphObject, as a Margin (or number for a uniform Margin), in the containing Panel coordinates.*/
  var margin: MarginLike = js.native
  /**Gets or sets the maximum size of this GraphObject in container coordinates (either a Panel or the document).*/
  var maxSize: Size = js.native
  /**This read-only property returns the measuredBounds of the GraphObject in container coordinates (either a Panel or the document).*/
  var measuredBounds: Rect = js.native
  /**Gets or sets the minimum size of this GraphObject in container coordinates (either a Panel or the document).*/
  var minSize: Size = js.native
  /**Gets or sets the name for this object.*/
  var name: java.lang.String = js.native
  /**This read-only property returns the natural bounding rectangle of this GraphObject in local coordinates, before any transformation by .scale or .angle, and before any resizing due to .minSize or .maxSize or .stretch.*/
  var naturalBounds: Rect = js.native
  /**Gets or sets the multiplicative opacity for this GraphObject and (if a Panel) all nested elements.*/
  var opacity: scala.Double = js.native
  /**This read-only property returns the GraphObject's containing Panel, or null if this object is not in a Panel.*/
  var panel: Panel = js.native
  /**This read-only property returns the Part containing this object, if any.*/
  var part: Part = js.native
  /**Gets or sets whether or not this GraphObject can be chosen by visual "find" methods such as Diagram.findObjectAt.*/
  var pickable: scala.Boolean = js.native
  /**Gets or sets an identifier for an object acting as a port on a Node.*/
  var portId: java.lang.String = js.native
  /**Gets or sets the position of this GraphObject in container coordinates (either a Panel or the document).*/
  var position: Point = js.native
  /**Gets or sets the row of this GraphObject if it is in a Table Panel.*/
  var row: scala.Double = js.native
  /**Gets or sets the number of rows spanned by this GraphObject if it is in a Table Panel.*/
  var rowSpan: scala.Double = js.native
  /**Gets or sets the scale transform of this GraphObject.*/
  var scale: scala.Double = js.native
  /**Gets or sets the fractional distance along a segment of a GraphObject that is in a Link.*/
  var segmentFraction: scala.Double = js.native
  /**Gets or sets the segment index of a GraphObject that is in a Link.*/
  var segmentIndex: scala.Double = js.native
  /**Gets or sets the offset of a GraphObject that is in a Link from a point on a segment.*/
  var segmentOffset: Point = js.native
  /**Gets or sets the orientation of a GraphObject that is in a Link.*/
  var segmentOrientation: EnumValue = js.native
  /**Gets or sets the stretch of the GraphObject.*/
  var stretch: EnumValue = js.native
  /**Gets or sets how the direction of the last segment of a link going to this port is computed when the node is rotated.*/
  var toEndSegmentDirection: EnumValue = js.native
  /**Gets or sets the length of the last segment of a link going to this port.*/
  var toEndSegmentLength: scala.Double = js.native
  /**Gets or sets whether the user may draw Links to this port. The value must be either a boolean or null.*/
  var toLinkable: scala.Boolean = js.native
  /**Gets or sets whether the user may draw duplicate Links to this port.*/
  var toLinkableDuplicates: scala.Boolean = js.native
  /**Gets or sets whether the user may draw Links that connect to this port's Node.*/
  var toLinkableSelfNode: scala.Boolean = js.native
  /**Gets or sets the maximum number of links that may go into this port.*/
  var toMaxLinks: scala.Double = js.native
  /**Gets or sets how far the end segment of a link going to this port stops short of the actual port.*/
  var toShortLength: scala.Double = js.native
  /**Gets or sets where a link should connect to this port.*/
  var toSpot: Spot = js.native
  /**This Adornment is shown when the mouse hovers over this object.*/
  var toolTip: Adornment = js.native
  /**Gets or sets whether a GraphObject is visible.*/
  var visible: scala.Boolean = js.native
  /**Gets or sets the desired width of this GraphObject in local coordinates.*/
  var width: scala.Double = js.native
  /**Gets or sets the function to execute when the ActionTool is cancelled and this GraphObject's .isActionable is set to true.*/
  def actionCancel(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute on a mouse-down event when this GraphObject's .isActionable is set to true.*/
  def actionDown(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute on a mouse-move event when this GraphObject's .isActionable is set to true.*/
  def actionMove(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute on a mouse-up event when this GraphObject's .isActionable is set to true.*/
  def actionUp(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**
          * Add a data-binding of a property on this GraphObject to a property on a data object.
          * @param {Binding} binding
          */
  def bind(binding: Binding): scala.Unit = js.native
  /**Gets or sets the function to execute when the user single-primary-clicks on this object.*/
  def click(e: InputEvent, obj: GraphObject): scala.Unit = js.native
    // undocumented
  /* protected */ def cloneProtected(copy: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user single-secondary-clicks on this object.*/
  def contextClick(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**
          * Creates a deep copy of this GraphObject and returns it.
          */
  def copy(): GraphObject = js.native
  /**Gets or sets the function to execute when the user double-primary-clicks on this object.*/
  def doubleClick(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**
          * Returns the effective angle that the object is drawn at, in document coordinates.
          */
  def getDocumentAngle(): scala.Double = js.native
  /**
          * Returns the Point in document coordinates for a given Spot in this object's bounds.
          * @param {Spot} s a real Spot describing a location relative to the GraphObject.
          * @param {Point=} result an optional Point that is modified and returned.
          */
  def getDocumentPoint(s: Spot): Point = js.native
  /**
          * Returns the Point in document coordinates for a given Spot in this object's bounds.
          * @param {Spot} s a real Spot describing a location relative to the GraphObject.
          * @param {Point=} result an optional Point that is modified and returned.
          */
  def getDocumentPoint(s: Spot, result: Point): Point = js.native
  /**
          * Returns the total scale that the object is drawn at, in document coordinates.
          */
  def getDocumentScale(): scala.Double = js.native
  /**
          * Given a Point in document coordinates, returns a new Point in local coordinates.
          * @param {Point} p a Point in document coordinates.
          * @param {Point=} result an optional Point that is modified and returned.
          */
  def getLocalPoint(p: Point): Point = js.native
  /**
          * Given a Point in document coordinates, returns a new Point in local coordinates.
          * @param {Point} p a Point in document coordinates.
          * @param {Point=} result an optional Point that is modified and returned.
          */
  def getLocalPoint(p: Point, result: Point): Point = js.native
  /**
          * This predicate is true if this object is an element, perhaps indirectly, of the given panel.
          * @param {GraphObject} panel
          * or if it is contained by another panel that is contained by the given panel,
          * to any depth; false if the argument is null or is not a Panel.
          */
  def isContainedBy(panel: GraphObject): scala.Boolean = js.native
  /**
          * This predicate is true if this object is .visible and each of its visual containing panels are also visible.
          */
  def isVisibleObject(): scala.Boolean = js.native
  /**Gets or sets the function to execute when the user moves the mouse into this stationary object during a DraggingTool drag.*/
  def mouseDragEnter(e: InputEvent, obj: GraphObject, prev: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user moves the mouse out of this stationary object during a DraggingTool drag.*/
  def mouseDragLeave(e: InputEvent, obj: GraphObject, prev: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when a user drops the selection on this object at the end of a DraggingTool drag.*/
  def mouseDrop(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user moves the mouse into this object without holding down any buttons.*/
  def mouseEnter(e: InputEvent, obj: GraphObject, prev: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the diagram while holding down a button over this object.*/
  def mouseHold(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the diagram without holding down any buttons over this object.*/
  def mouseHover(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user moves the mouse into this object without holding down any buttons.*/
  def mouseLeave(e: InputEvent, obj: GraphObject, prev: GraphObject): scala.Unit = js.native
  /**Gets or sets the function to execute when the user moves the mouse over this object without holding down any buttons.*/
  def mouseOver(e: InputEvent, obj: GraphObject): scala.Unit = js.native
  /**
          * This method sets a collection of properties according to the property/value pairs that have been set on the given Object,
          * in the same manner as GraphObject.make does when constructing a GraphObject with an argument that is a simple JavaScript Object.
          */
  def setProperties(props: js.Object): scala.Unit = js.native
  def spanAllocation(obj: GraphObject, r: RowColumnDefinition, n: scala.Double): scala.Double = js.native
}
