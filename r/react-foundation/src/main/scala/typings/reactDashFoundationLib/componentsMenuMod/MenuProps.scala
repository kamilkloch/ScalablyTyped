package typings
package reactDashFoundationLib.componentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, typeof, unselectable, vocab */ trait MenuProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  // RDFa Attributes
  var about: js.UndefOr[java.lang.String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  var alignment: js.UndefOr[reactDashFoundationLib.enumsMod.MenuAlignments] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[java.lang.String] = js.undefined
  var autoCorrect: js.UndefOr[java.lang.String] = js.undefined
  var autoSave: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var contentEditable: js.UndefOr[scala.Boolean] = js.undefined
  var contextMenu: js.UndefOr[java.lang.String] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var horizontalOnMedium: js.UndefOr[scala.Boolean] = js.undefined
  var iconsOnTop: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Unknown
  var inputMode: js.UndefOr[java.lang.String] = js.undefined
  var is: js.UndefOr[java.lang.String] = js.undefined
  var isDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var isNested: js.UndefOr[scala.Boolean] = js.undefined
  var isSimple: js.UndefOr[scala.Boolean] = js.undefined
  var isVertical: js.UndefOr[scala.Boolean] = js.undefined
  var itemID: js.UndefOr[java.lang.String] = js.undefined
  var itemProp: js.UndefOr[java.lang.String] = js.undefined
  var itemRef: js.UndefOr[java.lang.String] = js.undefined
  var itemScope: js.UndefOr[scala.Boolean] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var radioGroup: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var results: js.UndefOr[scala.Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[java.lang.String] = js.undefined
  var security: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[scala.Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var typeof: js.UndefOr[java.lang.String] = js.undefined
  var unselectable: js.UndefOr[reactLib.reactLibStrings.on | reactLib.reactLibStrings.off] = js.undefined
  var vocab: js.UndefOr[java.lang.String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLUListElement] = null,
    alignment: reactDashFoundationLib.enumsMod.MenuAlignments = null,
    horizontalOnMedium: js.UndefOr[scala.Boolean] = js.undefined,
    iconsOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    isDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    isNested: js.UndefOr[scala.Boolean] = js.undefined,
    isSimple: js.UndefOr[scala.Boolean] = js.undefined,
    isVertical: js.UndefOr[scala.Boolean] = js.undefined
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(horizontalOnMedium)) __obj.updateDynamic("horizontalOnMedium")(horizontalOnMedium)
    if (!js.isUndefined(iconsOnTop)) __obj.updateDynamic("iconsOnTop")(iconsOnTop)
    if (!js.isUndefined(isDropdown)) __obj.updateDynamic("isDropdown")(isDropdown)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (!js.isUndefined(isNested)) __obj.updateDynamic("isNested")(isNested)
    if (!js.isUndefined(isSimple)) __obj.updateDynamic("isSimple")(isSimple)
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical)
    __obj.asInstanceOf[MenuProps]
  }
}

