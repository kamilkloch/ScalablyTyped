package typings
package karmaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pattern extends js.Object {
  var pattern: java.lang.String
  var `type`: java.lang.String
}

object Anon_Pattern {
  @scala.inline
  def apply(pattern: java.lang.String, `type`: java.lang.String): Anon_Pattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Pattern]
  }
}

