package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth2")
@js.native
object ^ extends js.Object {
  /**
    * Performs a one time OAuth 2.0 authorization.
    * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeparams-callback
    */
  def authorize(params: AuthorizeConfig, callback: js.Function1[/* response */ AuthorizeResponse, scala.Unit]): scala.Unit = js.native
  /**
    * Returns the GoogleAuth object. You must initialize the GoogleAuth object with gapi.auth2.init() before calling this method.
    */
  def getAuthInstance(): GoogleAuth = js.native
  /**
    * Initializes the GoogleAuth object.
    * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2initparams
    */
  def init(params: ClientConfig): GoogleAuth = js.native
}

