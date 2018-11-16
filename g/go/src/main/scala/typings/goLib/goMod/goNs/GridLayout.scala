package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
    * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
    */
@js.native
trait GridLayout extends Layout {
  /**Gets or sets whether the Part.location or the position should be used to arrange each part.*/
  var alignment: EnumValue = js.native
  /**Gets or sets how to arrange the parts.*/
  var arrangement: EnumValue = js.native
  /**Gets or sets the minimum part size by which each part is positioned in the grid.*/
  var cellSize: Size = js.native
  /**Gets or sets what order to place the parts.*/
  var sorting: EnumValue = js.native
  /**Gets or sets the minimum horizontal and vertical space between parts.*/
  var spacing: Size = js.native
  /**Gets or sets the maximum number of columns.*/
  var wrappingColumn: scala.Double = js.native
  /**Gets or sets the wrapping width.*/
  var wrappingWidth: scala.Double = js.native
  /**Gets or sets the comparison function used to sort the parts.*/
  def comparer(a: Part, b: Part): scala.Double = js.native
}
