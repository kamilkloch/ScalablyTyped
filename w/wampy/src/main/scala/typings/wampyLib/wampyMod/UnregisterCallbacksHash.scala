package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnregisterCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object UnregisterCallbacksHash {
  @scala.inline
  def apply(onError: ErrorCallback = null, onSuccess: Callback = null): UnregisterCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[UnregisterCallbacksHash]
  }
}

