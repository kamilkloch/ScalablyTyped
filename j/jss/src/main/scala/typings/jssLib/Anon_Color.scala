package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[
    csstypeLib.csstypeMod.BorderColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderColorProperty]]
  ]
  var style: js.UndefOr[
    csstypeLib.csstypeMod.BorderStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderStyleProperty]]
  ]
  var width: js.UndefOr[
    csstypeLib.csstypeMod.BorderWidthProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderWidthProperty[jssLib.cssMod.Length]]]
  ]
}

object Anon_Color {
  @scala.inline
  def apply(
    color: csstypeLib.csstypeMod.BorderColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderColorProperty]] = null,
    style: csstypeLib.csstypeMod.BorderStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderStyleProperty]] = null,
    width: csstypeLib.csstypeMod.BorderWidthProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BorderWidthProperty[jssLib.cssMod.Length]]] = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

