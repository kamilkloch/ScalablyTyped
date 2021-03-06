package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MultiViewCalendar")
@js.native
class MultiViewCalendar protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MultiViewCalendarOptions) = this()
  @JSName("options")
  var options_MultiViewCalendar: MultiViewCalendarOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def current(): stdLib.Date = js.native
  def max(): stdLib.Date = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: stdLib.Date): scala.Unit = js.native
  def min(): stdLib.Date = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: stdLib.Date): scala.Unit = js.native
  def navigate(value: stdLib.Date, view: java.lang.String): scala.Unit = js.native
  def navigateDown(value: stdLib.Date): scala.Unit = js.native
  def navigateToFuture(): scala.Unit = js.native
  def navigateToPast(): scala.Unit = js.native
  def navigateUp(): scala.Unit = js.native
  def selectDates(): js.Any = js.native
  def selectDates(dates: js.Any): scala.Unit = js.native
  def selectRange(): js.Any = js.native
  def selectRange(range: js.Any): scala.Unit = js.native
  def value(): stdLib.Date = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: stdLib.Date): scala.Unit = js.native
  def view(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.ui.MultiViewCalendar")
@js.native
object MultiViewCalendar extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.MultiViewCalendar = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.MultiViewCalendar = js.native
}

