package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDuration extends js.Object {
  var delay: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]]
  ]
  var duration: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]]
  ]
  var property: js.UndefOr[
    csstypeLib.csstypeMod.TransitionPropertyProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.TransitionPropertyProperty]]
  ]
  var timingFunction: js.UndefOr[
    csstypeLib.csstypeMod.TransitionTimingFunctionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.TransitionTimingFunctionProperty]]
  ]
}

object Anon_DelayDuration {
  @scala.inline
  def apply(
    delay: csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]] = null,
    duration: csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]] = null,
    property: csstypeLib.csstypeMod.TransitionPropertyProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.TransitionPropertyProperty]] = null,
    timingFunction: csstypeLib.csstypeMod.TransitionTimingFunctionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.TransitionTimingFunctionProperty]] = null
  ): Anon_DelayDuration = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelayDuration]
  }
}

