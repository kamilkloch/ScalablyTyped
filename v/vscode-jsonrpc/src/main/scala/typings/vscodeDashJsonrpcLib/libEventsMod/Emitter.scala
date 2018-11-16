package typings
package vscodeDashJsonrpcLib.libEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/events", "Emitter")
@js.native
class Emitter[T] () extends js.Object {
  def this(_options: EmitterOptions) = this()
  var _callbacks: js.Any = js.native
  var _event: js.Any = js.native
  var _options: js.UndefOr[js.Any] = js.native
  def dispose(): scala.Unit = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /**
       * For the public to allow to subscribe
       * to events from this Emitter
       */
  def event(listener: js.Function1[/* e */ T, _]): Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /**
       * For the public to allow to subscribe
       * to events from this Emitter
       */
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any): Disposable = js.native
  /**
       *
       * @param listener The listener function will be call when the event happens.
       * @param thisArgs The 'this' which will be used when calling the event listener.
       * @param disposables An array to which a {{IDisposable}} will be added. The
       * @return
      */
  /**
       * For the public to allow to subscribe
       * to events from this Emitter
       */
  def event(listener: js.Function1[/* e */ T, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
       * To be kept private to fire an event to
       * subscribers
       */
  def fire(event: T): js.Any = js.native
}

@JSImport("vscode-jsonrpc/lib/events", "Emitter")
@js.native
object Emitter extends js.Object {
  var _noop: js.Any = js.native
}
