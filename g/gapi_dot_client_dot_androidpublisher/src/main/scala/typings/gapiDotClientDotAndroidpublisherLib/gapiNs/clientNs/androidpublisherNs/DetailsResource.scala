package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
  /** Updates app details for this edit. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId => gapiDotClientLib.gapiNs.clientNs.Request[AppDetails],
    patch: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId => gapiDotClientLib.gapiNs.clientNs.Request[AppDetails],
    update: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId => gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DetailsResource]
  }
}

