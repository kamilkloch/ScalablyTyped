package typings
package atEmberStringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  def camelize(str: java.lang.String): java.lang.String = js.native
  def capitalize(str: java.lang.String): java.lang.String = js.native
  def classify(str: java.lang.String): java.lang.String = js.native
  def dasherize(str: java.lang.String): java.lang.String = js.native
  def decamelize(str: java.lang.String): java.lang.String = js.native
  def htmlSafe(str: java.lang.String): handlebarsLib.HandlebarsNs.SafeString = js.native
  def isHTMLSafe(str: java.lang.String): scala.Boolean = js.native
  def loc(template: java.lang.String): java.lang.String = js.native
  def loc(template: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  def underscore(str: java.lang.String): java.lang.String = js.native
  def w(str: java.lang.String): js.Array[java.lang.String] = js.native
}
