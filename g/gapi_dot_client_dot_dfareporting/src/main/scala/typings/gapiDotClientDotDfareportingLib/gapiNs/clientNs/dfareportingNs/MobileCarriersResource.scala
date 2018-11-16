package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[MobileCarriersListResponse]
}
