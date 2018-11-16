package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SnappedPoint extends js.Object {
  /** contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose
  /**
       * An integer that indicates the corresponding value in the original request.
       * Each value in the request should map to a snapped value in the response.
       * These values are indexed from `0`, so a point with an `originalIndex` of `4` will be the snapped value
       * of the 5th latitude/longitude passed to the `path` parameter.
       */
  var originalIndex: scala.Double
  /**
       * A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments.
       * The `placeId` can be passed in a speed limits request to determine the speed limit along that road segment.
       */
  var placeId: java.lang.String
}
