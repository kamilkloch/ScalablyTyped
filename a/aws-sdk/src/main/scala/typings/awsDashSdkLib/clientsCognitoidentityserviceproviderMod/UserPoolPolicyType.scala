package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolPolicyType extends js.Object {
  /**
    * The password policy.
    */
  var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined
}

object UserPoolPolicyType {
  @scala.inline
  def apply(PasswordPolicy: PasswordPolicyType = null): UserPoolPolicyType = {
    val __obj = js.Dynamic.literal()
    if (PasswordPolicy != null) __obj.updateDynamic("PasswordPolicy")(PasswordPolicy)
    __obj.asInstanceOf[UserPoolPolicyType]
  }
}

