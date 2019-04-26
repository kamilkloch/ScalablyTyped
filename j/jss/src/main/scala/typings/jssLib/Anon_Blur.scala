package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blur extends js.Object {
  var blur: jssLib.cssMod.Length
  var color: js.UndefOr[
    csstypeLib.csstypeMod.ColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ColorProperty]]
  ]
  var inset: js.UndefOr[jssLib.jssLibStrings.inset] = js.undefined
  var spread: jssLib.cssMod.Length
  var x: jssLib.cssMod.Length
  var y: jssLib.cssMod.Length
}

object Anon_Blur {
  @scala.inline
  def apply(
    blur: jssLib.cssMod.Length,
    spread: jssLib.cssMod.Length,
    x: jssLib.cssMod.Length,
    y: jssLib.cssMod.Length,
    color: csstypeLib.csstypeMod.ColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ColorProperty]] = null,
    inset: jssLib.jssLibStrings.inset = null
  ): Anon_Blur = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset)
    __obj.asInstanceOf[Anon_Blur]
  }
}

