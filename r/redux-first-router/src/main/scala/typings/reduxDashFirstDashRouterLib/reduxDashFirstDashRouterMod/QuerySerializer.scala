package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySerializer extends js.Object {
  def parse(queryString: java.lang.String): js.Object
  def stringify(params: Params): java.lang.String
}

object QuerySerializer {
  @scala.inline
  def apply(parse: java.lang.String => js.Object, stringify: Params => java.lang.String): QuerySerializer = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[QuerySerializer]
  }
}

