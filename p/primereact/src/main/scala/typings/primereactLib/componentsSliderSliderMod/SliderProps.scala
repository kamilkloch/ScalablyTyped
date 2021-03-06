package typings
package primereactLib.componentsSliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ primereactLib.Anon_OriginalEventValueEventNumber_158693640, scala.Unit]
  ] = js.undefined
  var onSlideEnd: js.UndefOr[
    js.Function1[/* e */ primereactLib.Anon_OriginalEventValueEventNumber_158693640, scala.Unit]
  ] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValueEventNumber_158693640 => scala.Unit = null,
    onSlideEnd: /* e */ primereactLib.Anon_OriginalEventValueEventNumber_158693640 => scala.Unit = null,
    orientation: java.lang.String = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    value: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(js.Any.fromFunction1(onSlideEnd))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

