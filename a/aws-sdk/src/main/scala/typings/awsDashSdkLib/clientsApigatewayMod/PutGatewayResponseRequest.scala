package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutGatewayResponseRequest extends js.Object {
  /**
    * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
    */
  var responseType: GatewayResponseType
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * The HTTP status code of the GatewayResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}

object PutGatewayResponseRequest {
  @scala.inline
  def apply(
    responseType: GatewayResponseType,
    restApiId: String,
    responseParameters: MapOfStringToString = null,
    responseTemplates: MapOfStringToString = null,
    statusCode: StatusCode = null
  ): PutGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId)
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters)
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[PutGatewayResponseRequest]
  }
}

