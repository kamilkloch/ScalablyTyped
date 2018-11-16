package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0", "DatabaseAuthenticator")
@js.native
class DatabaseAuthenticator protected () extends js.Object {
  def this(options: DatabaseClientOptions, oauth: OAuthAuthenticator) = this()
  def changePassword(data: ResetPasswordOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def changePassword(
    data: ResetPasswordOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def requestChangePasswordEmail(data: ResetPasswordEmailOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def requestChangePasswordEmail(
    data: ResetPasswordEmailOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def signIn(data: CreateUserData, cb: js.Function2[/* err */ stdLib.Error, /* data */ User, scala.Unit]): scala.Unit = js.native
  def signIn(data: SignInOptions): bluebirdLib.bluebirdMod.namespaced[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ stdLib.Error, /* data */ SignInToken, scala.Unit]): scala.Unit = js.native
  def signUp(data: CreateUserData): bluebirdLib.bluebirdMod.namespaced[User] = js.native
}
