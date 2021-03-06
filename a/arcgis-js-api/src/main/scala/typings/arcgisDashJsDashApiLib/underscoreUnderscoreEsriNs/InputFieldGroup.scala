package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFieldGroup extends Accessor {
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The result of `visibilityExpression`.  Note, if `visibilityExpression` is not defined, the value of this property will be `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#evaluatedVisibility)
    */
  val evaluatedVisibility: scala.Boolean = js.native
  /**
    * The input fields belonging to this group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#inputFields)
    */
  val inputFields: js.Array[InputField] = js.native
  /**
    * The group's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#label)
    */
  val label: java.lang.String = js.native
  /**
    * Arcade expression to determine whether this group is visible or not
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: java.lang.String = js.native
  /**
    * The group's visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visible)
    */
  val visible: scala.Boolean = js.native
}

@JSGlobal("__esri.InputFieldGroup")
@js.native
class InputFieldGroupCls () extends InputFieldGroup {
  def this(properties: InputFieldGroupProperties) = this()
}

