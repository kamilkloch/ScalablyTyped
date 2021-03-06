package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICycleButton
  extends extjsLib.ExtNs.buttonNs.ISplit {
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the currently active menu item
  		* @returns Ext.menu.CheckItem The active item
  		*/
  var getActiveItem: js.UndefOr[js.Function0[extjsLib.ExtNs.menuNs.ICheckItem]] = js.undefined
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[extjsLib.ExtNs.menuNs.IMenu] = js.undefined
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the button s active menu item
  		* @param item Ext.menu.CheckItem The item to activate
  		* @param suppressEvent Boolean True to prevent the button's change event from firing.
  		*/
  var setActiveItem: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[extjsLib.ExtNs.menuNs.ICheckItem], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ICycleButton {
  @scala.inline
  def apply(
    ISplit: extjsLib.ExtNs.buttonNs.ISplit = null,
    changeHandler: js.Any = null,
    forceGlyph: js.Any = null,
    forceIcon: java.lang.String = null,
    getActiveItem: () => extjsLib.ExtNs.menuNs.ICheckItem = null,
    items: Array = null,
    menu: extjsLib.ExtNs.menuNs.IMenu = null,
    prependText: java.lang.String = null,
    setActiveItem: (/* item */ js.UndefOr[extjsLib.ExtNs.menuNs.ICheckItem], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    showText: js.UndefOr[scala.Boolean] = js.undefined,
    toggleSelected: () => scala.Unit = null
  ): ICycleButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISplit)
    if (changeHandler != null) __obj.updateDynamic("changeHandler")(changeHandler)
    if (forceGlyph != null) __obj.updateDynamic("forceGlyph")(forceGlyph)
    if (forceIcon != null) __obj.updateDynamic("forceIcon")(forceIcon)
    if (getActiveItem != null) __obj.updateDynamic("getActiveItem")(js.Any.fromFunction0(getActiveItem))
    if (items != null) __obj.updateDynamic("items")(items)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (prependText != null) __obj.updateDynamic("prependText")(prependText)
    if (setActiveItem != null) __obj.updateDynamic("setActiveItem")(js.Any.fromFunction2(setActiveItem))
    if (!js.isUndefined(showText)) __obj.updateDynamic("showText")(showText)
    if (toggleSelected != null) __obj.updateDynamic("toggleSelected")(js.Any.fromFunction0(toggleSelected))
    __obj.asInstanceOf[ICycleButton]
  }
}

