package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: java.lang.String
  var `type`: java.lang.String
  var value: java.lang.String
}

object Anon_Label {
  @scala.inline
  def apply(label: java.lang.String, `type`: java.lang.String, value: java.lang.String): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Label]
  }
}

