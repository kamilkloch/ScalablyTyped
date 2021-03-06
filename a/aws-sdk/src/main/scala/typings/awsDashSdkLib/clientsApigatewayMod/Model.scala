package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /**
    * The content-type for the model.
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * The description of the model.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the model resource.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the model. Must be an alphanumeric string.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model. Do not include "\*" characters in the description of any properties because such "\*" characters may be interpreted as the closing marker for comments in some languages, such as Java or JavaScript, causing the installation of your API's SDK generated by API Gateway to fail.
    */
  var schema: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    contentType: String = null,
    description: String = null,
    id: String = null,
    name: String = null,
    schema: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Model]
  }
}

