package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticAliases extends js.Object {
  var Value: java.lang.String
  def Clone(): ISemanticAliases
}

object ISemanticAliases {
  @scala.inline
  def apply(Clone: () => ISemanticAliases, Value: java.lang.String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value)
  
    __obj.asInstanceOf[ISemanticAliases]
  }
}

