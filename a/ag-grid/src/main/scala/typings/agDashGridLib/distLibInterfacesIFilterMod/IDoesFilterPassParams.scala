package typings
package agDashGridLib.distLibInterfacesIFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDoesFilterPassParams extends js.Object {
  var data: js.Any
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
}

object IDoesFilterPassParams {
  @scala.inline
  def apply(data: js.Any, node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): IDoesFilterPassParams = {
    val __obj = js.Dynamic.literal(data = data, node = node)
  
    __obj.asInstanceOf[IDoesFilterPassParams]
  }
}

