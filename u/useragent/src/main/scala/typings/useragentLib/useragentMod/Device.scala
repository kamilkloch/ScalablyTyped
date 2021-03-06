package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "Device")
@js.native
/**
  * The representation of a parsed Device.
  * @param family The name of the device
  * @param major Major version of the device
  * @param minor Minor version of the device
  * @param patch Patch version of the device
  */
class Device () extends js.Object {
  def this(family: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String) = this()
  var family: java.lang.String = js.native
  var major: java.lang.String = js.native
  var minor: java.lang.String = js.native
  var patch: java.lang.String = js.native
  /**
    * Outputs a JSON string of the Device, values are defaulted to undefined so they are not outputed in the stringify.
    */
  def toJSON(): useragentLib.Anon_Family = js.native
  /**
    * Generates the version of the Device.
    */
  def toVersion(): java.lang.String = js.native
}

