package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GainOptions extends AudioNodeOptions {
  var gain: js.UndefOr[scala.Double] = js.undefined
}

object GainOptions {
  @scala.inline
  def apply(
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    gain: scala.Int | scala.Double = null
  ): GainOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GainOptions]
  }
}

