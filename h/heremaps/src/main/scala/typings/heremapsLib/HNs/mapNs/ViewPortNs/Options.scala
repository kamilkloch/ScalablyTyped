package typings
package heremapsLib.HNs.mapNs.ViewPortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Options which may be used to initialize new ViewPort instance
             * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
             * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
             * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or or padding has been changed, default is true
             */

trait Options extends js.Object {
  var fixedCenter: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}
