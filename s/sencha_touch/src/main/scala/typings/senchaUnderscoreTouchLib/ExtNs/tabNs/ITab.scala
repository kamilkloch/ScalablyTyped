package typings
package senchaUnderscoreTouchLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITab
  extends senchaUnderscoreTouchLib.ExtNs.IButton {
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of active
  		* @returns Boolean
  		*/
  var getActive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of activeCls
  		* @returns String
  		*/
  var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of active
  		* @param active Boolean The new value.
  		*/
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of activeCls
  		* @param activeCls String The new value.
  		*/
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ITab {
  @scala.inline
  def apply(
    IButton: senchaUnderscoreTouchLib.ExtNs.IButton = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeCls: java.lang.String = null,
    baseCls: java.lang.String = null,
    getActive: () => scala.Boolean = null,
    getActiveCls: () => java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getPressedCls: () => java.lang.String = null,
    getTitle: () => java.lang.String = null,
    pressedCls: java.lang.String = null,
    setActive: /* active */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setActiveCls: /* activeCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPressedCls: /* pressedCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => scala.Unit = null,
    title: java.lang.String = null
  ): ITab = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButton)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getActive != null) __obj.updateDynamic("getActive")(js.Any.fromFunction0(getActive))
    if (getActiveCls != null) __obj.updateDynamic("getActiveCls")(js.Any.fromFunction0(getActiveCls))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(js.Any.fromFunction0(getPressedCls))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction1(setActive))
    if (setActiveCls != null) __obj.updateDynamic("setActiveCls")(js.Any.fromFunction1(setActiveCls))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1(setPressedCls))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ITab]
  }
}

