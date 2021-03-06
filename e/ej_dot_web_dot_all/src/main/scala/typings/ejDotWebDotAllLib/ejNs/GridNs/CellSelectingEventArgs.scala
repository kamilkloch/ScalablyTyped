package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selected cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while selecting cell
    */
  var isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns whether the shift key is pressed while selecting cell
    */
  var isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell element.
    */
  var previousRowCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell index value.
    */
  var previousRowCellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    currentCell: js.Any = null,
    data: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    previousRowCell: js.Any = null,
    previousRowCellIndex: scala.Int | scala.Double = null,
    selectedData: js.Any = null,
    `type`: java.lang.String = null
  ): CellSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed)
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousRowCell != null) __obj.updateDynamic("previousRowCell")(previousRowCell)
    if (previousRowCellIndex != null) __obj.updateDynamic("previousRowCellIndex")(previousRowCellIndex.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellSelectingEventArgs]
  }
}

