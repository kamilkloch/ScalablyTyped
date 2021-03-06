package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionField extends js.Object {
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var Name: ExtensionFieldName
  /**
    * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var Value: ExtensionFieldValue
}

object ExtensionField {
  @scala.inline
  def apply(Name: ExtensionFieldName, Value: ExtensionFieldValue): ExtensionField = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[ExtensionField]
  }
}

