package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/metadata", "AsyncResultLocator")
@js.native
class AsyncResultLocator[T] ()
  extends nodeLib.eventsMod.EventEmitter
     with stdLib.Promise[T] {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag_AsyncResultLocator: jsforceLib.jsforceLibStrings.Promise = js.native
  def check(): stdLib.Promise[T] = js.native
  def check(callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def complete(): stdLib.Promise[T] = js.native
  def complete(callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def poll(interval: scala.Double, timeout: scala.Double): scala.Unit = js.native
}
