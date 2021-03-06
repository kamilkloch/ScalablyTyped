package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePresetResponse extends js.Object {
  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  var Preset: js.UndefOr[Preset] = js.undefined
}

object CreatePresetResponse {
  @scala.inline
  def apply(Preset: Preset = null): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset)
    __obj.asInstanceOf[CreatePresetResponse]
  }
}

