package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it uses the Contact Picker. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
@js.native
abstract class ContactPickerActivatedEventArgs () extends js.Object {
  /** Gets the letterbox UI of the contact picker that is displayed when the user wants to pick contacts that are provided by the app. */
  var contactPickerUI: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.ContactPickerUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

