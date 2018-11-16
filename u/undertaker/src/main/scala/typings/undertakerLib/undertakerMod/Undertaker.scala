package typings
package undertakerLib.undertakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Undertaker
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Takes a string or function (task) and returns a timestamp of the last time the task was run successfully.
       * The time will be the time the task started.  Returns undefined if the task has not been run.
       * @param task - Task.
       * @param [timeResolution] - Time resolution.
       */
  def lastRun(task: undertakerLib.undertakerMod.UndertakerNs.Task): scala.Double = js.native
  /**
       * Takes a string or function (task) and returns a timestamp of the last time the task was run successfully.
       * The time will be the time the task started.  Returns undefined if the task has not been run.
       * @param task - Task.
       * @param [timeResolution] - Time resolution.
       */
  def lastRun(task: undertakerLib.undertakerMod.UndertakerNs.Task, timeResolution: scala.Double): scala.Double = js.native
  /**
       * Takes a variable amount of strings (taskName) and/or functions (fn)
       * and returns a function of the composed tasks or functions.
       * Any taskNames are retrieved from the registry using the get method.
       *
       * When the returned function is executed, the tasks or functions will be executed in parallel,
       * all being executed at the same time. If an error occurs, all execution will complete.
       * @param tasks - list of tasks.
       */
  def parallel(tasks: undertakerLib.undertakerMod.UndertakerNs.Task*): undertakerLib.undertakerMod.UndertakerNs.TaskFunction = js.native
  /**
       * Takes a variable amount of strings (taskName) and/or functions (fn)
       * and returns a function of the composed tasks or functions.
       * Any taskNames are retrieved from the registry using the get method.
       *
       * When the returned function is executed, the tasks or functions will be executed in parallel,
       * all being executed at the same time. If an error occurs, all execution will complete.
       * @param tasks - list of tasks.
       */
  def parallel(tasks: js.Array[undertakerLib.undertakerMod.UndertakerNs.Task]): undertakerLib.undertakerMod.UndertakerNs.TaskFunction = js.native
  /**
       * Returns the current registry object.
       */
  def registry(): undertakerDashRegistryLib.undertakerDashRegistryMod.namespaced = js.native
  /**
       * The tasks from the current registry will be transferred to it
       * and the current registry will be replaced with the new registry.
       * @param registry - Instance of registry.
       */
  def registry(registry: undertakerDashRegistryLib.undertakerDashRegistryMod.namespaced): scala.Unit = js.native
  /**
       * Takes a variable amount of strings (taskName) and/or functions (fn)
       * and returns a function of the composed tasks or functions.
       * Any taskNames are retrieved from the registry using the get method.
       *
       * When the returned function is executed, the tasks or functions will be executed in series,
       * each waiting for the prior to finish. If an error occurs, execution will stop.
       * @param tasks - List of tasks.
       */
  def series(tasks: undertakerLib.undertakerMod.UndertakerNs.Task*): undertakerLib.undertakerMod.UndertakerNs.TaskFunction = js.native
  /**
       * Takes a variable amount of strings (taskName) and/or functions (fn)
       * and returns a function of the composed tasks or functions.
       * Any taskNames are retrieved from the registry using the get method.
       *
       * When the returned function is executed, the tasks or functions will be executed in series,
       * each waiting for the prior to finish. If an error occurs, execution will stop.
       * @param tasks - List of tasks.
       */
  def series(tasks: js.Array[undertakerLib.undertakerMod.UndertakerNs.Task]): undertakerLib.undertakerMod.UndertakerNs.TaskFunction = js.native
  /**
       * Register the task by the name property of the function.
       * @param fn - Task function.
       */
  def task(fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction): scala.Unit = js.native
  /**
       * Returns the registered function.
       * @param taskName - Task name.
       */
  def task(taskName: java.lang.String): undertakerLib.undertakerMod.UndertakerNs.TaskFunction = js.native
  /**
       * Register the task by the taskName.
       * @param taskName - Task name.
       * @param fn - Task function.
       */
  def task(taskName: java.lang.String, fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction): scala.Unit = js.native
  /**
       * Optionally takes an object (options) and returns an object representing the tree of registered tasks.
       * @param options - Tree options.
       */
  def tree(): undertakerLib.undertakerMod.UndertakerNs.TreeResult = js.native
  /**
       * Optionally takes an object (options) and returns an object representing the tree of registered tasks.
       * @param options - Tree options.
       */
  def tree(options: undertakerLib.undertakerMod.UndertakerNs.TreeOptions): undertakerLib.undertakerMod.UndertakerNs.TreeResult = js.native
}
