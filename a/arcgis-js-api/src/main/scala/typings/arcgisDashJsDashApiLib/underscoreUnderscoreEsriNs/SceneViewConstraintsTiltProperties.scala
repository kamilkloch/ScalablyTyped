package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsTiltProperties
  extends stdLib.Object {
  /**
    * Specifies the maximum amount of tilt (in degrees) allowed in the view and may range from 0.5 to 179.5 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the mode of the constraint. There are two possible values: `auto` or `manual`. In `auto` mode, the maximum tilt value is automatically determined based on the altitude of the view camera. In `manual` mode, the maximum tilt value is a user defined, constant value. **Note:** The mode automatically changes to `manual` whenever the `max` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object SceneViewConstraintsTiltProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    max: scala.Int | scala.Double = null,
    mode: java.lang.String = null
  ): SceneViewConstraintsTiltProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[SceneViewConstraintsTiltProperties]
  }
}

