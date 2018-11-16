package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.EventManager")
@js.native
class EventManager () extends js.Object

@JSGlobal("Ext.EventManager")
@js.native
object EventManager extends js.Object {
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(el: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The HTML element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes. This function is passed the following parameters:
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties:
  		*/
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(el: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to an element
  		* @param el String/HTMLElement The html element or id to assign the event handler to.
  		* @param eventName String The name of the event to listen for.
  		* @param handler Function The handler function the event invokes.
  		* @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
  		* @param options Object An object containing standard addListener options
  		*/
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the document is ready before onload and before images are loaded */
  def onDocumentReady(): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 50 millisecond
  		* @param fn Function The handler function the window resize event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowResize(): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 50 millisecond
  		* @param fn Function The handler function the window resize event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowResize(fn: js.Any): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 50 millisecond
  		* @param fn Function The handler function the window resize event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowResize(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 50 millisecond
  		* @param fn Function The handler function the window resize event invokes.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
  		* @param options Boolean Options object as passed to Ext.Element.addListener
  		*/
  def onWindowResize(fn: js.Any, scope: js.Any, options: scala.Boolean): scala.Unit = js.native
  /** [Method] Removes all event handers from an element
  		* @param el String/HTMLElement The id or html element from which to remove all event handlers.
  		*/
  def removeAll(): scala.Unit = js.native
  /** [Method] Removes all event handers from an element
  		* @param el String/HTMLElement The id or html element from which to remove all event handlers.
  		*/
  def removeAll(el: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(el: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(el: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(el: js.Any, eventName: java.lang.String): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler from an element
  		* @param el String/HTMLElement The id or html element from which to remove the listener.
  		* @param eventName String The name of the event.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		*/
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): scala.Unit = js.native
}
