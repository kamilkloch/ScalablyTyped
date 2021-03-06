package typings
package atPulumiAwsLib.ec2CapacityReservationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacityReservationState extends js.Object {
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val endDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
    */
  val endDateType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  val ephemeralStorage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of instances for which to reserve capacity.
    */
  val instanceCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform]
  ] = js.undefined
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2TenancyMod.Tenancy]] = js.undefined
}

object CapacityReservationState {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    endDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endDateType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ephemeralStorage: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    instanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    instanceMatchCriteria: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instancePlatform: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform] = null,
    instanceType: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    tenancy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2TenancyMod.Tenancy] = null
  ): CapacityReservationState = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDateType != null) __obj.updateDynamic("endDateType")(endDateType.asInstanceOf[js.Any])
    if (ephemeralStorage != null) __obj.updateDynamic("ephemeralStorage")(ephemeralStorage.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceMatchCriteria != null) __obj.updateDynamic("instanceMatchCriteria")(instanceMatchCriteria.asInstanceOf[js.Any])
    if (instancePlatform != null) __obj.updateDynamic("instancePlatform")(instancePlatform.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationState]
  }
}

