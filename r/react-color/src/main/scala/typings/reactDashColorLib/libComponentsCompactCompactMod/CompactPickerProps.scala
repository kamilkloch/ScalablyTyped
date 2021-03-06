package typings
package reactDashColorLib.libComponentsCompactCompactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[CompactPicker] {
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.ColorResult, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
}

object CompactPickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    colors: js.Array[java.lang.String] = null,
    key: reactLib.reactMod.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onSwatchHover: (/* color */ reactDashColorLib.reactDashColorMod.ColorResult, /* event */ stdLib.MouseEvent) => scala.Unit = null,
    ref: reactLib.reactMod.LegacyRef[CompactPicker] = null
  ): CompactPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactPickerProps]
  }
}

