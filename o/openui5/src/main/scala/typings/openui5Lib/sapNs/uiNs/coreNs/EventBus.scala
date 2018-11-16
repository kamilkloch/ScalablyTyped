package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.EventBus")
@js.native
class EventBus ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Fires an event using the specified settings and notifies all attached event handlers.
           * @param sChannelId The channel of the event to fire. If not given, the default channel is used. The
           * channel <code>"sap.ui"</code> is                        reserved by the UI5 framework. An
           * application might listen to events on this channel but is not allowed                        to
           * publish its own events there.
           * @param sEventId The identifier of the event to fire
           * @param oData The parameters which should be carried by the event
          */
  def publish(sChannelId: java.lang.String, sEventId: java.lang.String): scala.Unit = js.native
  /**
           * Fires an event using the specified settings and notifies all attached event handlers.
           * @param sChannelId The channel of the event to fire. If not given, the default channel is used. The
           * channel <code>"sap.ui"</code> is                        reserved by the UI5 framework. An
           * application might listen to events on this channel but is not allowed                        to
           * publish its own events there.
           * @param sEventId The identifier of the event to fire
           * @param oData The parameters which should be carried by the event
          */
  def publish(sChannelId: java.lang.String, sEventId: java.lang.String, oData: js.Any): scala.Unit = js.native
  /**
           * Attaches an event handler to the event with the given identifier on the given event channel.
           * @param sChannelId The channel of the event to subscribe to. If not given, the default channel is
           * used.                        The channel <code>"sap.ui"</code> is reserved by the UI5 framework. An
           * application might listen to                        events on this channel but is not allowed to
           * publish its own events there.
           * @param sEventId The identifier of the event to listen for
           * @param fnFunction The handler function to call when the event occurs. This function will be called
           * in the context of the                      <code>oListener</code> instance (if present) or on the
           * event bus instance. The channel is provided as first argument of the handler, and                   
           *   the event identifier is provided as the second argument. The parameter map carried by the event is
           * provided as the third argument (if present).                      Handlers must not change the
           * content of this map.
           * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
           * context within the                       handler function). If it is not specified, the handler
           * function is called in the context of the event bus.
           * @returns Returns <code>this</code> to allow method chaining
          */
  def subscribe(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any): EventBus = js.native
  /**
           * Attaches an event handler to the event with the given identifier on the given event channel.
           * @param sChannelId The channel of the event to subscribe to. If not given, the default channel is
           * used.                        The channel <code>"sap.ui"</code> is reserved by the UI5 framework. An
           * application might listen to                        events on this channel but is not allowed to
           * publish its own events there.
           * @param sEventId The identifier of the event to listen for
           * @param fnFunction The handler function to call when the event occurs. This function will be called
           * in the context of the                      <code>oListener</code> instance (if present) or on the
           * event bus instance. The channel is provided as first argument of the handler, and                   
           *   the event identifier is provided as the second argument. The parameter map carried by the event is
           * provided as the third argument (if present).                      Handlers must not change the
           * content of this map.
           * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
           * context within the                       handler function). If it is not specified, the handler
           * function is called in the context of the event bus.
           * @returns Returns <code>this</code> to allow method chaining
          */
  def subscribe(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any, oListener: js.Any): EventBus = js.native
  /**
           * Attaches an event handler, called one time only, to the event with the given identifier on the given
           * event channel.When the event occurs, the handler function is called and the handler registration is
           * automatically removed afterwards.
           * @since 1.32.0
           * @param sChannelId The channel of the event to subscribe to. If not given, the default channel is
           * used.                        The channel <code>"sap.ui"</code> is reserved by the UI5 framework. An
           * application might listen to                        events on this channel but is not allowed to
           * publish its own events there.
           * @param sEventId The identifier of the event to listen for
           * @param fnFunction The handler function to call when the event occurs. This function will be called
           * in the context of the                      <code>oListener</code> instance (if present) or on the
           * event bus instance. The channel is provided as first argument of the handler, and                   
           *   the event identifier is provided as the second argument. The parameter map carried by the event is
           * provided as the third argument (if present).                      Handlers must not change the
           * content of this map.
           * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
           * context within the                       handler function). If it is not specified, the handler
           * function is called in the context of the event bus.
           * @returns Returns <code>this</code> to allow method chaining
          */
  def subscribeOnce(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any): EventBus = js.native
  /**
           * Attaches an event handler, called one time only, to the event with the given identifier on the given
           * event channel.When the event occurs, the handler function is called and the handler registration is
           * automatically removed afterwards.
           * @since 1.32.0
           * @param sChannelId The channel of the event to subscribe to. If not given, the default channel is
           * used.                        The channel <code>"sap.ui"</code> is reserved by the UI5 framework. An
           * application might listen to                        events on this channel but is not allowed to
           * publish its own events there.
           * @param sEventId The identifier of the event to listen for
           * @param fnFunction The handler function to call when the event occurs. This function will be called
           * in the context of the                      <code>oListener</code> instance (if present) or on the
           * event bus instance. The channel is provided as first argument of the handler, and                   
           *   the event identifier is provided as the second argument. The parameter map carried by the event is
           * provided as the third argument (if present).                      Handlers must not change the
           * content of this map.
           * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
           * context within the                       handler function). If it is not specified, the handler
           * function is called in the context of the event bus.
           * @returns Returns <code>this</code> to allow method chaining
          */
  def subscribeOnce(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any, oListener: js.Any): EventBus = js.native
  /**
           * Removes a previously subscribed event handler from the event with the given identifier on the given
           * event channel.The passed parameters must match those used for registration with {@link #subscribe }
           * beforehand!
           * @param sChannelId The channel of the event to unsubscribe from. If not given, the default channel is
           * used.
           * @param sEventId The identifier of the event to unsubscribe from
           * @param fnFunction The handler function to unsubscribe from the event
           * @param oListener The object that wanted to be notified when the event occurred
           * @returns Returns <code>this</code> to allow method chaining
          */
  def unsubscribe(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any): EventBus = js.native
  /**
           * Removes a previously subscribed event handler from the event with the given identifier on the given
           * event channel.The passed parameters must match those used for registration with {@link #subscribe }
           * beforehand!
           * @param sChannelId The channel of the event to unsubscribe from. If not given, the default channel is
           * used.
           * @param sEventId The identifier of the event to unsubscribe from
           * @param fnFunction The handler function to unsubscribe from the event
           * @param oListener The object that wanted to be notified when the event occurred
           * @returns Returns <code>this</code> to allow method chaining
          */
  def unsubscribe(sChannelId: java.lang.String, sEventId: java.lang.String, fnFunction: js.Any, oListener: js.Any): EventBus = js.native
}
