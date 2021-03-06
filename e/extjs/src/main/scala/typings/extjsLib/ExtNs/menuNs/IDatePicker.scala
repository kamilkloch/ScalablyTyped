package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.picker.Date) */
  var picker: js.UndefOr[extjsLib.ExtNs.pickerNs.IDate] = js.undefined
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[java.lang.String] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    IMenu: IMenu = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    picker: extjsLib.ExtNs.pickerNs.IDate = null,
    pickerId: java.lang.String = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMenu)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (pickerId != null) __obj.updateDynamic("pickerId")(pickerId)
    __obj.asInstanceOf[IDatePicker]
  }
}

