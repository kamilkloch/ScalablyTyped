package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  /**
    * The description of an error found in the behaviors.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}

object ValidationError {
  @scala.inline
  def apply(errorMessage: ErrorMessage = null): ValidationError = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.asInstanceOf[ValidationError]
  }
}

