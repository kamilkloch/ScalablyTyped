package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLeft extends js.Object {
  var bottom: js.UndefOr[
    csstypeLib.csstypeMod.PaddingBottomProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingBottomProperty[jssLib.cssMod.Length]]]
  ]
  var left: js.UndefOr[
    csstypeLib.csstypeMod.PaddingLeftProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingLeftProperty[jssLib.cssMod.Length]]]
  ]
  var right: js.UndefOr[
    csstypeLib.csstypeMod.PaddingRightProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingRightProperty[jssLib.cssMod.Length]]]
  ]
  var top: js.UndefOr[
    csstypeLib.csstypeMod.PaddingTopProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingTopProperty[jssLib.cssMod.Length]]]
  ]
}

object Anon_BottomLeft {
  @scala.inline
  def apply(
    bottom: csstypeLib.csstypeMod.PaddingBottomProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingBottomProperty[jssLib.cssMod.Length]]] = null,
    left: csstypeLib.csstypeMod.PaddingLeftProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingLeftProperty[jssLib.cssMod.Length]]] = null,
    right: csstypeLib.csstypeMod.PaddingRightProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingRightProperty[jssLib.cssMod.Length]]] = null,
    top: csstypeLib.csstypeMod.PaddingTopProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.PaddingTopProperty[jssLib.cssMod.Length]]] = null
  ): Anon_BottomLeft = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomLeft]
  }
}

