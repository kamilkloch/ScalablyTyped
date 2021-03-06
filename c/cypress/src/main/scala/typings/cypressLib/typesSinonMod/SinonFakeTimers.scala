package typings
package cypressLib.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeTimers extends js.Object {
  var now: scala.Double = js.native
  def Date(): stdLib.Date = js.native
  def Date(year: scala.Double): stdLib.Date = js.native
  def Date(year: scala.Double, month: scala.Double): stdLib.Date = js.native
  def Date(year: scala.Double, month: scala.Double, day: scala.Double): stdLib.Date = js.native
  def Date(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double): stdLib.Date = js.native
  def Date(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): stdLib.Date = js.native
  def Date(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): stdLib.Date = js.native
  def Date(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double,
    ms: scala.Double
  ): stdLib.Date = js.native
  def cancelAnimationFrame(id: scala.Double): scala.Unit = js.native
  def clearImmediate(id: SinonTimerId): scala.Unit = js.native
  def clearInterval(id: SinonTimerId): scala.Unit = js.native
  def clearTimeout(id: SinonTimerId): scala.Unit = js.native
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    */
  def next(): scala.Unit = js.native
  def nextTick(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Double = js.native
  def reset(): scala.Unit = js.native
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): scala.Unit = js.native
  /**
    * This runs all pending timers until there are none remaining. If new timers are added while it is executing they will be run as well.
    * This makes it easier to run asynchronous tests to completion without worrying about the number of timers they use, or the delays in those timers.
    */
  def runAll(): scala.Unit = js.native
  def runMicrotasks(): scala.Unit = js.native
  def runToFrame(): scala.Unit = js.native
  def runToLast(): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): SinonTimerId = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double, args: js.Any*): SinonTimerId = js.native
  /**
    * Simulate the user changing the system clock while your program is running. It changes the 'now' timestamp
    * without affecting timers, intervals or immediates.
    * @param now The new 'now' as a JavaScript Date
    */
  def setSystemTime(date: stdLib.Date): scala.Unit = js.native
  /**
    * Simulate the user changing the system clock while your program is running. It changes the 'now' timestamp
    * without affecting timers, intervals or immediates.
    * @param now The new 'now' in unix milliseconds
    */
  def setSystemTime(now: scala.Double): scala.Unit = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double, args: js.Any*): SinonTimerId = js.native
  def tick(ms: java.lang.String): scala.Unit = js.native
  /**
    * Tick the clock ahead time milliseconds.
    * Causes all timers scheduled within the affected time range to be called.
    * time may be the number of milliseconds to advance the clock by or a human-readable string.
    * Valid string formats are “08” for eight seconds, “01:00” for one minute and “02:34:10” for two hours, 34 minutes and ten seconds.
    * time may be negative, which causes the clock to change but won’t fire any callbacks.
    * @param ms
    */
  def tick(ms: scala.Double): scala.Unit = js.native
  def uninstall(): scala.Unit = js.native
}

