package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetScreenBrightnessParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
               * 屏幕亮度值，范围 0 ~ 1，0 最暗，1 最亮
               */
  var value: scala.Double
}
