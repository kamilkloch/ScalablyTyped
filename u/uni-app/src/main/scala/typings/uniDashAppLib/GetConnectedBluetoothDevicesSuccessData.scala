package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesSuccessData extends js.Object {
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GetConnectedBluetoothDevicesSuccessData {
  @scala.inline
  def apply(deviceId: java.lang.String = null, name: java.lang.String = null): GetConnectedBluetoothDevicesSuccessData = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessData]
  }
}

