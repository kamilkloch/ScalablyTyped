package typings
package shipitLib.shipitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit", JSImport.Namespace)
@js.native
object shipitModMembers extends js.Object {
  val domain: js.Any = js.native
  val doneCallback: js.Any = js.native
  val environment: java.lang.String = js.native
  val isRunning: scala.Boolean = js.native
  val seq: js.Array[js.Any] = js.native
  val tasks: Tasks = js.native
  def blTask(name: java.lang.String, depsOrFn: js.Array[java.lang.String]): js.Any = js.native
  def blTask(name: java.lang.String, depsOrFn: js.Array[java.lang.String], fn: js.Function0[scala.Unit]): js.Any = js.native
  def blTask(name: java.lang.String, depsOrFn: EmptyCallback): js.Any = js.native
  def blTask(name: java.lang.String, depsOrFn: EmptyCallback, fn: js.Function0[scala.Unit]): js.Any = js.native
  def emit(name: java.lang.String): js.Any = js.native
  def initConfig(config: js.Object): js.Any = js.native
  def local(command: java.lang.String): stdLib.PromiseLike[ShipitLocal] = js.native
  def local(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): stdLib.PromiseLike[ShipitLocal] = js.native
  def local(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): stdLib.PromiseLike[ShipitLocal] = js.native
  def log(log: js.Any*): scala.Unit = js.native
  def log(log: js.Any): scala.Unit = js.native
  def on(name: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): js.Any = js.native
  def remote(command: java.lang.String): stdLib.PromiseLike[ShipitLocal] = js.native
  def remote(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): stdLib.PromiseLike[ShipitLocal] = js.native
  def remote(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): stdLib.PromiseLike[ShipitLocal] = js.native
  def remoteCopy(src: java.lang.String, dest: java.lang.String): stdLib.PromiseLike[ShipitLocal] = js.native
  def remoteCopy(
    src: java.lang.String,
    dest: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions
  ): stdLib.PromiseLike[ShipitLocal] = js.native
  def remoteCopy(
    src: java.lang.String,
    dest: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): stdLib.PromiseLike[ShipitLocal] = js.native
  def start(tasks: java.lang.String*): js.Any = js.native
  def start(tasks: java.lang.String): js.Any = js.native
  def start(tasks: js.Array[java.lang.String]): js.Any = js.native
  def task(name: java.lang.String, depsOrFn: js.Array[java.lang.String]): js.Any = js.native
  def task(name: java.lang.String, depsOrFn: js.Array[java.lang.String], fn: js.Function0[scala.Unit]): js.Any = js.native
  def task(name: java.lang.String, depsOrFn: EmptyCallback): js.Any = js.native
  def task(name: java.lang.String, depsOrFn: EmptyCallback, fn: js.Function0[scala.Unit]): js.Any = js.native
}
