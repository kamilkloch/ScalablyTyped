package typings
package antdDashMobileDashRnLib.libSearchDashBarIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarNativeProps
  extends antdDashMobileDashRnLib.libSearchDashBarPropsTypeMod.SearchBarPropsType {
  var onChangeText: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ antdDashMobileDashRnLib.Anon_NativeEvent, scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  @JSName("styles")
  var styles_SearchBarNativeProps: antdDashMobileDashRnLib.libSearchDashBarStyleIndexDotNativeMod.ISearchBarStyle
}

object SearchBarNativeProps {
  @scala.inline
  def apply(
    styles: antdDashMobileDashRnLib.libSearchDashBarStyleIndexDotNativeMod.ISearchBarStyle,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    cancelText: java.lang.String = null,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    onBlur: () => scala.Unit = null,
    onCancel: /* value */ java.lang.String => scala.Unit = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onChangeText: /* text */ java.lang.String => scala.Unit = null,
    onClear: /* value */ java.lang.String => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onSubmit: /* value */ java.lang.String => scala.Unit = null,
    onSubmitEditing: /* event */ antdDashMobileDashRnLib.Anon_NativeEvent => scala.Unit = null,
    placeholder: java.lang.String = null,
    showCancelButton: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    value: java.lang.String = null
  ): SearchBarNativeProps = {
    val __obj = js.Dynamic.literal(styles = styles)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchBarNativeProps]
  }
}

