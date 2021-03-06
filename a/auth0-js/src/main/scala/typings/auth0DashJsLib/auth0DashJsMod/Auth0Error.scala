package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Error extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var error: LibErrorCodes | SpecErrorCodes | java.lang.String
  var errorDescription: js.UndefOr[java.lang.String] = js.undefined
  // Auth0 is not consistent in the naming of the error description field
  var error_description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var original: js.UndefOr[js.Any] = js.undefined
  var policy: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0Error {
  @scala.inline
  def apply(
    error: LibErrorCodes | SpecErrorCodes | java.lang.String,
    code: java.lang.String = null,
    description: java.lang.String = null,
    errorDescription: java.lang.String = null,
    error_description: java.lang.String = null,
    name: java.lang.String = null,
    original: js.Any = null,
    policy: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): Auth0Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (error_description != null) __obj.updateDynamic("error_description")(error_description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (original != null) __obj.updateDynamic("original")(original)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Auth0Error]
  }
}

