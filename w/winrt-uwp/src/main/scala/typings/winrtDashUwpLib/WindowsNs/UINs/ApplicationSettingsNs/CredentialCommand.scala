package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
@JSGlobal("Windows.UI.ApplicationSettings.CredentialCommand")
@js.native
class CredentialCommand protected () extends js.Object {
  /**
    * Initializes a new instance of the CredentialCommand class with a PasswordCredential object.
    * @param passwordCredential The password credential.
    */
  def this(passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential) = this()
  /**
    * Initializes a new instance of the CredentialCommand class with a PasswordCredential object and a CredentialCommandCredentialDeletedHandler delegate.
    * @param passwordCredential The password credential.
    * @param deleted The delegate that handles credential deletion.
    */
  def this(passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential, deleted: CredentialCommandCredentialDeletedHandler) = this()
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  @JSName("credentialDeleted")
  var credentialDeleted_Original: CredentialCommandCredentialDeletedHandler = js.native
  /** Gets the password credential that the current command applies to. */
  var passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  def credentialDeleted(command: CredentialCommand): scala.Unit = js.native
}

