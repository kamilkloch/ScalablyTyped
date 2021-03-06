package typings
package globDashWatcherLib.globDashWatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob-watcher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Watch globs and execute a function upon change, with intelligent defaults for debouncing and queueing.
    * @param globs Takes a glob string or an array of glob strings as the first argument.
    * Globs are executed in order, so negations should follow positive globs
    * fs.src(['!b*.js', '*.js']) would not exclude any files, but this would: fs.src(['*.js', '!b*.js'])
    */
  def apply(globs: js.Array[java.lang.String] | java.lang.String): nodeLib.fsMod.FSWatcher = js.native
  def apply(
    globs: java.lang.String | js.Array[java.lang.String],
    cb: (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit]) | js.Function0[AsyncType]
  ): nodeLib.fsMod.FSWatcher = js.native
  def apply(globs: java.lang.String | js.Array[java.lang.String], opt: WatchOptions): nodeLib.fsMod.FSWatcher = js.native
  def apply(
    globs: java.lang.String | js.Array[java.lang.String],
    opt: WatchOptions,
    cb: (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit]) | js.Function0[AsyncType]
  ): nodeLib.fsMod.FSWatcher = js.native
}

