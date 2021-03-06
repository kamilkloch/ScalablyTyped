package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: gapiDotClientDotPlaymoviespartnerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Avail]
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountId): gapiDotClientLib.gapiNs.clientNs.Request[ListAvailsResponse]
}

object AvailsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotPlaymoviespartnerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Avail],
    list: gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountId => gapiDotClientLib.gapiNs.clientNs.Request[ListAvailsResponse]
  ): AvailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AvailsResource]
  }
}

