package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ModelManager")
@js.native
class ModelManager () extends js.Object

/* static members */
@JSGlobal("Ext.ModelManager")
@js.native
object ModelManager extends js.Object {
  /** [Property] (Ext.util.HashMap) */
  var all: senchaUnderscoreTouchLib.ExtNs.utilNs.IHashMap = js.native
  /** [Property] (Object) */
  var associationStack: js.Any = js.native
  /** [Property] (Object) */
  var defaultProxyType: js.Any = js.native
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Creates a new instance of a Model using the given data
  		* @param data Object Data to initialize the Model's fields with.
  		* @param name String The name of the model to create.
  		* @param id Number Unique id of the Model instance (see Ext.data.Model).
  		* @returns Object
  		*/
  def create(): js.Any = js.native
  def create(data: js.Any): js.Any = js.native
  def create(data: js.Any, name: java.lang.String): js.Any = js.native
  def create(data: js.Any, name: java.lang.String, id: scala.Double): js.Any = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in.
  		*/
  def each(): scala.Unit = js.native
  def each(fn: js.Any): scala.Unit = js.native
  def each(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, undefined if not found.
  		*/
  def get(): js.Any = js.native
  def get(id: java.lang.String): js.Any = js.native
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  def getCount(): scala.Double = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns the Ext data Model for a given model name
  		* @param id String/Object The id of the model or the model instance.
  		* @returns Ext.data.Model A model class.
  		*/
  def getModel(): senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = js.native
  def getModel(id: js.Any): senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  def isRegistered(): scala.Boolean = js.native
  def isRegistered(`type`: java.lang.String): scala.Boolean = js.native
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id.
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  def onAvailable(): scala.Unit = js.native
  def onAvailable(id: java.lang.String): scala.Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any): scala.Unit = js.native
  def onAvailable(id: java.lang.String, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register.
  		*/
  def register(): scala.Unit = js.native
  def register(item: js.Any): scala.Unit = js.native
  /** [Method] Registers a model definition
  		* @param name String
  		* @param config Object
  		* @returns Object
  		*/
  def registerType(): js.Any = js.native
  def registerType(name: java.lang.String): js.Any = js.native
  def registerType(name: java.lang.String, config: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister.
  		*/
  def unregister(): scala.Unit = js.native
  def unregister(item: js.Any): scala.Unit = js.native
}

