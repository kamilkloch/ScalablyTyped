package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.device.Camera")
@js.native
class Camera () extends js.Object

/* static members */
@JSGlobal("Ext.device.Camera")
@js.native
object Camera extends js.Object {
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
  /** [Method] Allows you to capture a photo
  		* @param options Object The options to use when taking a photo.
  		* @param scope Object The scope in which to call the success and failure functions, if specified.
  		* @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
  		* @param encoding String The encoding of the returned image. Available options are:  jpg png
  		* @param width Number The width of the image to return
  		* @param height Number The height of the image to return
  		*/
  def capture(
    options: js.UndefOr[js.Any],
    scope: js.UndefOr[js.Any],
    destination: js.UndefOr[java.lang.String],
    encoding: js.UndefOr[java.lang.String],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
}

