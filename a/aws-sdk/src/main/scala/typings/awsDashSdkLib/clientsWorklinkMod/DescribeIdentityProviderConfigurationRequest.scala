package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityProviderConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object DescribeIdentityProviderConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
  
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationRequest]
  }
}

