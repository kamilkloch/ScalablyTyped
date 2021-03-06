package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesRecurrenceEditorWeekly extends js.Object {
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var repeatEvery: js.UndefOr[java.lang.String] = js.undefined
  var repeatOn: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesRecurrenceEditorWeekly {
  @scala.inline
  def apply(
    interval: java.lang.String = null,
    repeatEvery: java.lang.String = null,
    repeatOn: java.lang.String = null
  ): SchedulerMessagesRecurrenceEditorWeekly = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (repeatEvery != null) __obj.updateDynamic("repeatEvery")(repeatEvery)
    if (repeatOn != null) __obj.updateDynamic("repeatOn")(repeatOn)
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekly]
  }
}

