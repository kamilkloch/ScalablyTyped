package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentsProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation")
@js.native
abstract class AddAppointmentOperation () extends js.Object {
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.Appointment = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: java.lang.String = js.native
  /** Dismisses the UI for the operation that adds a new appointment. */
  def dismissUI(): scala.Unit = js.native
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): scala.Unit = js.native
  /**
    * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
    */
  def reportCompleted(itemId: java.lang.String): scala.Unit = js.native
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: java.lang.String): scala.Unit = js.native
}

