package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNode]] = js.undefined
  var tipProps: js.UndefOr[stdLib.Partial[rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs.Props]] = js.undefined
}

object WithTooltipProps {
  @scala.inline
  def apply(
    tipFormatter: /* value */ scala.Double => reactLib.reactMod.ReactNode = null,
    tipProps: stdLib.Partial[rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs.Props] = null
  ): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tipProps != null) __obj.updateDynamic("tipProps")(tipProps)
    __obj.asInstanceOf[WithTooltipProps]
  }
}

