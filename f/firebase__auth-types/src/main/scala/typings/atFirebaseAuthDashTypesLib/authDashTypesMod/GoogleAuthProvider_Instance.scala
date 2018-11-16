package typings
package atFirebaseAuthDashTypesLib.authDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "GoogleAuthProvider_Instance")
@js.native
class GoogleAuthProvider_Instance () extends AuthProvider {
  /* CompleteClass */
  override var providerId: java.lang.String = js.native
  def addScope(scope: java.lang.String): AuthProvider = js.native
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
