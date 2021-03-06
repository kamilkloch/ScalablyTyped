package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserDataAccountStoreAccessType extends js.Object

/** Specifies the requested access type in a call to RequestStoreAsync . */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
@js.native
object UserDataAccountStoreAccessType extends js.Object {
  /** Read-only access to app user data accounts and system user data accounts. */
  @js.native
  sealed trait allAccountsReadOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType
  
  /** Read/write access to the current app's user data accounts. */
  @js.native
  sealed trait appAccountsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType
  
  val allAccountsReadOnly: allAccountsReadOnly with java.lang.String = js.native
  val appAccountsReadWrite: appAccountsReadWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType with java.lang.String
  ] = js.native
}

