package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationObject
  extends openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Operation {
  var callbacks: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  var requestBody: js.UndefOr[ReferenceObject | RequestBodyObject] = js.undefined
  var responses: js.UndefOr[ResponsesObject] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OperationObject {
  @scala.inline
  def apply(
    callbacks: org.scalablytyped.runtime.StringDictionary[ReferenceObject | CallbackObject] = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    externalDocs: ExternalDocumentationObject = null,
    operationId: java.lang.String = null,
    parameters: js.Array[ReferenceObject | ParameterObject] = null,
    requestBody: ReferenceObject | RequestBodyObject = null,
    responses: ResponsesObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    summary: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): OperationObject = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (security != null) __obj.updateDynamic("security")(security)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[OperationObject]
  }
}

