package typings
package extjsLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar
  extends extjsLib.ExtNs.panelNs.IHeader {
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTabBar: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] This method is invoked after a new Component has been removed
  		* @param tab Object
  		*/
  @JSName("onRemove")
  var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IBar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    IHeader: extjsLib.ExtNs.panelNs.IHeader = null,
    afterComponentLayout: /* width */ js.UndefOr[js.Any] => scala.Unit = null,
    afterLayout: () => scala.Unit = null,
    afterRender: () => scala.Unit = null,
    baseCls: java.lang.String = null,
    getLayout: () => extjsLib.ExtNs.layoutNs.containerNs.IContainer = null,
    isTabBar: js.UndefOr[scala.Boolean] = js.undefined,
    maxTabWidth: scala.Int | scala.Double = null,
    minTabWidth: scala.Int | scala.Double = null,
    onRemove: /* tab */ js.UndefOr[js.Any] => scala.Unit = null,
    onRender: () => scala.Unit = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined
  ): IBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IHeader)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction1(afterComponentLayout))
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(js.Any.fromFunction0(afterLayout))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (!js.isUndefined(isTabBar)) __obj.updateDynamic("isTabBar")(isTabBar)
    if (maxTabWidth != null) __obj.updateDynamic("maxTabWidth")(maxTabWidth.asInstanceOf[js.Any])
    if (minTabWidth != null) __obj.updateDynamic("minTabWidth")(minTabWidth.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    __obj.asInstanceOf[IBar]
  }
}

