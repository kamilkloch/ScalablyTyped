package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoConfiguration extends js.Object {
  var skipPermissionRequests: scala.Boolean
}

object GeoConfiguration {
  @scala.inline
  def apply(skipPermissionRequests: scala.Boolean): GeoConfiguration = {
    val __obj = js.Dynamic.literal(skipPermissionRequests = skipPermissionRequests)
  
    __obj.asInstanceOf[GeoConfiguration]
  }
}

