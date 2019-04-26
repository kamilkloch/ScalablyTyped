package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basis extends js.Object {
  var basis: js.UndefOr[
    csstypeLib.csstypeMod.FlexBasisProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexBasisProperty[jssLib.cssMod.Length]]]
  ]
  var direction: js.UndefOr[
    csstypeLib.csstypeMod.FlexDirectionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexDirectionProperty]]
  ]
  var flow: js.UndefOr[
    csstypeLib.csstypeMod.FlexFlowProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexFlowProperty]]
  ]
  var grow: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber]]
  ]
  var shrink: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber]]
  ]
  var wrap: js.UndefOr[
    csstypeLib.csstypeMod.FlexWrapProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexWrapProperty]]
  ]
}

object Anon_Basis {
  @scala.inline
  def apply(
    basis: csstypeLib.csstypeMod.FlexBasisProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexBasisProperty[jssLib.cssMod.Length]]] = null,
    direction: csstypeLib.csstypeMod.FlexDirectionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexDirectionProperty]] = null,
    flow: csstypeLib.csstypeMod.FlexFlowProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexFlowProperty]] = null,
    grow: csstypeLib.csstypeMod.GlobalsNumber | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber]] = null,
    shrink: csstypeLib.csstypeMod.GlobalsNumber | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber]] = null,
    wrap: csstypeLib.csstypeMod.FlexWrapProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FlexWrapProperty]] = null
  ): Anon_Basis = {
    val __obj = js.Dynamic.literal()
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Basis]
  }
}

