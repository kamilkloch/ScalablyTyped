package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingParametersRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
}

object DescribeScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DescribeScalingParametersRequest]
  }
}

