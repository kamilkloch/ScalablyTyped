package typings
package jqueryDotPostmessageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * This method will call window.postMessage if available, setting the targetOrigin parameter to the base of the targetUrl parameter for maximum security in browsers that support it. If window.postMessage is not available, the target window’s location.hash will be used to pass the message. If an object is passed as the message param, it will be serialized into a string using the jQuery.param method.
    *
    * @param message A message to be passed to the other frame.
    * @param targetUrl The URL of the other frame this window is attempting to communicate with. This must be the exact URL (including any query string) of the other window for this script to work in browsers that don’t support window.postMessage.
    * @param target A reference to the other frame this window is attempting to communicate with. If omitted, defaults to `parent`.
    */
  def postMessage(message: java.lang.String, targetUrl: java.lang.String): scala.Unit = js.native
  def postMessage(message: java.lang.String, targetUrl: java.lang.String, target: stdLib.Window): scala.Unit = js.native
  /**
    * This method will call window.postMessage if available, setting the targetOrigin parameter to the base of the targetUrl parameter for maximum security in browsers that support it. If window.postMessage is not available, the target window’s location.hash will be used to pass the message. If an object is passed as the message param, it will be serialized into a string using the jQuery.param method.
    *
    * @param message An object to be serialized into a params string, using the jQuery.param method.
    * @param targetUrl The URL of the other frame this window is attempting to communicate with. This must be the exact URL (including any query string) of the other window for this script to work in browsers that don’t support window.postMessage.
    * @param target A reference to the other frame this window is attempting to communicate with. If omitted, defaults to `parent`.
    */
  def postMessage(message: org.scalablytyped.runtime.StringDictionary[js.Any], targetUrl: java.lang.String): scala.Unit = js.native
  def postMessage(
    message: org.scalablytyped.runtime.StringDictionary[js.Any],
    targetUrl: java.lang.String,
    target: stdLib.Window
  ): scala.Unit = js.native
  /**
    * Register a single callback for either a window.postMessage call, if supported, or if unsupported, for any change in the current window location.hash. If window.postMessage is supported and sourceOrigin is specified, the source window will be checked against this for maximum security. If window.postMessage is unsupported, a polling loop will be started to watch for changes to the location.hash.
    *
    * @param callback This callback will execute whenever a jQuery.postMessage message is received, provided the sourceOrigin matches. If callback is omitted, any existing receiveMessage event bind or polling loop will be canceled.
    * @param sourceOrigin If window.postMessage is available and this value is not equal to the event.origin property, the callback will not be called.
    * @param delay An optional zero-or-greater delay in milliseconds at which the polling loop will execute (for browser that don’t support window.postMessage). If omitted, defaults to 100.
    */
  def receiveMessage(callback: js.Function1[/* event */ stdLib.MessageEvent, _]): scala.Unit = js.native
  def receiveMessage(callback: js.Function1[/* event */ stdLib.MessageEvent, _], sourceOrigin: java.lang.String): scala.Unit = js.native
  def receiveMessage(
    callback: js.Function1[/* event */ stdLib.MessageEvent, _],
    sourceOrigin: java.lang.String,
    delay: scala.Double
  ): scala.Unit = js.native
  def receiveMessage(
    callback: js.Function1[/* event */ stdLib.MessageEvent, _],
    sourceOrigin: js.Function1[/* origin */ java.lang.String, scala.Boolean]
  ): scala.Unit = js.native
  def receiveMessage(
    callback: js.Function1[/* event */ stdLib.MessageEvent, _],
    sourceOrigin: js.Function1[/* origin */ java.lang.String, scala.Boolean],
    delay: scala.Double
  ): scala.Unit = js.native
}

