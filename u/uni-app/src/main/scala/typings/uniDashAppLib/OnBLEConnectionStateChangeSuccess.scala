package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLEConnectionStateChangeSuccess extends js.Object {
  /**
    * 连接目前的状态
    */
  var connected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
}

object OnBLEConnectionStateChangeSuccess {
  @scala.inline
  def apply(connected: js.UndefOr[scala.Boolean] = js.undefined, deviceId: java.lang.String = null): OnBLEConnectionStateChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    __obj.asInstanceOf[OnBLEConnectionStateChangeSuccess]
  }
}

