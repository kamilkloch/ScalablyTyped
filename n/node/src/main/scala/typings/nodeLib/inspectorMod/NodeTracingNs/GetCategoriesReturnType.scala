package typings
package nodeLib.inspectorMod.NodeTracingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCategoriesReturnType extends js.Object {
  /**
    * A list of supported tracing categories.
    */
  var categories: js.Array[java.lang.String]
}

object GetCategoriesReturnType {
  @scala.inline
  def apply(categories: js.Array[java.lang.String]): GetCategoriesReturnType = {
    val __obj = js.Dynamic.literal(categories = categories)
  
    __obj.asInstanceOf[GetCategoriesReturnType]
  }
}

