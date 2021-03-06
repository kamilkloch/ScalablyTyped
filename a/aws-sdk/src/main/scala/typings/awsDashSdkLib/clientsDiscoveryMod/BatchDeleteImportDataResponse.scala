package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteImportDataResponse extends js.Object {
  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  var errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.undefined
}

object BatchDeleteImportDataResponse {
  @scala.inline
  def apply(errors: BatchDeleteImportDataErrorList = null): BatchDeleteImportDataResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[BatchDeleteImportDataResponse]
  }
}

