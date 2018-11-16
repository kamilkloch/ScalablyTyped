package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  /**
       * Reference to the Loader Class (set after the loader has been first imported)
       */
  var Loader: js.Any = js.native
  /**
      * The runtime's XMLHttpRequest API.
      */
  var XMLHttpRequest: aureliaDashPalLib.Anon_HEADERSRECEIVED = js.native
  /**
      * The runtime environment's global.
      */
  var global: js.Any = js.native
  /**
      * The runtime's history API.
      */
  var history: js.Any = js.native
  /**
      * The runtime's location API.
      */
  var location: js.Any = js.native
  /**
      * A function wich does nothing.
      */
  var noop: js.Function = js.native
  /**
      * The runtime's performance API
      */
  var performance: Performance = js.native
  /**
      * Add a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function that receives a notification when an event of the specified type occurs.
      * @param capture If true, useCapture indicates that the user wishes to initiate capture.
      */
  def addEventListener(eventName: java.lang.String, callback: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
      * Add a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function that receives a notification when an event of the specified type occurs.
      * @param capture If true, useCapture indicates that the user wishes to initiate capture.
      */
  def addEventListener(
    eventName: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
      * Iterate all modules loaded by the script loader.
      * @param callback A callback that will receive each module id along with the module object. Return true to end enumeration.
      */
  def eachModule(callback: js.Function2[/* key */ java.lang.String, /* value */ js.Object, scala.Boolean]): scala.Unit = js.native
  /**
       * Resolves a module name to a path resolvable by the loader. By default returns the first parameter.
       * It is recommended to use this for all dynamic imports as it enables static analysis
       * and optionally allows adding custom metadata used by the build step.
       *
       * References to this method should always literally call `PLATFORM.moduleName(...)`.
       * This enables the build step to statically optimize the code by replacing the reference with a string.
       *
       * @param moduleName Absolute or relative path to the module.
       * @param options Optional options used during the static analysis that inform how to process the module.
       */
  def moduleName(moduleName: java.lang.String): java.lang.String = js.native
  def moduleName(moduleName: java.lang.String, chunk: java.lang.String): java.lang.String = js.native
  /**
       * Resolves a module name to a path resolvable by the loader. By default returns the first parameter.
       * It is recommended to use this for all dynamic imports as it enables static analysis
       * and optionally allows adding custom metadata used by the build step.
       *
       * References to this method should always literally call `PLATFORM.moduleName(...)`.
       * This enables the build step to statically optimize the code by replacing the reference with a string.
       *
       * @param moduleName Absolute or relative path to the module.
       * @param options Optional options used during the static analysis that inform how to process the module.
       */
  def moduleName(moduleName: java.lang.String, options: ModuleNameOptions): java.lang.String = js.native
  /**
      * Remove a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function to remove from the event.
      * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
      */
  def removeEventListener(eventName: java.lang.String, callback: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
      * Remove a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function to remove from the event.
      * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
      */
  def removeEventListener(
    eventName: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
      * Registers a function to call when the system is ready to update (repaint) the display.
      * @param callback The function to call.
      * @return A long integer value, the request id, that uniquely identifies the entry in the callback list.
      */
  def requestAnimationFrame(callback: js.Function1[/* animationFrameStart */ scala.Double, scala.Unit]): scala.Double = js.native
}
