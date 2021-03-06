package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle extends js.Object {
  /**
    * The bundle ID (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The number of vCPUs included in the bundle (e.g., 2).
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  /**
    * The size of the SSD (e.g., 30).
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * The Amazon EC2 instance type (e.g., t2.micro).
    */
  var instanceType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean value indicating whether the bundle is active.
    */
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A friendly name for the bundle (e.g., Micro).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
    */
  var power: js.UndefOr[integer] = js.undefined
  /**
    * The price in US dollars (e.g., 5.0).
    */
  var price: js.UndefOr[float] = js.undefined
  /**
    * The amount of RAM in GB (e.g., 2.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
  /**
    * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
    */
  var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.undefined
  /**
    * The data transfer rate per month in GB (e.g., 2000).
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}

object Bundle {
  @scala.inline
  def apply(
    bundleId: NonEmptyString = null,
    cpuCount: js.UndefOr[integer] = js.undefined,
    diskSizeInGb: js.UndefOr[integer] = js.undefined,
    instanceType: java.lang.String = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    power: js.UndefOr[integer] = js.undefined,
    price: js.UndefOr[float] = js.undefined,
    ramSizeInGb: js.UndefOr[float] = js.undefined,
    supportedPlatforms: InstancePlatformList = null,
    transferPerMonthInGb: js.UndefOr[integer] = js.undefined
  ): Bundle = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount)
    if (!js.isUndefined(diskSizeInGb)) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power)
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price)
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb)
    if (supportedPlatforms != null) __obj.updateDynamic("supportedPlatforms")(supportedPlatforms)
    if (!js.isUndefined(transferPerMonthInGb)) __obj.updateDynamic("transferPerMonthInGb")(transferPerMonthInGb)
    __obj.asInstanceOf[Bundle]
  }
}

