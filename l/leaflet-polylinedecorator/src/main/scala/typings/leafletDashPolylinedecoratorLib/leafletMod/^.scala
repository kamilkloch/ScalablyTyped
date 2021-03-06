package typings
package leafletDashPolylinedecoratorLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet")
@js.native
object ^ extends js.Object {
  def polylineDecorator(
    paths: (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) | (js.Array[
      leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]
    ])
  ): PolylineDecorator = js.native
  def polylineDecorator(
    paths: (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) | (js.Array[
      leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]
    ]),
    options: PolylineDecoratorOptions
  ): PolylineDecorator = js.native
}

