package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @class
     *
     * <p>A Parse.User object is a local representation of a user persisted to the
     * Parse cloud. This class is a subclass of a Parse.Object, and retains the
     * same functionality of a Parse.Object, but also extends it with various
     * user specific methods, like authentication, signing up, and validation of
     * uniqueness.</p>
     */
@JSImport("parse/react-native", "User")
@js.native
class User ()
  extends parseLib.nodeMod.User

/**
     * @class
     *
     * <p>A Parse.User object is a local representation of a user persisted to the
     * Parse cloud. This class is a subclass of a Parse.Object, and retains the
     * same functionality of a Parse.Object, but also extends it with various
     * user specific methods, like authentication, signing up, and validation of
     * uniqueness.</p>
     */
@JSImport("parse/react-native", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: scala.Boolean): scala.Unit = js.native
  def become(sessionToken: java.lang.String): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def become(sessionToken: java.lang.String, options: parseLib.ParseNs.SuccessFailureOptions): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def current(): js.UndefOr[parseLib.ParseNs.User] = js.native
  def extend(): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def logIn(username: java.lang.String, password: java.lang.String): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def logIn(
    username: java.lang.String,
    password: java.lang.String,
    options: parseLib.ParseNs.SuccessFailureOptions
  ): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def logOut(): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def requestPasswordReset(email: java.lang.String): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def requestPasswordReset(email: java.lang.String, options: parseLib.ParseNs.SuccessFailureOptions): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def signUp(username: java.lang.String, password: java.lang.String, attrs: js.Any): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
  def signUp(
    username: java.lang.String,
    password: java.lang.String,
    attrs: js.Any,
    options: parseLib.ParseNs.SignUpOptions
  ): parseLib.ParseNs.Promise[parseLib.ParseNs.User] = js.native
}
