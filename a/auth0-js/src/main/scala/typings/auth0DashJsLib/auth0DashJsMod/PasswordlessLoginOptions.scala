package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessLoginOptions extends js.Object {
  var connection: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var verificationCode: java.lang.String
}

object PasswordlessLoginOptions {
  @scala.inline
  def apply(
    connection: java.lang.String,
    verificationCode: java.lang.String,
    email: java.lang.String = null,
    phoneNumber: java.lang.String = null
  ): PasswordlessLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection, verificationCode = verificationCode)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[PasswordlessLoginOptions]
  }
}

