package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdExchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricsResource]
  }
}

