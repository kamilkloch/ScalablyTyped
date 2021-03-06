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

object SetScreenBrightnessParams {
  @scala.inline
  def apply(
    value: scala.Double,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: () => scala.Unit = null
  ): SetScreenBrightnessParams = {
    val __obj = js.Dynamic.literal(value = value)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetScreenBrightnessParams]
  }
}

