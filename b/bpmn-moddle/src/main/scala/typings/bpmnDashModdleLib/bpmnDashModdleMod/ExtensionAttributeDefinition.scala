package typings
package bpmnDashModdleLib.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAttributeDefinition extends TypeDerived {
  /**
    * @default false
    */
  var isReference: scala.Boolean
  var name: java.lang.String
  var `type`: java.lang.String
}

object ExtensionAttributeDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    isReference: scala.Boolean,
    name: java.lang.String,
    `type`: java.lang.String
  ): ExtensionAttributeDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, isReference = isReference, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtensionAttributeDefinition]
  }
}

