package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalEventSupport[T] extends js.Object {
  /**
       * Removes the callbacks for the specified events.
       * @param {string} [events] One or more events, separated by white space to turn off. If no events are specified, then the callbacks will be removed.
       * @param {function} [callback] The callback function to remove. If `callback` is not provided, all callbacks for the specified events will be removed.
       * @param {object} [context] The object that was used as `this`. Callbacks with this context will be removed.
       * @chainable
       */
  def off(events: java.lang.String, callback: js.Function): T = js.native
  /**
       * Removes the callbacks for the specified events.
       * @param {string} [events] One or more events, separated by white space to turn off. If no events are specified, then the callbacks will be removed.
       * @param {function} [callback] The callback function to remove. If `callback` is not provided, all callbacks for the specified events will be removed.
       * @param {object} [context] The object that was used as `this`. Callbacks with this context will be removed.
       * @chainable
       */
  def off(events: java.lang.String, callback: js.Function, context: js.Any): T = js.native
  /**
       * Creates a subscription or registers a callback for the specified event.
       * @param {string} events One or more events, separated by white space.
       * @returns {Subscription} A subscription is returned.
       */
  def on(events: java.lang.String): DurandalEventSubscription = js.native
  /**
       * Creates a subscription or registers a callback for the specified event.
       * @param {string} events One or more events, separated by white space.
       * @param {function} [callback] The callback function to invoke when the event is triggered.
       * @param {object} [context] An object to use as `this` when invoking the `callback`.
       * @returns {Events} The events object is returned for chaining.
       */
  def on(events: java.lang.String, callback: js.Function): T = js.native
  /**
       * Creates a subscription or registers a callback for the specified event.
       * @param {string} events One or more events, separated by white space.
       * @param {function} [callback] The callback function to invoke when the event is triggered.
       * @param {object} [context] An object to use as `this` when invoking the `callback`.
       * @returns {Events} The events object is returned for chaining.
       */
  def on(events: java.lang.String, callback: js.Function, context: js.Any): T = js.native
  /**
       * Creates a function that will trigger the specified events when called. Simplifies proxying jQuery (or other) events through to the events object.
       * @param {string} events One or more events, separated by white space to trigger by invoking the returned function.
       * @returns {function} Calling the function will invoke the previously specified events on the events object.
       */
  def proxy(events: java.lang.String): js.Function = js.native
  /**
       * Triggers the specified events.
       * @param {string} [events] One or more events, separated by white space to trigger.
       * @chainable
       */
  def trigger(events: java.lang.String, eventArgs: js.Any*): T = js.native
}
