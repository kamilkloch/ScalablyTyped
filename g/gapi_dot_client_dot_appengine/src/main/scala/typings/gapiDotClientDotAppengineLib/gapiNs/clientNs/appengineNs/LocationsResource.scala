package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(request: gapiDotClientDotAppengineLib.Anon_LocationsId): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenPageSizeAppsId): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}
