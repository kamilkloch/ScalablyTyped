package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyResponseEmailsItem extends js.Object {
  var email: java.lang.String
  var verified: scala.Boolean
}

object UsersCreateGpgKeyResponseEmailsItem {
  @scala.inline
  def apply(email: java.lang.String, verified: scala.Boolean): UsersCreateGpgKeyResponseEmailsItem = {
    val __obj = js.Dynamic.literal(email = email, verified = verified)
  
    __obj.asInstanceOf[UsersCreateGpgKeyResponseEmailsItem]
  }
}

