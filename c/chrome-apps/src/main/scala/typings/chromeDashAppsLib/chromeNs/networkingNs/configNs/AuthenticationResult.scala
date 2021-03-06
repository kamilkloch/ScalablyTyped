package typings
package chromeDashAppsLib.chromeNs.networkingNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument to finishAuthentication indicating the result of the captive portal authentication attempt.
  * **'unhandled':** - The extension does not handle this network or captive portal (e.g. server end-point not found or not compatible).
  * **'succeeded':** - The extension handled this network and authenticated successfully.
  * **'rejected':** - The extension handled this network, tried to authenticate, however was rejected by the server.
  * **'failed':** - The extension handled this network, tried to authenticate, however failed due to an unspecified error.
  */
@JSGlobal("chrome.networking.config.AuthenticationResult")
@js.native
object AuthenticationResult extends js.Object {
  var FAILED: chromeDashAppsLib.chromeDashAppsLibStrings.failed = js.native
  var REJECTED: chromeDashAppsLib.chromeDashAppsLibStrings.rejected = js.native
  var SUCCEEDED: chromeDashAppsLib.chromeDashAppsLibStrings.succeeded = js.native
  var UNHANDLED: chromeDashAppsLib.chromeDashAppsLibStrings.unhandled = js.native
}

