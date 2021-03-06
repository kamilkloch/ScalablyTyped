package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHook extends js.Object {
  /**
    * The name of the Auto Scaling group for the lifecycle hook.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The possible values are CONTINUE and ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  /**
    * The maximum time, in seconds, that an instance can remain in a Pending:Wait or Terminating:Wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
    */
  var GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter.
    */
  var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined
  /**
    * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined
  /**
    * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.undefined
}

object LifecycleHook {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName = null,
    DefaultResult: LifecycleActionResult = null,
    GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined,
    HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
    LifecycleHookName: AsciiStringMaxLen255 = null,
    LifecycleTransition: LifecycleTransition = null,
    NotificationMetadata: XmlStringMaxLen1023 = null,
    NotificationTargetARN: ResourceName = null,
    RoleARN: ResourceName = null
  ): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (DefaultResult != null) __obj.updateDynamic("DefaultResult")(DefaultResult)
    if (!js.isUndefined(GlobalTimeout)) __obj.updateDynamic("GlobalTimeout")(GlobalTimeout)
    if (!js.isUndefined(HeartbeatTimeout)) __obj.updateDynamic("HeartbeatTimeout")(HeartbeatTimeout)
    if (LifecycleHookName != null) __obj.updateDynamic("LifecycleHookName")(LifecycleHookName)
    if (LifecycleTransition != null) __obj.updateDynamic("LifecycleTransition")(LifecycleTransition)
    if (NotificationMetadata != null) __obj.updateDynamic("NotificationMetadata")(NotificationMetadata)
    if (NotificationTargetARN != null) __obj.updateDynamic("NotificationTargetARN")(NotificationTargetARN)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[LifecycleHook]
  }
}

