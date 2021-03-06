package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(s) load balancing configuration) that autoscaler should maintain. Must be a positive float value.
    * If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[scala.Double] = js.undefined
}

object AutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(utilizationTarget: scala.Int | scala.Double = null): AutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPolicyLoadBalancingUtilization]
  }
}

