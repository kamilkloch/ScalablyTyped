package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackProvisioningParametersRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String
}

object DescribeStackProvisioningParametersRequest {
  @scala.inline
  def apply(StackId: String): DescribeStackProvisioningParametersRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
  
    __obj.asInstanceOf[DescribeStackProvisioningParametersRequest]
  }
}

