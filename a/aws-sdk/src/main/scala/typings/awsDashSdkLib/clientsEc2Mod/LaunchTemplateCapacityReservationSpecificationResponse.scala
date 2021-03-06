package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateCapacityReservationSpecificationResponse extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs in On-Demand capacity.  
    */
  var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference] = js.undefined
  /**
    * Information about the target Capacity Reservation.
    */
  var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.undefined
}

object LaunchTemplateCapacityReservationSpecificationResponse {
  @scala.inline
  def apply(
    CapacityReservationPreference: CapacityReservationPreference = null,
    CapacityReservationTarget: CapacityReservationTargetResponse = null
  ): LaunchTemplateCapacityReservationSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationPreference != null) __obj.updateDynamic("CapacityReservationPreference")(CapacityReservationPreference.asInstanceOf[js.Any])
    if (CapacityReservationTarget != null) __obj.updateDynamic("CapacityReservationTarget")(CapacityReservationTarget)
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationResponse]
  }
}

