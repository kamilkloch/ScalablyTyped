package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, style, tabIndex, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait FlatButtonProps
  extends reactLib.reactMod.DOMAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNode | java.lang.String] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var focusRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var keyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.before | materialDashUiLib.materialDashUiLibStrings.after
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var linkButton: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleColor: js.UndefOr[java.lang.String] = js.undefined
  var touchRippleOpacity: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FlatButtonProps {
  @scala.inline
  def apply(
    DOMAttributes: reactLib.reactMod.DOMAttributes[js.Object] = null,
    SharedEnhancedButtonProps: SharedEnhancedButtonProps[FlatButton] = null,
    backgroundColor: java.lang.String = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    hoverColor: java.lang.String = null,
    icon: reactLib.reactMod.ReactNode = null,
    label: reactLib.reactMod.ReactNode = null,
    labelPosition: materialDashUiLib.materialDashUiLibStrings.before | materialDashUiLib.materialDashUiLibStrings.after = null,
    labelStyle: reactLib.reactMod.CSSProperties = null,
    linkButton: js.UndefOr[scala.Boolean] = js.undefined,
    onKeyboardFocus: (/* e */ reactLib.reactMod.FocusEvent[js.Object], /* isKeyboardFocused */ scala.Boolean) => scala.Unit = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[js.Object] = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    rippleColor: java.lang.String = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): FlatButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, SharedEnhancedButtonProps)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FlatButtonProps]
  }
}

