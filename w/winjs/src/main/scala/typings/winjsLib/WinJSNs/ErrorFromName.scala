package typings
package winjsLib.WinJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Properties
//#region Objects
/**
  * An error object.
  **/
@JSGlobal("WinJS.ErrorFromName")
@js.native
class ErrorFromName protected () extends js.Object {
  //#region Constructors
  /**
    * Creates an Error object with the specified name and message properties.
    * @constructor
    * @param name The name of this error. The name is meant to be consumed programmatically and should not be localized.
    * @param message The message for this error. The message is meant to be consumed by humans and should be localized.
    **/
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, message: java.lang.String) = this()
}

/* static members */
@JSGlobal("WinJS.ErrorFromName")
@js.native
object ErrorFromName extends js.Object {
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

