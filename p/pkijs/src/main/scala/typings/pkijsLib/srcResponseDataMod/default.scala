package typings
package pkijsLib.srcResponseDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/ResponseData", JSImport.Default)
@js.native
class default () extends ResponseData {
  def this(params: js.Any) = this()
}

@JSImport("pkijs/src/ResponseData", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Compare values with default values for all class members
           * @param {string} memberName String name for a class member
           * @param {*} memberValue Value to compare with default value
           */
  def compareWithDefault(memberName: java.lang.String, memberValue: js.Any): scala.Boolean = js.native
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}
