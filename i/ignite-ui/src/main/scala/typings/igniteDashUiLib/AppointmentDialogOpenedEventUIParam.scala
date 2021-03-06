package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDialogOpenedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the appointment dialog.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets whether we are creating or updating an appointment.
  	 */
  var isAppointmentNew: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDialogOpenedEventUIParam {
  @scala.inline
  def apply(
    element: js.Any = null,
    isAppointmentNew: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null
  ): AppointmentDialogOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(isAppointmentNew)) __obj.updateDynamic("isAppointmentNew")(isAppointmentNew)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[AppointmentDialogOpenedEventUIParam]
  }
}

