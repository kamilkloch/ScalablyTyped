package typings
package baconjsLib.BaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Error
  * @augments Bacon.Event
  * @description An error event. Call [Event.isError]{@link Bacon.Event#isError} to distinguish these events in your subscriber, or use [onError]{@link Bacon.Observable#onError} to react to error events only. [Error.error]{@link Bacon.Error#error} returns the associated error object (usually string). [Error]{@link Bacon.Error} events are always passed through all stream combinators. So, even if you filter all values out, the error events will pass through. If you use [Observable.flatMap]{@link Bacon.Observable#flatMap}, the result stream will contain Error events from the source as well as all the spawned stream. You can take action on errors by using the [Observable.onError]{@link Bacon.Observable#onError}. See documentation on [Observable.onError]{@link Bacon.Observable#onError}, [EventStream.mapError]{@link Bacon.EventStream#mapError}, [Property.mapError]{@link Bacon.Property#mapError}, [EventStream.errors]{@link Bacon.EventStream#errors}, [Property.errors]{@link Bacon.Property#errors}, [EventStream.skipErrors]{@link Bacon.EventStream#skipErrors}, [Property.skipErrors]{@link Bacon.Property#skipErrors}, [Bacon.retry]{@link Bacon.retry} and [Observable.flatMapError]{@link Bacon.Observable#flatMapError}. An Error does not terminate the stream. The methods [EventStream.endOnError]{@link Bacon.EventStream#endOnError} and [EventStream.endOnError]{@link Bacon.EventStream#endOnError}  returns a stream/property that ends immediately after first error. Bacon.js doesn't currently generate any Error events itself (except when converting errors using [Bacon.fromPromise]{@link Bacon.fromPromise}). Error events definitely would be generated by streams derived from IO sources such as AJAX calls.
  * @example
  * // In case you want to convert (some) value events into Error events, you may use `flatMap` like this:
  * Bacon.fromArray([1, 2, 3, 4]).flatMap<number>(x => {
  *   NOTE: had to explicitly specify the `<number>` typing for `flatMap`.
  *   return x > 2 ? new Bacon.Error("too big") : x;
  * });
  *
  * // Conversely, if you want to convert some Error events into value events, you may use `flatMapError`:
  * Bacon.fromArray([1, 2, 3, 4]).flatMapError(error => {
  *   let isNonCriticalError = error => Math.random() < .5,
  *     handleNonCriticalError = error => 42;
  *   return isNonCriticalError(error) ? handleNonCriticalError(error) : new Bacon.Error(error);
  * });
  *
  * // Note also that Bacon.js combinators do not catch errors that are thrown. Especially `map` doesn't do so. If you want to map things and wrap caught errors into Error events, you can do the following:
  * Bacon.fromArray([1, 2, 3, 4]).flatMap(x => {
  *   let dangerousFunction = x => {
  *     throw new Error("dangerous function!");
  *   };
  *   try {
  *     return dangerousFunction(x);
  *   } catch (e) {
  *     return new Bacon.Error(e);
  *   }
  * });
  */
@JSGlobal("Bacon.Error")
@js.native
class Error[E] protected () extends Event[E] {
  /**
    * @constructor
    * @constructs Error
    * @param {E} error
    * */
  def this(error: E) = this()
  /**
    * @property Error#error
    * @description Returns the `error` associated with an [Error]{@link Bacon.Error} event.
    * @returns {E}
    */
  var error: E = js.native
}

