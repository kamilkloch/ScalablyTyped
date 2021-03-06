package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrustRequest extends js.Object {
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder] = js.undefined
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: awsDashSdkLib.clientsDirectoryserviceMod.TrustId
}

object DeleteTrustRequest {
  @scala.inline
  def apply(
    TrustId: TrustId,
    DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder] = js.undefined
  ): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId)
    if (!js.isUndefined(DeleteAssociatedConditionalForwarder)) __obj.updateDynamic("DeleteAssociatedConditionalForwarder")(DeleteAssociatedConditionalForwarder)
    __obj.asInstanceOf[DeleteTrustRequest]
  }
}

