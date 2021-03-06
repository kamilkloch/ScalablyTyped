package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedCodeFixScope extends js.Object {
  var fileName: java.lang.String
  var `type`: typescriptLib.typescriptLibStrings.file
}

object CombinedCodeFixScope {
  @scala.inline
  def apply(fileName: java.lang.String, `type`: typescriptLib.typescriptLibStrings.file): CombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(fileName = fileName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CombinedCodeFixScope]
  }
}

