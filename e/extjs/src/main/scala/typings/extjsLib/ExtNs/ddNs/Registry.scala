package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.dd.Registry")
@js.native
class Registry () extends js.Object

@JSGlobal("Ext.dd.Registry")
@js.native
object Registry extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Returns the handle registered for a DOM Node by id
  		* @param id String/HTMLElement The DOM node or id to look up
  		* @returns Object handle The custom handle data
  		*/
  def getHandle(): js.Any = js.native
  /** [Method] Returns the handle registered for a DOM Node by id
  		* @param id String/HTMLElement The DOM node or id to look up
  		* @returns Object handle The custom handle data
  		*/
  def getHandle(id: js.Any): js.Any = js.native
  /** [Method] Returns the handle that is registered for the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object handle The custom handle data
  		*/
  def getHandleFromEvent(): js.Any = js.native
  /** [Method] Returns the handle that is registered for the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object handle The custom handle data
  		*/
  def getHandleFromEvent(e: stdLib.Event): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns a custom data object that is registered for a DOM node by id
  		* @param id String/HTMLElement The DOM node or id to look up
  		* @returns Object data The custom data
  		*/
  def getTarget(): js.Any = js.native
  /** [Method] Returns a custom data object that is registered for a DOM node by id
  		* @param id String/HTMLElement The DOM node or id to look up
  		* @returns Object data The custom data
  		*/
  def getTarget(id: js.Any): js.Any = js.native
  /** [Method] Returns a custom data object that is registered for the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object data The custom data
  		*/
  def getTargetFromEvent(): js.Any = js.native
  /** [Method] Returns a custom data object that is registered for the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object data The custom data
  		*/
  def getTargetFromEvent(e: stdLib.Event): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Registers a drag drop element
  		* @param element String/HTMLElement The id or DOM node to register
  		* @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
  		*/
  def register(): scala.Unit = js.native
  /** [Method] Registers a drag drop element
  		* @param element String/HTMLElement The id or DOM node to register
  		* @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
  		*/
  def register(element: js.Any): scala.Unit = js.native
  /** [Method] Registers a drag drop element
  		* @param element String/HTMLElement The id or DOM node to register
  		* @param data Object An custom data object that will be passed between the elements that are involved in drag drop operations. You can populate this object with any arbitrary properties that your own code knows how to interpret, plus there are some specific properties known to the Registry that should be populated in the data object (if applicable):
  		*/
  def register(element: js.Any, data: js.Any): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
  /** [Method] Unregister a drag drop element
  		* @param element String/HTMLElement The id or DOM node to unregister
  		*/
  def unregister(): scala.Unit = js.native
  /** [Method] Unregister a drag drop element
  		* @param element String/HTMLElement The id or DOM node to unregister
  		*/
  def unregister(element: js.Any): scala.Unit = js.native
}
