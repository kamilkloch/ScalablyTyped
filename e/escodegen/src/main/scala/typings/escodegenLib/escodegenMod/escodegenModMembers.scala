package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escodegen", JSImport.Namespace)
@js.native
object escodegenModMembers extends js.Object {
  def attachComments(ast: js.Any, comments: js.Any, tokens: js.Any): js.Any = js.native
  def generate(ast: js.Any): java.lang.String = js.native
  def generate(ast: js.Any, options: GenerateOptions): java.lang.String = js.native
}
