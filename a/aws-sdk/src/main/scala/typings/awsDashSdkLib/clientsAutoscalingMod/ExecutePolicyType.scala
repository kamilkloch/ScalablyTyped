package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutePolicyType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The breach threshold for the alarm. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var BreachThreshold: js.UndefOr[MetricScale] = js.undefined
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. This parameter is not supported if the policy type is StepScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
  /**
    * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var MetricValue: js.UndefOr[MetricScale] = js.undefined
  /**
    * The name or ARN of the policy.
    */
  var PolicyName: ResourceName
}

object ExecutePolicyType {
  @scala.inline
  def apply(
    PolicyName: ResourceName,
    AutoScalingGroupName: ResourceName = null,
    BreachThreshold: js.UndefOr[MetricScale] = js.undefined,
    HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined,
    MetricValue: js.UndefOr[MetricScale] = js.undefined
  ): ExecutePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName)
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (!js.isUndefined(BreachThreshold)) __obj.updateDynamic("BreachThreshold")(BreachThreshold)
    if (!js.isUndefined(HonorCooldown)) __obj.updateDynamic("HonorCooldown")(HonorCooldown)
    if (!js.isUndefined(MetricValue)) __obj.updateDynamic("MetricValue")(MetricValue)
    __obj.asInstanceOf[ExecutePolicyType]
  }
}

