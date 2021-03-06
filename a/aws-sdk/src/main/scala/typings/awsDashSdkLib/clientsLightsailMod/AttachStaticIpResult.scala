package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object AttachStaticIpResult {
  @scala.inline
  def apply(operations: OperationList = null): AttachStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[AttachStaticIpResult]
  }
}

