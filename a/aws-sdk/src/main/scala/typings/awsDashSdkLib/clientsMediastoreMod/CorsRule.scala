package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsRule extends js.Object {
  /**
    * Specifies which headers are allowed in a preflight OPTIONS request through the Access-Control-Request-Headers header. Each header name that is specified in Access-Control-Request-Headers must have a corresponding entry in the rule. Only the headers that were requested are sent back.  This element can contain only one wildcard character (*).
    */
  var AllowedHeaders: awsDashSdkLib.clientsMediastoreMod.AllowedHeaders
  /**
    * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute. Each CORS rule must contain at least one AllowedMethods and one AllowedOrigins element.
    */
  var AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined
  /**
    * One or more response headers that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). Each CORS rule must have at least one AllowedOrigins element. The string value can include only one wildcard character (*), for example, http:// *.example.com. Additionally, you can specify only one wildcard character to allow cross-origin access for all origins.
    */
  var AllowedOrigins: awsDashSdkLib.clientsMediastoreMod.AllowedOrigins
  /**
    * One or more headers in the response that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). This element is optional for each rule.
    */
  var ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined
  /**
    * The time in seconds that your browser caches the preflight response for the specified resource. A CORS rule can have only one MaxAgeSeconds element.
    */
  var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
}

object CorsRule {
  @scala.inline
  def apply(
    AllowedHeaders: AllowedHeaders,
    AllowedOrigins: AllowedOrigins,
    AllowedMethods: AllowedMethods = null,
    ExposeHeaders: ExposeHeaders = null,
    MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
  ): CorsRule = {
    val __obj = js.Dynamic.literal(AllowedHeaders = AllowedHeaders, AllowedOrigins = AllowedOrigins)
    if (AllowedMethods != null) __obj.updateDynamic("AllowedMethods")(AllowedMethods)
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders)
    if (!js.isUndefined(MaxAgeSeconds)) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds)
    __obj.asInstanceOf[CorsRule]
  }
}

