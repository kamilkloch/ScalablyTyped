package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsRevokeGrantForApplicationParams extends js.Object {
  var access_token: java.lang.String
  var client_id: java.lang.String
}

object OauthAuthorizationsRevokeGrantForApplicationParams {
  @scala.inline
  def apply(access_token: java.lang.String, client_id: java.lang.String): OauthAuthorizationsRevokeGrantForApplicationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token, client_id = client_id)
  
    __obj.asInstanceOf[OauthAuthorizationsRevokeGrantForApplicationParams]
  }
}

