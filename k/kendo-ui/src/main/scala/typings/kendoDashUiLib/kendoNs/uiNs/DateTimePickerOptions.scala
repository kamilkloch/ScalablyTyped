package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerOptions extends js.Object {
  var ARIATemplate: js.UndefOr[java.lang.String] = js.undefined
  var animation: js.UndefOr[scala.Boolean | DateTimePickerAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DateTimePickerChangeEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DateTimePickerCloseEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dateInput: js.UndefOr[scala.Boolean] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[java.lang.String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[scala.Boolean | java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var month: js.UndefOr[DateTimePickerMonth] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DateTimePickerOpenEvent, scala.Unit]] = js.undefined
  var parseFormats: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
  var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
}

object DateTimePickerOptions {
  @scala.inline
  def apply(
    ARIATemplate: java.lang.String = null,
    animation: scala.Boolean | DateTimePickerAnimation = null,
    change: /* e */ DateTimePickerChangeEvent => scala.Unit = null,
    close: /* e */ DateTimePickerCloseEvent => scala.Unit = null,
    culture: java.lang.String = null,
    dateInput: js.UndefOr[scala.Boolean] = js.undefined,
    dates: js.Any = null,
    depth: java.lang.String = null,
    disableDates: js.Any | js.Function = null,
    footer: scala.Boolean | java.lang.String | js.Function = null,
    format: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    max: stdLib.Date = null,
    min: stdLib.Date = null,
    month: DateTimePickerMonth = null,
    name: java.lang.String = null,
    open: /* e */ DateTimePickerOpenEvent => scala.Unit = null,
    parseFormats: js.Any = null,
    start: java.lang.String = null,
    timeFormat: java.lang.String = null,
    value: stdLib.Date = null,
    weekNumber: js.UndefOr[scala.Boolean] = js.undefined
  ): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (ARIATemplate != null) __obj.updateDynamic("ARIATemplate")(ARIATemplate)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (month != null) __obj.updateDynamic("month")(month)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (parseFormats != null) __obj.updateDynamic("parseFormats")(parseFormats)
    if (start != null) __obj.updateDynamic("start")(start)
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[DateTimePickerOptions]
  }
}

