package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  /**
     * Registers a listener.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_self The object in whose scope to invoke the listener.
     * @param {boolean=} opt_oneshot Whether the listener should b (e removed after
     *    the first event is fired.
     * @return {!EventEmitter} A self reference.
     * @private
     */
  def addListener(`type`: java.lang.String, fn: js.Function): EventEmitter = js.native
  /**
     * Registers a listener.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_self The object in whose scope to invoke the listener.
     * @param {boolean=} opt_oneshot Whether the listener should b (e removed after
     *    the first event is fired.
     * @return {!EventEmitter} A self reference.
     * @private
     */
  def addListener(`type`: java.lang.String, fn: js.Function, opt_scope: js.Any): EventEmitter = js.native
  /**
     * Registers a listener.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_self The object in whose scope to invoke the listener.
     * @param {boolean=} opt_oneshot Whether the listener should b (e removed after
     *    the first event is fired.
     * @return {!EventEmitter} A self reference.
     * @private
     */
  def addListener(`type`: java.lang.String, fn: js.Function, opt_scope: js.Any, opt_oneshot: scala.Boolean): EventEmitter = js.native
  // endregion
  // region Methods
  /**
     * Fires an event and calls all listeners.
     * @param {string} type The type of event to emit.
     * @param {...*} var_args Any arguments to pass to each listener.
     */
  def emit(`type`: java.lang.String, var_args: js.Any*): scala.Unit = js.native
  /**
     * Returns a mutable list of listeners for a specific type of event.
     * @param {string} type The type of event to retrieve the listeners for.
     * @return {!Set<!Listener>} The registered listeners for the given event
     *     type.
     */
  def listeners(`type`: java.lang.String): js.Any = js.native
  /**
     * An alias for {@code #addListener()}.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_scope The object in whose scope to invoke the listener.
     * @return {!EventEmitter} A self reference.
     */
  def on(`type`: java.lang.String, fn: js.Function): EventEmitter = js.native
  /**
     * An alias for {@code #addListener()}.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_scope The object in whose scope to invoke the listener.
     * @return {!EventEmitter} A self reference.
     */
  def on(`type`: java.lang.String, fn: js.Function, opt_scope: js.Any): EventEmitter = js.native
  /**
     * Registers a one-time listener which will be called only the first time an
     * event is emitted, after which it will be removed.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_scope The object in whose scope to invoke the listener.
     * @return {!EventEmitter} A self reference.
     */
  def once(`type`: java.lang.String, fn: js.Any): EventEmitter = js.native
  /**
     * Registers a one-time listener which will be called only the first time an
     * event is emitted, after which it will be removed.
     * @param {string} type The type of event to listen for.
     * @param {!Function} fn The function to invoke when the event is fired.
     * @param {Object=} opt_scope The object in whose scope to invoke the listener.
     * @return {!EventEmitter} A self reference.
     */
  def once(`type`: java.lang.String, fn: js.Any, opt_scope: js.Any): EventEmitter = js.native
  /**
     * Removes all listeners for a specific type of event. If no event is
     * specified, all listeners across all types will be removed.
     * @param {string=} opt_type The type of event to remove listeners from.
     * @return {!EventEmitter} A self reference.
     */
  def removeAllListeners(): EventEmitter = js.native
  /**
     * Removes all listeners for a specific type of event. If no event is
     * specified, all listeners across all types will be removed.
     * @param {string=} opt_type The type of event to remove listeners from.
     * @return {!EventEmitter} A self reference.
     */
  def removeAllListeners(opt_type: java.lang.String): EventEmitter = js.native
  /**
     * Removes a previously registered event listener.
     * @param {string} type The type of event to unregister.
     * @param {!Function} listenerFn The handler function to remove.
     * @return {!EventEmitter} A self reference.
     */
  def removeListener(`type`: java.lang.String, listenerFn: js.Function): EventEmitter = js.native
}
