package typings
package atBlueprintjsDatetimeLib.libEsmDateRangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
@js.native
class DateRangePicker protected ()
  extends atBlueprintjsCoreLib.atBlueprintjsCoreMod.AbstractPureComponent[IDateRangePickerProps, IDateRangePickerState] {
  def this(props: IDateRangePickerProps) = this()
  def this(props: IDateRangePickerProps, context: js.Any) = this()
  var disabledDays: js.Any = js.native
  var getDisabledDaysModifier: js.Any = js.native
  var handleDayClick: js.Any = js.native
  var handleDayMouseEnter: js.Any = js.native
  var handleDayMouseLeave: js.Any = js.native
  var handleLeftMonthChange: js.Any = js.native
  var handleLeftMonthSelectChange: js.Any = js.native
  var handleLeftYearSelectChange: js.Any = js.native
  var handleNextState: js.Any = js.native
  var handleRightMonthChange: js.Any = js.native
  var handleRightMonthSelectChange: js.Any = js.native
  var handleRightYearSelectChange: js.Any = js.native
  var handleShortcutClick: js.Any = js.native
  var handleTimeChange: js.Any = js.native
  var handleTimeChangeLeftCalendar: js.Any = js.native
  var handleTimeChangeRightCalendar: js.Any = js.native
  var modifiers: js.Any = js.native
  var renderLeftCaption: js.Any = js.native
  var renderLeftNavbar: js.Any = js.native
  var renderRightCaption: js.Any = js.native
  var renderRightNavbar: js.Any = js.native
  var renderSingleCaption: js.Any = js.native
  var renderSingleNavbar: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDateRangePicker(nextProps: IDateRangePickerProps): scala.Unit = js.native
  /* private */ def maybeRenderShortcuts(): js.Any = js.native
  /* private */ def maybeRenderTimePickers(): js.Any = js.native
  /* private */ def renderCalendars(isShowingOneMonth: js.Any): js.Any = js.native
  /* private */ def setViews(leftView: js.Any, rightView: js.Any): js.Any = js.native
  /* private */ def updateLeftView(leftView: js.Any): js.Any = js.native
  /* private */ def updateRightView(rightView: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateRangePicker", "DateRangePicker")
@js.native
object DateRangePicker extends js.Object {
  var defaultProps: atBlueprintjsDatetimeLib.libEsmDateRangePickerMod.IDateRangePickerProps = js.native
  var displayName: java.lang.String = js.native
}

