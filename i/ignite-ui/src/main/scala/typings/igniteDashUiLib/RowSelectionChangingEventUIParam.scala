package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectionChangingEventUIParam extends js.Object {
  /**
  	 * Gets the end index for a range row selection.
  	 */
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the row object.
  	 */
  var row: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to rows object array.
  	 */
  var selectedRows: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the start index for a range row selection.
  	 */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object RowSelectionChangingEventUIParam {
  @scala.inline
  def apply(
    endIndex: scala.Int | scala.Double = null,
    owner: js.Any = null,
    row: js.Any = null,
    selectedRows: js.Array[_] = null,
    startIndex: scala.Int | scala.Double = null
  ): RowSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (row != null) __obj.updateDynamic("row")(row)
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionChangingEventUIParam]
  }
}

