package typings
package reactDashMdLib.libDataTablesEditDialogColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps because var conflicts: block, fullWidth. Inlined name, inputStyle, inputClassName, paddedBlock, disabled, label, placeholder, `type`, active, error, floating, required, lineDirection, leftIcon, leftIconStateful, rightIcon, rightIconStateful, passwordIcon, passwordInitiallyVisible, rows, maxRows, customSize, errorText, helpText, helpOnFocus, maxLength, inlineIndicator, min, max, step, pattern, resize, tabIndex, passwordIconChildren, passwordIconClassName */ trait EditDialogColumnProps
  extends reactDashMdLib.libHelpersLayoverMod.SharedLayoverProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var animationPosition: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var cancelProps: js.UndefOr[js.Object] = js.undefined
  var cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  var customSize: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogContentStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var dialogId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var enforceMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var helpText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var inlineIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var inlineIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var inlineIndicator: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var large: js.UndefOr[scala.Boolean] = js.undefined
  var layoverClassName: js.UndefOr[java.lang.String] = js.undefined
  var layoverStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var lineDirection: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var noIcon: js.UndefOr[scala.Boolean] = js.undefined
  var okLabel: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var okOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined
  var okPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var okProps: js.UndefOr[js.Object] = js.undefined
  var okSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var onCancelClick: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.FormEvent[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onOkClick: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | java.lang.String, 
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onOutsideClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var paddedBlock: js.UndefOr[scala.Boolean] = js.undefined
  var passwordIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var passwordIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var passwordIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var passwordInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[reactDashMdLib.Anon_DisableShrink] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated
    */
  var scrollThreshold: js.UndefOr[scala.Double] = js.undefined
  var simplifiedDialog: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes] = js.undefined
  var visibleOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object EditDialogColumnProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    anchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    animationPosition: reactDashMdLib.libHelpersLayoverMod.LayoverPositions = null,
    belowAnchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: reactLib.reactMod.ReactNode = null,
    cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    cancelProps: js.Object = null,
    cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    customSize: java.lang.String = null,
    defaultValue: scala.Double | java.lang.String = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    dialogClassName: java.lang.String = null,
    dialogContentClassName: java.lang.String = null,
    dialogContentStyle: reactLib.reactMod.CSSProperties = null,
    dialogId: reactDashMdLib.libMod.IdPropType = null,
    dialogStyle: reactLib.reactMod.CSSProperties = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMinWidth: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    errorText: reactLib.reactMod.ReactNode = null,
    fillViewportHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportWidth: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTo: js.Object | reactDashMdLib.Anon_X = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    helpText: reactLib.reactMod.ReactNode = null,
    id: reactDashMdLib.libMod.IdPropType = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIcon: reactLib.reactMod.ReactElement[_] = null,
    inlineIconChildren: reactLib.reactMod.ReactNode = null,
    inlineIconClassName: java.lang.String = null,
    inlineIndicator: reactLib.reactMod.ReactElement[_] = null,
    inputClassName: java.lang.String = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    label: reactLib.reactMod.ReactNode = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    layoverClassName: java.lang.String = null,
    layoverStyle: reactLib.reactMod.CSSProperties = null,
    leftIcon: reactLib.reactMod.ReactElement[_] = null,
    leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    lineDirection: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections = null,
    max: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minBottom: scala.Double | java.lang.String = null,
    minLeft: scala.Double | java.lang.String = null,
    minRight: scala.Double | java.lang.String = null,
    name: scala.Double | java.lang.String = null,
    noIcon: js.UndefOr[scala.Boolean] = js.undefined,
    okLabel: reactLib.reactMod.ReactNode = null,
    okOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    okPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    okProps: js.Object = null,
    okSecondary: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onCancelClick: (/* value */ scala.Double | java.lang.String, /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onChange: (/* value */ scala.Double | java.lang.String, /* event */ reactLib.reactMod.FormEvent[stdLib.HTMLElement]) => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onOkClick: (/* value */ scala.Double | java.lang.String, /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onOutsideClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    paddedBlock: js.UndefOr[scala.Boolean] = js.undefined,
    passwordIcon: reactLib.reactMod.ReactElement[_] = null,
    passwordIconChildren: reactLib.reactMod.ReactNode = null,
    passwordIconClassName: java.lang.String = null,
    passwordInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    resize: reactDashMdLib.Anon_DisableShrink = null,
    rightIcon: reactLib.reactMod.ReactElement[_] = null,
    rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    sameWidth: js.UndefOr[scala.Boolean] = js.undefined,
    scrollThreshold: scala.Int | scala.Double = null,
    simplifiedDialog: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    textFieldClassName: java.lang.String = null,
    textFieldStyle: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    tooltipClassName: java.lang.String = null,
    tooltipContainerClassName: java.lang.String = null,
    tooltipContainerStyle: reactLib.reactMod.CSSProperties = null,
    tooltipDelay: scala.Int | scala.Double = null,
    tooltipLabel: reactLib.reactMod.ReactNode = null,
    tooltipPosition: reactDashMdLib.libTooltipsInjectTooltipMod.Positions = null,
    tooltipStyle: reactLib.reactMod.CSSProperties = null,
    tooltipTransitionEnterTimeout: scala.Int | scala.Double = null,
    tooltipTransitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    `type`: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes = null,
    visibleOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    xThreshold: scala.Int | scala.Double = null,
    yThreshold: scala.Int | scala.Double = null
  ): EditDialogColumnProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (animationPosition != null) __obj.updateDynamic("animationPosition")(animationPosition)
    if (belowAnchor != null) __obj.updateDynamic("belowAnchor")(belowAnchor)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelPrimary)) __obj.updateDynamic("cancelPrimary")(cancelPrimary)
    if (cancelProps != null) __obj.updateDynamic("cancelProps")(cancelProps)
    if (!js.isUndefined(cancelSecondary)) __obj.updateDynamic("cancelSecondary")(cancelSecondary)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (customSize != null) __obj.updateDynamic("customSize")(customSize)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (dialogClassName != null) __obj.updateDynamic("dialogClassName")(dialogClassName)
    if (dialogContentClassName != null) __obj.updateDynamic("dialogContentClassName")(dialogContentClassName)
    if (dialogContentStyle != null) __obj.updateDynamic("dialogContentStyle")(dialogContentStyle)
    if (dialogId != null) __obj.updateDynamic("dialogId")(dialogId.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enforceMinWidth)) __obj.updateDynamic("enforceMinWidth")(enforceMinWidth)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(fillViewportHeight)) __obj.updateDynamic("fillViewportHeight")(fillViewportHeight)
    if (!js.isUndefined(fillViewportWidth)) __obj.updateDynamic("fillViewportWidth")(fillViewportWidth)
    if (fixedTo != null) __obj.updateDynamic("fixedTo")(fixedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(helpOnFocus)) __obj.updateDynamic("helpOnFocus")(helpOnFocus)
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inlineIcon != null) __obj.updateDynamic("inlineIcon")(inlineIcon)
    if (inlineIconChildren != null) __obj.updateDynamic("inlineIconChildren")(inlineIconChildren.asInstanceOf[js.Any])
    if (inlineIconClassName != null) __obj.updateDynamic("inlineIconClassName")(inlineIconClassName)
    if (inlineIndicator != null) __obj.updateDynamic("inlineIndicator")(inlineIndicator)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (layoverClassName != null) __obj.updateDynamic("layoverClassName")(layoverClassName)
    if (layoverStyle != null) __obj.updateDynamic("layoverStyle")(layoverStyle)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (!js.isUndefined(leftIconStateful)) __obj.updateDynamic("leftIconStateful")(leftIconStateful)
    if (lineDirection != null) __obj.updateDynamic("lineDirection")(lineDirection)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minBottom != null) __obj.updateDynamic("minBottom")(minBottom.asInstanceOf[js.Any])
    if (minLeft != null) __obj.updateDynamic("minLeft")(minLeft.asInstanceOf[js.Any])
    if (minRight != null) __obj.updateDynamic("minRight")(minRight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noIcon)) __obj.updateDynamic("noIcon")(noIcon)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(okOnOutsideClick)) __obj.updateDynamic("okOnOutsideClick")(okOnOutsideClick)
    if (!js.isUndefined(okPrimary)) __obj.updateDynamic("okPrimary")(okPrimary)
    if (okProps != null) __obj.updateDynamic("okProps")(okProps)
    if (!js.isUndefined(okSecondary)) __obj.updateDynamic("okSecondary")(okSecondary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCancelClick != null) __obj.updateDynamic("onCancelClick")(js.Any.fromFunction2(onCancelClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onOkClick != null) __obj.updateDynamic("onOkClick")(js.Any.fromFunction2(onOkClick))
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1(onOutsideClick))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(paddedBlock)) __obj.updateDynamic("paddedBlock")(paddedBlock)
    if (passwordIcon != null) __obj.updateDynamic("passwordIcon")(passwordIcon)
    if (passwordIconChildren != null) __obj.updateDynamic("passwordIconChildren")(passwordIconChildren.asInstanceOf[js.Any])
    if (passwordIconClassName != null) __obj.updateDynamic("passwordIconClassName")(passwordIconClassName)
    if (!js.isUndefined(passwordInitiallyVisible)) __obj.updateDynamic("passwordInitiallyVisible")(passwordInitiallyVisible)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (!js.isUndefined(rightIconStateful)) __obj.updateDynamic("rightIconStateful")(rightIconStateful)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(sameWidth)) __obj.updateDynamic("sameWidth")(sameWidth)
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifiedDialog)) __obj.updateDynamic("simplifiedDialog")(simplifiedDialog)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textFieldClassName != null) __obj.updateDynamic("textFieldClassName")(textFieldClassName)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipClassName != null) __obj.updateDynamic("tooltipClassName")(tooltipClassName)
    if (tooltipContainerClassName != null) __obj.updateDynamic("tooltipContainerClassName")(tooltipContainerClassName)
    if (tooltipContainerStyle != null) __obj.updateDynamic("tooltipContainerStyle")(tooltipContainerStyle)
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    if (tooltipTransitionEnterTimeout != null) __obj.updateDynamic("tooltipTransitionEnterTimeout")(tooltipTransitionEnterTimeout.asInstanceOf[js.Any])
    if (tooltipTransitionLeaveTimeout != null) __obj.updateDynamic("tooltipTransitionLeaveTimeout")(tooltipTransitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visibleOnFocus)) __obj.updateDynamic("visibleOnFocus")(visibleOnFocus)
    if (xThreshold != null) __obj.updateDynamic("xThreshold")(xThreshold.asInstanceOf[js.Any])
    if (yThreshold != null) __obj.updateDynamic("yThreshold")(yThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditDialogColumnProps]
  }
}

