package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateOverridesRequest extends js.Object {
  /**
    * The Availability Zone in which to launch the instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var MaxPrice: js.UndefOr[String] = js.undefined
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[Placement] = js.undefined
  /**
    * The priority for the launch template override. If AllocationStrategy is set to prioritized, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at 0. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var Priority: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The number of units provided by the specified instance type.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.undefined
}

object FleetLaunchTemplateOverridesRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    InstanceType: InstanceType = null,
    MaxPrice: String = null,
    Placement: Placement = null,
    Priority: js.UndefOr[Double] = js.undefined,
    SubnetId: String = null,
    WeightedCapacity: js.UndefOr[Double] = js.undefined
  ): FleetLaunchTemplateOverridesRequest = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (MaxPrice != null) __obj.updateDynamic("MaxPrice")(MaxPrice)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity)
    __obj.asInstanceOf[FleetLaunchTemplateOverridesRequest]
  }
}

