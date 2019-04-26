package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurColor extends js.Object {
  var blur: jssLib.cssMod.Length
  var color: js.UndefOr[
    csstypeLib.csstypeMod.ColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ColorProperty]]
  ]
  var x: jssLib.cssMod.Length
  var y: jssLib.cssMod.Length
}

object Anon_BlurColor {
  @scala.inline
  def apply(
    blur: jssLib.cssMod.Length,
    x: jssLib.cssMod.Length,
    y: jssLib.cssMod.Length,
    color: csstypeLib.csstypeMod.ColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ColorProperty]] = null
  ): Anon_BlurColor = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlurColor]
  }
}

