package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  var altitude: js.UndefOr[scala.Boolean] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[
    weixinDashAppLib.weixinDashAppLibStrings.wgs84 | weixinDashAppLib.weixinDashAppLibStrings.gcj02
  ] = js.undefined
   // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): scala.Unit
}
