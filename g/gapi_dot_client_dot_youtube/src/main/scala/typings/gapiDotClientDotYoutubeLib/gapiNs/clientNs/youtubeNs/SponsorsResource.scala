package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorsResource extends js.Object {
  /** Lists sponsors for a channel. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[SponsorListResponse]
}

object SponsorsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsFilter => gapiDotClientLib.gapiNs.clientNs.Request[SponsorListResponse]
  ): SponsorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SponsorsResource]
  }
}

