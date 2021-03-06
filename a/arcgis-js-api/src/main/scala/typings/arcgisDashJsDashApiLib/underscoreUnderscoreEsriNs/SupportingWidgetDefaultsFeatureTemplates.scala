package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsFeatureTemplates
  extends stdLib.Object {
  /**
    * Indicates whether the [templates filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled) displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var filterEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Aids in managing various template items and how they display within the widget. Please refer to [groupBy API reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupBy: js.UndefOr[java.lang.String | GroupByFunction] = js.undefined
}

object SupportingWidgetDefaultsFeatureTemplates {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    filterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    groupBy: java.lang.String | GroupByFunction = null
  ): SupportingWidgetDefaultsFeatureTemplates = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(filterEnabled)) __obj.updateDynamic("filterEnabled")(filterEnabled)
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplates]
  }
}

