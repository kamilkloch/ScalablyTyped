package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OauthAuthenticator extends Authenticator {
  /**
               * @param {Object} request The request to modify, for the `request` library.
               * @return {Object} The `request` parameter, modified to include authentication
               *     information using the stored credentials.
               * @param request
               * @return
               */
  def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest
}
