package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]]
  ]
  var direction: js.UndefOr[
    csstypeLib.csstypeMod.AnimationDirectionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationDirectionProperty]]
  ]
  var duration: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]]
  ]
  var iterationCount: js.UndefOr[
    csstypeLib.csstypeMod.AnimationIterationCountProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationIterationCountProperty]]
  ]
  var name: js.UndefOr[
    csstypeLib.csstypeMod.AnimationNameProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationNameProperty]]
  ]
  var playState: js.UndefOr[
    csstypeLib.csstypeMod.AnimationPlayStateProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationPlayStateProperty]]
  ]
  var timingFunction: js.UndefOr[
    csstypeLib.csstypeMod.AnimationTimingFunctionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationTimingFunctionProperty]]
  ]
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]] = null,
    direction: csstypeLib.csstypeMod.AnimationDirectionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationDirectionProperty]] = null,
    duration: csstypeLib.csstypeMod.GlobalsString | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.GlobalsString]] = null,
    iterationCount: csstypeLib.csstypeMod.AnimationIterationCountProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationIterationCountProperty]] = null,
    name: csstypeLib.csstypeMod.AnimationNameProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationNameProperty]] = null,
    playState: csstypeLib.csstypeMod.AnimationPlayStateProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationPlayStateProperty]] = null,
    timingFunction: csstypeLib.csstypeMod.AnimationTimingFunctionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.AnimationTimingFunctionProperty]] = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (playState != null) __obj.updateDynamic("playState")(playState.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

