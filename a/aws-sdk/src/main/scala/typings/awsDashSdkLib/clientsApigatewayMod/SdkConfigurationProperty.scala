package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdkConfigurationProperty extends js.Object {
  /**
    * The default value of an SdkType configuration property.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * The description of an SdkType configuration property.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The user-friendly name of an SdkType configuration property.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  /**
    * The name of a an SdkType configuration property.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A boolean flag of an SdkType configuration property to indicate if the associated SDK configuration property is required (true) or not (false).
    */
  var required: js.UndefOr[Boolean] = js.undefined
}

object SdkConfigurationProperty {
  @scala.inline
  def apply(
    defaultValue: String = null,
    description: String = null,
    friendlyName: String = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): SdkConfigurationProperty = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[SdkConfigurationProperty]
  }
}

