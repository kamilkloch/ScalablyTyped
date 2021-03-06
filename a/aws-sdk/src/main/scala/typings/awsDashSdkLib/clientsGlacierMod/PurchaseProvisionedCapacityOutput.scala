package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseProvisionedCapacityOutput extends js.Object {
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var capacityId: js.UndefOr[java.lang.String] = js.undefined
}

object PurchaseProvisionedCapacityOutput {
  @scala.inline
  def apply(capacityId: java.lang.String = null): PurchaseProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    if (capacityId != null) __obj.updateDynamic("capacityId")(capacityId)
    __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
  }
}

