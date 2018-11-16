package typings
package heremapsLib.HNs.serviceNs.venuesNs.TileProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
                 * Configuration object which can be used to initialize the TileProvider.
                 * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
                 * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
                 * @property onSpaceCreated {function(H.service.venues.Space)=} - A callback function that is called on every created space (see H.service.venues.Space) object. The function can be
                 * used for space object styling.
                 */

trait Options extends js.Object {
  var onSpaceCreated: js.UndefOr[js.Function1[/* space */ heremapsLib.HNs.serviceNs.venuesNs.Space, scala.Unit]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var tileCacheSize: js.UndefOr[scala.Double] = js.undefined
}
