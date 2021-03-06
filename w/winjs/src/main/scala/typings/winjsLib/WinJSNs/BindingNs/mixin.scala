package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a standard implementation of the bindable contract, as well as a basic storage mechanism that participates in change notification and an asynchronous notification implementation.
  **/
@JSGlobal("WinJS.Binding.mixin")
@js.native
object mixin extends js.Object {
  //#region Methods
  /**
    * Adds a property to the object. The property includes change notification and an ECMAScript 5 property definition .
    * @param name The name of the property to add.
    * @param value The value of the property.
    * @returns This object is returned.
    **/
  def addProperty(name: java.lang.String, value: js.Any): js.Any = js.native
  /**
    * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
    * @param name The name of the property to which to bind the action.
    * @param action The function to invoke asynchronously when the property may have changed.
    * @returns This object is returned.
    **/
  def bind(name: java.lang.String, action: js.Any): js.Function = js.native
  /**
    * Gets a property value by name.
    * @param name The name of the property to get.
    * @returns The value of the property as an observable object.
    **/
  def getProperty(name: java.lang.String): js.Any = js.native
  /**
    * Notifies listeners that a property value was updated.
    * @param name The name of the property that is being updated.
    * @param newValue The new value for the property.
    * @param oldValue The old value for the property.
    * @returns A promise that is completed when the notifications are complete.
    **/
  def notify(name: java.lang.String, newValue: java.lang.String, oldValue: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Removes a property value.
    * @param name The name of the property to remove.
    * @returns This object is returned.
    **/
  def removeProperty(name: java.lang.String): js.Any = js.native
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns This object is returned.
    **/
  def setProperty(name: java.lang.String, value: js.Any): js.Any = js.native
  /**
    * Removes one or more listeners from the notification list for a given property.
    * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
    * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
    * @returns This object is returned.
    **/
  def unbind(name: java.lang.String, action: js.Function): js.Any = js.native
  /**
    * Updates a property value and notifies any listeners.
    * @param name The name of the property to update.
    * @param value The new value of the property.
    * @returns A promise that completes when the notifications for this property change have been processed. If multiple notifications are coalesced, the promise may be canceled or the value of the promise may be updated. The fulfilled value of the promise is the new value of the property for which the notifications have been completed.
    **/
  def updateProperty(name: java.lang.String, value: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
}

