package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Plugin for custom matching logic.
     */

trait Plugin extends js.Object {
  /**
           * Match function.
           * Return a truthy value to indicate successfull match.
           *
           * @param mockRequest The mock to compare request with.
           * @param requestConfig The request object to compare mock with.
           */
  def `match`[T1, T2](
    mockRequest: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.AllRequests[T1, T2],
    requestConfig: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.AllRequests[T1, T2]
  ): scala.Boolean
}
