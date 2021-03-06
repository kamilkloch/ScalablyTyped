package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSecurityGroupsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: awsDashSdkLib.clientsElbv2Mod.LoadBalancerArn
  /**
    * The IDs of the security groups.
    */
  var SecurityGroups: awsDashSdkLib.clientsElbv2Mod.SecurityGroups
}

object SetSecurityGroupsInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn, SecurityGroups: SecurityGroups): SetSecurityGroupsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn, SecurityGroups = SecurityGroups)
  
    __obj.asInstanceOf[SetSecurityGroupsInput]
  }
}

