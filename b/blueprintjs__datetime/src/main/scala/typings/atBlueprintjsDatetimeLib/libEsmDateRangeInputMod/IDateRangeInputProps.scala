package typings
package atBlueprintjsDatetimeLib.libEsmDateRangeInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsDatetimeLib.libEsmDateFormatMod.IDateFormatProps because var conflicts: locale. Inlined invalidDateMessage, outOfRangeMessage, placeholder, formatDate, formatDate, parseDate, parseDate */ @js.native
trait IDateRangeInputProps
  extends atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod.IDatePickerBaseProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether the calendar popover should close when a date range is fully selected.
    * @default true
    */
  var closeOnSelection: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[scala.Boolean] = js.native
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `numberOfMonths`, `fromMonth` (use
    * `minDate`), `month` (use `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[reactDashDayDashPickerLib.typesPropsMod.DayPickerProps] = js.native
  /**
    * The default date range to be used in the component when uncontrolled.
    * This will be ignored if `value` is set.
    */
  var defaultValue: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.native
  /**
    * Whether the text inputs are non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * Props to pass to the end-date [input group](#core/components/text-inputs.input-group).
    * `disabled` and `value` will be ignored in favor of the top-level props on this component.
    * `ref` is not supported; use `inputRef` instead.
    */
  var endInputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps
  ] = js.native
  /**
    * The error message to display when the date selected is invalid.
    * @default "Invalid date"
    */
  var invalidDateMessage: js.UndefOr[java.lang.String] = js.native
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[
    js.Function1[
      /* selectedRange */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Called when the user finishes typing in a new date and the date causes an error state.
    * If the date is invalid, `new Date(undefined)` will be returned for the corresponding
    * boundary of the date range.
    * If the date is out of range, the out-of-range date will be returned for the corresponding
    * boundary of the date range (`onChange` is not called in this case).
    */
  var onError: js.UndefOr[
    js.Function1[
      /* errorRange */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange, 
      scala.Unit
    ]
  ] = js.native
  /**
    * The error message to display when the date selected is out of range.
    * @default "Out of range"
    */
  var outOfRangeMessage: js.UndefOr[java.lang.String] = js.native
  /**
    * The error message to display when the selected dates overlap.
    * This can only happen when typing dates in the input field.
    * @default "Overlapping dates"
    */
  var overlappingDatesMessage: js.UndefOr[java.lang.String] = js.native
  /**
    * Placeholder text to display in empty input fields.
    * Recommended practice is to indicate the expected date format.
    */
  var placeholder: js.UndefOr[java.lang.String] = js.native
  /**
    * The props to pass to the popover.
    * `autoFocus`, `content`, and `enforceFocus` will be ignored to avoid compromising usability.
    */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps]
  ] = js.native
  /**
    * Whether the entire text field should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[
    scala.Boolean | js.Array[atBlueprintjsDatetimeLib.libEsmShortcutsMod.IDateRangeShortcut]
  ] = js.native
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[scala.Boolean] = js.native
  /**
    * Props to pass to the start-date [input group](#core/components/text-inputs.input-group).
    * `disabled` and `value` will be ignored in favor of the top-level props on this component.
    * `ref` is not supported; use `inputRef` instead.
    */
  var startInputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps
  ] = js.native
  /**
    * The currently selected date range.
    * If the prop is strictly `undefined`, the component acts in an uncontrolled manner.
    * If this prop is anything else, the component acts in a controlled manner.
    * To display an empty value in the input fields in a controlled manner, pass `[null, null]`.
    * To display an invalid date error in either input field, pass `new Date(undefined)`
    * for the appropriate date in the value prop.
    */
  var value: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.native
  /**
    * Function to render a JavaScript `Date` to a string.
    * Optional `locale` argument comes directly from the prop on this component:
    * if the prop is defined, then the argument will be too.
    */
  def formatDate(date: stdLib.Date): java.lang.String = js.native
  def formatDate(date: stdLib.Date, locale: java.lang.String): java.lang.String = js.native
  /**
    * Function to deserialize user input text to a JavaScript `Date` object.
    * Return `false` if the string is an invalid date.
    * Return `null` to represent the absence of a date.
    * Optional `locale` argument comes directly from the prop on this component.
    */
  def parseDate(str: java.lang.String): stdLib.Date | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`false` | scala.Null = js.native
  def parseDate(str: java.lang.String, locale: java.lang.String): stdLib.Date | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`false` | scala.Null = js.native
}

