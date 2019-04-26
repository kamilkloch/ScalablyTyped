package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStyle extends js.Object {
  var color: js.UndefOr[
    csstypeLib.csstypeMod.OutlineColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineColorProperty]]
  ]
  var style: js.UndefOr[
    csstypeLib.csstypeMod.OutlineStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineStyleProperty]]
  ]
  var width: js.UndefOr[
    csstypeLib.csstypeMod.OutlineWidthProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineWidthProperty[jssLib.cssMod.Length]]]
  ]
}

object Anon_ColorStyle {
  @scala.inline
  def apply(
    color: csstypeLib.csstypeMod.OutlineColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineColorProperty]] = null,
    style: csstypeLib.csstypeMod.OutlineStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineStyleProperty]] = null,
    width: csstypeLib.csstypeMod.OutlineWidthProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.OutlineWidthProperty[jssLib.cssMod.Length]]] = null
  ): Anon_ColorStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorStyle]
  }
}

