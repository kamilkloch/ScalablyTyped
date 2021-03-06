package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the output you removed.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the output that was removed.
    */
  var OutputArn: js.UndefOr[__string] = js.undefined
}

object RemoveFlowOutputResponse {
  @scala.inline
  def apply(FlowArn: __string = null, OutputArn: __string = null): RemoveFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (OutputArn != null) __obj.updateDynamic("OutputArn")(OutputArn)
    __obj.asInstanceOf[RemoveFlowOutputResponse]
  }
}

