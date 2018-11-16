package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextSearchRequest extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var location: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var query: java.lang.String
  var radius: js.UndefOr[scala.Double] = js.undefined
   /* Deprecated. Will be removed February 16, 2017 */var `type`: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
