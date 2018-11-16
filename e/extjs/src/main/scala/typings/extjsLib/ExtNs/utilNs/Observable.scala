package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Observable")
@js.native
class Observable () extends js.Object

@JSGlobal("Ext.util.Observable")
@js.native
object Observable extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Starts capture on the specified Observable
  		* @param o Ext.util.Observable The Observable to capture events from.
  		* @param fn Function The function to call when an event is fired.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
  		*/
  def capture(): scala.Unit = js.native
  /** [Method] Starts capture on the specified Observable
  		* @param o Ext.util.Observable The Observable to capture events from.
  		* @param fn Function The function to call when an event is fired.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
  		*/
  def capture(o: extjsLib.ExtNs.utilNs.IObservable): scala.Unit = js.native
  /** [Method] Starts capture on the specified Observable
  		* @param o Ext.util.Observable The Observable to capture events from.
  		* @param fn Function The function to call when an event is fired.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
  		*/
  def capture(o: extjsLib.ExtNs.utilNs.IObservable, fn: js.Any): scala.Unit = js.native
  /** [Method] Starts capture on the specified Observable
  		* @param o Ext.util.Observable The Observable to capture events from.
  		* @param fn Function The function to call when an event is fired.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Observable firing the event.
  		*/
  def capture(o: extjsLib.ExtNs.utilNs.IObservable, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(alias: js.Any): scala.Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Sets observability on the passed class constructor
  		* @param c Function The class constructor to make observable.
  		* @param listeners Object An object containing a series of listeners to add. See addListener.
  		*/
  def observe(): scala.Unit = js.native
  /** [Method] Sets observability on the passed class constructor
  		* @param c Function The class constructor to make observable.
  		* @param listeners Object An object containing a series of listeners to add. See addListener.
  		*/
  def observe(c: js.Any): scala.Unit = js.native
  /** [Method] Sets observability on the passed class constructor
  		* @param c Function The class constructor to make observable.
  		* @param listeners Object An object containing a series of listeners to add. See addListener.
  		*/
  def observe(c: js.Any, listeners: js.Any): scala.Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Removes all added captures from the Observable
  		* @param o Ext.util.Observable The Observable to release
  		*/
  def releaseCapture(): scala.Unit = js.native
  /** [Method] Removes all added captures from the Observable
  		* @param o Ext.util.Observable The Observable to release
  		*/
  def releaseCapture(o: extjsLib.ExtNs.utilNs.IObservable): scala.Unit = js.native
}
