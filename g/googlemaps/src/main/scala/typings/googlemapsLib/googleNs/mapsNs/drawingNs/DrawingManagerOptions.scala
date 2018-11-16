package typings
package googlemapsLib.googleNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DrawingManagerOptions extends js.Object {
  /**
         * Options to apply to any new circles created with this DrawingManager.
         * The center and radius properties are ignored, and the map property of a
         * new circle is always set to the DrawingManager's map.
         */
  var circleOptions: js.UndefOr[googlemapsLib.googleNs.mapsNs.CircleOptions] = js.undefined
  /**
         * The enabled/disabled state of the drawing control. Defaults to true.
         */
  var drawingControl: js.UndefOr[scala.Boolean] = js.undefined
  /** The display options for the drawing control. */
  var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.undefined
  /**
         * The DrawingManager's drawing mode, which defines the type of overlay to
         * be added on the map. Accepted values are 'marker', 'polygon',
         * 'polyline', 'rectangle', 'circle', or null. A drawing mode of null
         * means that the user can interact with the map as normal, and clicks do
         * not draw anything.
         */
  var drawingMode: js.UndefOr[OverlayType | scala.Null] = js.undefined
  /**
         * The Map to which the DrawingManager is attached, which is the Map on
         * which the overlays created will be placed.
         */
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  /**
         * Options to apply to any new markers created with this DrawingManager.
         * The position property is ignored, and the map property of a new marker
         * is always set to the DrawingManager's map.
         */
  var markerOptions: js.UndefOr[googlemapsLib.googleNs.mapsNs.MarkerOptions] = js.undefined
  /**
         * Options to apply to any new polygons created with this DrawingManager.
         * The paths property is ignored, and the map property of a new polygon is
         * always set to the DrawingManager's map.
         */
  var polygonOptions: js.UndefOr[googlemapsLib.googleNs.mapsNs.PolygonOptions] = js.undefined
  /**
         * Options to apply to any new polylines created with this DrawingManager.
         * The path property is ignored, and the map property of a new polyline is
         * always set to the DrawingManager's map.
         */
  var polylineOptions: js.UndefOr[googlemapsLib.googleNs.mapsNs.PolylineOptions] = js.undefined
  /**
         * Options to apply to any new rectangles created with this
         * DrawingManager. The bounds property is ignored, and the map property of
         * a new rectangle is always set to the DrawingManager's map.
         */
  var rectangleOptions: js.UndefOr[googlemapsLib.googleNs.mapsNs.RectangleOptions] = js.undefined
}
