package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeUrl extends js.Object {
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_TypeUrl {
  @scala.inline
  def apply(`type`: java.lang.String, url: java.lang.String): Anon_TypeUrl = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeUrl]
  }
}

