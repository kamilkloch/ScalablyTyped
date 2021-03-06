package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetectionIntervalInSeconds extends js.Object {
  var onStateChanged: chromeLib.chromeNs.idleNs.IdleStateChangedEvent
  def queryState(
    detectionIntervalInSeconds: scala.Double,
    callback: js.Function1[/* newState */ java.lang.String, scala.Unit]
  ): scala.Unit
  def setDetectionInterval(intervalInSeconds: scala.Double): scala.Unit
}

object Anon_CallbackDetectionIntervalInSeconds {
  @scala.inline
  def apply(
    onStateChanged: chromeLib.chromeNs.idleNs.IdleStateChangedEvent,
    queryState: (scala.Double, js.Function1[/* newState */ java.lang.String, scala.Unit]) => scala.Unit,
    setDetectionInterval: scala.Double => scala.Unit
  ): Anon_CallbackDetectionIntervalInSeconds = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged, queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
  
    __obj.asInstanceOf[Anon_CallbackDetectionIntervalInSeconds]
  }
}

