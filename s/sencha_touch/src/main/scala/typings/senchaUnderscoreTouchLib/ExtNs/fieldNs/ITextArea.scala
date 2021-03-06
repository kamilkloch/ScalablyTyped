package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: () => scala.Boolean = null,
    getComponent: () => _ = null,
    getMaxRows: () => scala.Double = null,
    getUi: () => java.lang.String = null,
    maxRows: scala.Int | scala.Double = null,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxRows: /* maxRows */ js.UndefOr[scala.Double] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    ui: java.lang.String = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(getAutoCapitalize))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getMaxRows != null) __obj.updateDynamic("getMaxRows")(js.Any.fromFunction0(getMaxRows))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(setAutoCapitalize))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(js.Any.fromFunction1(setMaxRows))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ITextArea]
  }
}

