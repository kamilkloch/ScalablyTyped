package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnDragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the column data which is dragged
               */
  var draggedColumn: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the column being dragged
               */
  var draggedColumnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the control model values.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the event Type.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
