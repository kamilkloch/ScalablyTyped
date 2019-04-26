package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[
    csstypeLib.csstypeMod.MarginBottomProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginBottomProperty[jssLib.cssMod.Length]]]
  ]
  var left: js.UndefOr[
    csstypeLib.csstypeMod.MarginLeftProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginLeftProperty[jssLib.cssMod.Length]]]
  ]
  var right: js.UndefOr[
    csstypeLib.csstypeMod.MarginRightProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginRightProperty[jssLib.cssMod.Length]]]
  ]
  var top: js.UndefOr[
    csstypeLib.csstypeMod.MarginTopProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginTopProperty[jssLib.cssMod.Length]]]
  ]
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: csstypeLib.csstypeMod.MarginBottomProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginBottomProperty[jssLib.cssMod.Length]]] = null,
    left: csstypeLib.csstypeMod.MarginLeftProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginLeftProperty[jssLib.cssMod.Length]]] = null,
    right: csstypeLib.csstypeMod.MarginRightProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginRightProperty[jssLib.cssMod.Length]]] = null,
    top: csstypeLib.csstypeMod.MarginTopProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.MarginTopProperty[jssLib.cssMod.Length]]] = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

