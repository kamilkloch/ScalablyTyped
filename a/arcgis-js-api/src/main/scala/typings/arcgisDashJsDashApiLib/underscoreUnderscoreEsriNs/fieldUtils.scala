package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fieldUtils extends js.Object {
  /**
    * Returns an array of field names used in the Arcade expression for calculating the Z values of features in the given feature layer's [FeatureLayer.elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getElevationFields)
    *
    * @param layer The featureLayer to extract fields required for calculating feature Z values.
    *
    */
  def getElevationFields(layer: FeatureLayer): arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]]
  /**
    * Returns an array of editor tracking field names for a given feature layer. It includes the fields from the [FeatureLayer.editFieldsInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editFieldsInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getFeatureEditFields)
    *
    * @param layer The Feature Layer from which to extract editor tracking fields.
    *
    */
  def getFeatureEditFields(layer: FeatureLayer): js.Array[java.lang.String]
  /**
    * Returns an array of field names used in the Arcade expression for labeling features in the given feature layer's [FeatureLayer.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getLabelingFields)
    *
    * @param layer The Feature Layer from which to extract label fields.
    *
    */
  def getLabelingFields(layer: FeatureLayer): arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]]
  /**
    * Returns an array of field names related to time. It includes the fields from the [FeatureLayer.timeInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo), and the `trackIdField`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getTimeFields)
    *
    * @param layer The Feature Layer from which to extract time fields.
    *
    */
  def getTimeFields(layer: FeatureLayer): arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]]
}

object fieldUtils {
  @scala.inline
  def apply(
    getElevationFields: FeatureLayer => arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]],
    getFeatureEditFields: FeatureLayer => js.Array[java.lang.String],
    getLabelingFields: FeatureLayer => arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]],
    getTimeFields: FeatureLayer => arcgisDashJsDashApiLib.IPromise[js.Array[java.lang.String]]
  ): fieldUtils = {
    val __obj = js.Dynamic.literal(getElevationFields = js.Any.fromFunction1(getElevationFields), getFeatureEditFields = js.Any.fromFunction1(getFeatureEditFields), getLabelingFields = js.Any.fromFunction1(getLabelingFields), getTimeFields = js.Any.fromFunction1(getTimeFields))
  
    __obj.asInstanceOf[fieldUtils]
  }
}

