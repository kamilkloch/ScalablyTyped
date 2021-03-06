package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.IField {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISlider: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ISlider: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISlider: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Object The new value.
  		*/
  @JSName("setTabIndex")
  var setTabIndex_ISlider: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IField: senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    cls: js.Any = null,
    getCls: () => java.lang.String = null,
    getIncrement: () => scala.Double = null,
    getMaxValue: () => scala.Double = null,
    getMinValue: () => scala.Double = null,
    getReadOnly: () => scala.Boolean = null,
    getValue: () => _ = null,
    getValues: () => _ = null,
    increment: scala.Int | scala.Double = null,
    isDirty: () => scala.Boolean = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reset: () => senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setIncrement: /* increment */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinValue: /* minValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setTabIndex: /* tabIndex */ js.UndefOr[js.Any] => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    setValues: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    tabIndex: scala.Int | scala.Double = null,
    value: js.Any = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(js.Any.fromFunction0(getReadOnly))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1(setTabIndex))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1(setValues))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ISlider]
  }
}

