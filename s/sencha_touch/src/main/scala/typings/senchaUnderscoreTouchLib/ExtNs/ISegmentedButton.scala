package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmentedButton extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of allowDepress
  		* @returns Boolean
  		*/
  var getAllowDepress: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of allowMultiple
  		* @returns Boolean
  		*/
  var getAllowMultiple: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of allowToggle
  		* @returns Boolean
  		*/
  var getAllowToggle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of pressedButtons
  		* @returns Array
  		*/
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns true if a specified Ext Button is pressed
  		* @param button Ext.Button The button to check if pressed.
  		* @returns Boolean pressed
  		*/
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], scala.Boolean]] = js.undefined
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of allowDepress
  		* @param allowDepress Boolean The new value.
  		*/
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of allowMultiple
  		* @param allowMultiple Boolean The new value.
  		*/
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of allowToggle
  		* @param allowToggle Boolean The new value.
  		*/
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Activates a button
  		* @param button Number/String/Ext.Button The button to activate.
  		* @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
  		* @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
  		*/
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[js.Any], 
      /* pressed */ js.UndefOr[scala.Boolean], 
      /* suppressEvents */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of pressedButtons
  		* @param pressedButtons Array The new value.
  		*/
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object ISegmentedButton {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDepress: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    allowToggle: js.UndefOr[scala.Boolean] = js.undefined,
    applyItems: () => scala.Unit = null,
    baseCls: java.lang.String = null,
    defaultType: java.lang.String = null,
    getAllowDepress: () => scala.Boolean = null,
    getAllowMultiple: () => scala.Boolean = null,
    getAllowToggle: () => scala.Boolean = null,
    getBaseCls: () => java.lang.String = null,
    getDefaultType: () => java.lang.String = null,
    getLayout: () => _ = null,
    getPressed: () => scala.Unit = null,
    getPressedButtons: () => Array = null,
    getPressedCls: () => java.lang.String = null,
    isPressed: /* button */ js.UndefOr[IButton] => scala.Boolean = null,
    layout: js.Any = null,
    pressedButtons: Array = null,
    pressedCls: java.lang.String = null,
    setAllowDepress: /* allowDepress */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setAllowMultiple: /* allowMultiple */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setAllowToggle: /* allowToggle */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => scala.Unit = null,
    setPressed: (/* button */ js.UndefOr[js.Any], /* pressed */ js.UndefOr[scala.Boolean], /* suppressEvents */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setPressedButtons: /* pressedButtons */ js.UndefOr[Array] => scala.Unit = null,
    setPressedCls: /* pressedCls */ js.UndefOr[java.lang.String] => scala.Unit = null
  ): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDepress)) __obj.updateDynamic("allowDepress")(allowDepress)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (!js.isUndefined(allowToggle)) __obj.updateDynamic("allowToggle")(allowToggle)
    if (applyItems != null) __obj.updateDynamic("applyItems")(js.Any.fromFunction0(applyItems))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getAllowDepress != null) __obj.updateDynamic("getAllowDepress")(js.Any.fromFunction0(getAllowDepress))
    if (getAllowMultiple != null) __obj.updateDynamic("getAllowMultiple")(js.Any.fromFunction0(getAllowMultiple))
    if (getAllowToggle != null) __obj.updateDynamic("getAllowToggle")(js.Any.fromFunction0(getAllowToggle))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getPressed != null) __obj.updateDynamic("getPressed")(js.Any.fromFunction0(getPressed))
    if (getPressedButtons != null) __obj.updateDynamic("getPressedButtons")(js.Any.fromFunction0(getPressedButtons))
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(js.Any.fromFunction0(getPressedCls))
    if (isPressed != null) __obj.updateDynamic("isPressed")(js.Any.fromFunction1(isPressed))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (pressedButtons != null) __obj.updateDynamic("pressedButtons")(pressedButtons)
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (setAllowDepress != null) __obj.updateDynamic("setAllowDepress")(js.Any.fromFunction1(setAllowDepress))
    if (setAllowMultiple != null) __obj.updateDynamic("setAllowMultiple")(js.Any.fromFunction1(setAllowMultiple))
    if (setAllowToggle != null) __obj.updateDynamic("setAllowToggle")(js.Any.fromFunction1(setAllowToggle))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setPressed != null) __obj.updateDynamic("setPressed")(js.Any.fromFunction3(setPressed))
    if (setPressedButtons != null) __obj.updateDynamic("setPressedButtons")(js.Any.fromFunction1(setPressedButtons))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1(setPressedCls))
    __obj.asInstanceOf[ISegmentedButton]
  }
}

