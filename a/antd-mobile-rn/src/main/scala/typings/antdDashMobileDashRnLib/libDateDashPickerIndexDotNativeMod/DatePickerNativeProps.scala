package typings
package antdDashMobileDashRnLib.libDateDashPickerIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerNativeProps
  extends antdDashMobileDashRnLib.libDateDashPickerPropsTypeMod.DatePickerPropsType {
  var styles: js.UndefOr[antdDashMobileDashRnLib.libPickerStyleIndexDotNativeMod.IPickerStyle] = js.undefined
  var triggerTypes: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerNativeProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dismissText: reactLib.reactMod.ReactNode = null,
    extra: java.lang.String = null,
    format: java.lang.String | (js.Function1[/* value */ stdLib.Date, java.lang.String]) = null,
    locale: antdDashMobileDashRnLib.Anon_DatePickerLocale = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    minuteStep: scala.Int | scala.Double = null,
    mode: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.datetime | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.date | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.year | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.month | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.time = null,
    okText: reactLib.reactMod.ReactNode = null,
    onChange: /* value */ stdLib.Date => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    styles: antdDashMobileDashRnLib.libPickerStyleIndexDotNativeMod.IPickerStyle = null,
    title: reactLib.reactMod.ReactNode = null,
    triggerTypes: java.lang.String = null,
    value: stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerNativeProps]
  }
}

