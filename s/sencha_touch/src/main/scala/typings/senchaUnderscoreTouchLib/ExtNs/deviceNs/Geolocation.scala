package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.device.Geolocation")
@js.native
class Geolocation () extends js.Object

/* static members */
@JSGlobal("Ext.device.Geolocation")
@js.native
object Geolocation extends js.Object {
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
  /** [Method] If you are currently watching for the current position this will stop that task  */
  def clearWatch(): scala.Unit = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Returns the value of allowHighAccuracy
  		* @returns Boolean
  		*/
  def getAllowHighAccuracy(): scala.Boolean = js.native
  /** [Method] Attempts to get the current position of this device
  		* @param config Object An object which contains the following config options:
  		*/
  def getCurrentPosition(): scala.Unit = js.native
  def getCurrentPosition(config: js.Any): scala.Unit = js.native
  /** [Method] Returns the value of frequency
  		* @returns Number
  		*/
  def getFrequency(): scala.Double = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns the value of maximumAge
  		* @returns Number
  		*/
  def getMaximumAge(): scala.Double = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  def getTimeout(): scala.Double = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Sets the value of allowHighAccuracy
  		* @param allowHighAccuracy Boolean The new value.
  		*/
  def setAllowHighAccuracy(): scala.Unit = js.native
  def setAllowHighAccuracy(allowHighAccuracy: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of frequency
  		* @param frequency Number The new value.
  		*/
  def setFrequency(): scala.Unit = js.native
  def setFrequency(frequency: scala.Double): scala.Unit = js.native
  /** [Method] Sets the value of maximumAge
  		* @param maximumAge Number The new value.
  		*/
  def setMaximumAge(): scala.Unit = js.native
  def setMaximumAge(maximumAge: scala.Double): scala.Unit = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  def setTimeout(): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
  		* @param config Object An object which contains the following config options:
  		*/
  def watchPosition(): scala.Unit = js.native
  def watchPosition(config: js.Any): scala.Unit = js.native
}

