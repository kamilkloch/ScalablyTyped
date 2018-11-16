package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-auth0", "Auth")
@js.native
class Auth () extends js.Object {
  def authorizationUrl(params: AuthorizationUrlParams): java.lang.String = js.native
  /* tslint:disable-next-line no-unnecessary-generics */
  def createUser[T](user: CreateUserParams[T]): stdLib.Promise[CreateUserResponse] = js.native
  def exchange(params: ExchangeParams): stdLib.Promise[java.lang.String] = js.native
  def logoutUrl(params: LogoutParams): java.lang.String = js.native
  def passwordRealm(params: PasswordRealmParams): stdLib.Promise[PasswordRealmResponse] = js.native
  def refreshToken(params: RefreshTokenParams): stdLib.Promise[_] = js.native
  def resetPassword(params: ResetPasswordParams): stdLib.Promise[_] = js.native
  def revoke(params: RevokeParams): stdLib.Promise[_] = js.native
  def userInfo(params: UserInfoParams): stdLib.Promise[UserInfo] = js.native
}
