package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVTLDevicesInput extends js.Object {
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
  /**
    * Specifies that the number of VTL devices described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin describing the VTL devices.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.  All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will contain all devices on the specified gateway. 
    */
  var VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined
}

object DescribeVTLDevicesInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null,
    VTLDeviceARNs: VTLDeviceARNs = null
  ): DescribeVTLDevicesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (VTLDeviceARNs != null) __obj.updateDynamic("VTLDeviceARNs")(VTLDeviceARNs)
    __obj.asInstanceOf[DescribeVTLDevicesInput]
  }
}

