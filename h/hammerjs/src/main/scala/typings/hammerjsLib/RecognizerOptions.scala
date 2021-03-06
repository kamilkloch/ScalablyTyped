package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizerOptions extends js.Object {
  var direction: js.UndefOr[scala.Double] = js.undefined
  var enable: js.UndefOr[
    scala.Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, scala.Boolean])
  ] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var pointers: js.UndefOr[scala.Double] = js.undefined
  var posThreshold: js.UndefOr[scala.Double] = js.undefined
  var taps: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

object RecognizerOptions {
  @scala.inline
  def apply(
    direction: scala.Int | scala.Double = null,
    enable: scala.Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, scala.Boolean]) = null,
    event: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    pointers: scala.Int | scala.Double = null,
    posThreshold: scala.Int | scala.Double = null,
    taps: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null,
    time: scala.Int | scala.Double = null,
    velocity: scala.Int | scala.Double = null
  ): RecognizerOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (pointers != null) __obj.updateDynamic("pointers")(pointers.asInstanceOf[js.Any])
    if (posThreshold != null) __obj.updateDynamic("posThreshold")(posThreshold.asInstanceOf[js.Any])
    if (taps != null) __obj.updateDynamic("taps")(taps.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizerOptions]
  }
}

