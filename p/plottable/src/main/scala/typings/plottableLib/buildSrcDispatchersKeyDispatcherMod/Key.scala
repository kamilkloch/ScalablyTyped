package typings
package plottableLib.buildSrcDispatchersKeyDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key")
@js.native
class Key ()
  extends plottableLib.buildSrcDispatchersDispatcherMod.Dispatcher {
  /* private */ def _processKeydown(event: js.Any): js.Any = js.native
  /* private */ def _processKeyup(event: js.Any): js.Any = js.native
  /**
       * Removes the callback to be called whenever a key is pressed.
       *
       * @param {KeyCallback} callback
       * @return {Dispatchers.Key} The calling Key Dispatcher.
       */
  def offKeyDown(callback: KeyCallback): this.type = js.native
  /**
       * Removes the callback to be called whenever a key is released.
       *
       * @param {KeyCallback} callback
       * @return {Dispatchers.Key} The calling Key Dispatcher.
       */
  def offKeyUp(callback: KeyCallback): this.type = js.native
  /**
       * Registers a callback to be called whenever a key is pressed.
       *
       * @param {KeyCallback} callback
       * @return {Dispatchers.Key} The calling Key Dispatcher.
       */
  def onKeyDown(callback: KeyCallback): this.type = js.native
  /** Registers a callback to be called whenever a key is released.
       *
       * @param {KeyCallback} callback
       * @return {Dispatchers.Key} The calling Key Dispatcher.
       */
  def onKeyUp(callback: KeyCallback): this.type = js.native
}

@JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key")
@js.native
object Key extends js.Object {
  var _DISPATCHER_KEY: js.Any = js.native
  var _KEYDOWN_EVENT_NAME: js.Any = js.native
  var _KEYUP_EVENT_NAME: js.Any = js.native
  /**
       * Gets a Key Dispatcher. If one already exists it will be returned;
       * otherwise, a new one will be created.
       *
       * @return {Dispatchers.Key}
       */
  def getDispatcher(): plottableLib.buildSrcDispatchersMod.Key = js.native
}
