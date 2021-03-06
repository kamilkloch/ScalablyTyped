package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedNodeOfferingMessage extends js.Object {
  /**
    * The number of reserved nodes that you want to purchase. Default: 1 
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The unique identifier of the reserved node offering you want to purchase.
    */
  var ReservedNodeOfferingId: String
}

object PurchaseReservedNodeOfferingMessage {
  @scala.inline
  def apply(ReservedNodeOfferingId: String, NodeCount: js.UndefOr[IntegerOptional] = js.undefined): PurchaseReservedNodeOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeOfferingId = ReservedNodeOfferingId)
    if (!js.isUndefined(NodeCount)) __obj.updateDynamic("NodeCount")(NodeCount)
    __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
  }
}

