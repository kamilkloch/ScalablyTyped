package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @typedef {Object} Rx.Scheduler
  * @property {Scheduler} queue Schedules on a queue in the current event frame
  * (trampoline scheduler). Use this for iteration operations.
  * @property {Scheduler} asap Schedules on the micro task queue, which is the same
  * queue used for promises. Basically after the current job, but before the next
  * job. Use this for asynchronous conversions.
  * @property {Scheduler} async Schedules work with `setInterval`. Use this for
  * time-based operations.
  * @property {Scheduler} animationFrame Schedules work with `requestAnimationFrame`.
  * Use this for synchronizing with the platform's painting
  */
@JSImport("rxjs-compat", "Scheduler")
@js.native
object Scheduler extends js.Object {
  var animationFrame: rxjsLib.internalTypesMod.SchedulerLike = js.native
  var asap: rxjsLib.internalTypesMod.SchedulerLike = js.native
  var async: rxjsLib.internalTypesMod.SchedulerLike = js.native
  var queue: rxjsLib.internalTypesMod.SchedulerLike = js.native
}

