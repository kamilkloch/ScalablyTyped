package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneServiceVersion
  extends stdLib.Object {
  /**
    * The major version of the scene layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  var major: scala.Double
  /**
    * The minor version of the scene layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  var minor: scala.Double
  /**
    * The complete version string of the scene layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  var versionString: java.lang.String
}

object SceneServiceVersion {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    major: scala.Double,
    minor: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    versionString: java.lang.String
  ): SceneServiceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), major = major, minor = minor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), versionString = versionString)
  
    __obj.asInstanceOf[SceneServiceVersion]
  }
}

