package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipUpdateRendererParams
  extends stdLib.Object {
  /**
    * The array of colors to be used by the symbols in the uniqueValueInfos of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var colors: js.Array[Color]
  /**
    * A numeric field used to explore its relationship with `field2`. In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var field1: relationshipUpdateRendererParamsField1
  /**
    * A numeric field used to explore its relationship with `field1`. In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var field2: relationshipUpdateRendererParamsField2
  /**
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This value does not change the renderer or symbology of any features in the layer. This affects the legend only. See the table below for a description of the possible values. See the class description at the top of this page for a more thorough explanation of how to read the legend.
    *
    *   Value | Example | Description
    *   ------|-------------|--------
    *   null | ![relationship-legend-null](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-null.png) | The legend renders as a square. The top right corner of the legend indicates that values from both `field1` and `field2` are considered high. |
    *   HH | ![relationship-legend-hh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hh.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered high. |
    *   HL | ![relationship-legend-hl](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hl.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are high and values from `field2` are low. |
    *   LH | ![relationship-legend-lh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-lh.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are low and values from `field2` are high. |
    *   LL | ![relationship-legend-ll](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-ll.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered low. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var focus: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the number of classes by which to break up the values of each field. More classes give you more detail, but more colors, making the visualization more difficult to understand. There are only three possible values.
    *
    * 2 classes | 3 classes | 4 classes
    * --|--|---
    * ![relationship-breaks-2](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-2.png) | ![relationship-breaks-3](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-3.png) | ![relationship-breaks-4](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-4.png)
    *
    * **Possible Values:** 2 | 3 | 4
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var numClasses: scala.Double
  /**
    * The relationship renderer (generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)) to update with the other parameters provided in this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    */
  var renderer: UniqueValueRenderer
}

object relationshipUpdateRendererParams {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    field1: relationshipUpdateRendererParamsField1,
    field2: relationshipUpdateRendererParamsField2,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    numClasses: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    renderer: UniqueValueRenderer,
    focus: java.lang.String = null
  ): relationshipUpdateRendererParams = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, field1 = field1, field2 = field2, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    __obj.asInstanceOf[relationshipUpdateRendererParams]
  }
}

