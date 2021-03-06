package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssociationBatchResult extends js.Object {
  /**
    * Information about the associations that failed.
    */
  var Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined
  /**
    * Information about the associations that succeeded.
    */
  var Successful: js.UndefOr[AssociationDescriptionList] = js.undefined
}

object CreateAssociationBatchResult {
  @scala.inline
  def apply(Failed: FailedCreateAssociationList = null, Successful: AssociationDescriptionList = null): CreateAssociationBatchResult = {
    val __obj = js.Dynamic.literal()
    if (Failed != null) __obj.updateDynamic("Failed")(Failed)
    if (Successful != null) __obj.updateDynamic("Successful")(Successful)
    __obj.asInstanceOf[CreateAssociationBatchResult]
  }
}

