package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteral extends _LatLngExpression {
  var lat: scala.Double
  var lng: scala.Double
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[LatLngLiteral]
  }
}

