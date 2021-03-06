package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
     with avoscloudDashSdkLib.avoscloudDashSdkMod.SilentOption
     with avoscloudDashSdkLib.avoscloudDashSdkMod.UseMasterKeyOption
     with avoscloudDashSdkLib.avoscloudDashSdkMod.WaitOption

object SaveOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[SaveOptions]
  }
}

