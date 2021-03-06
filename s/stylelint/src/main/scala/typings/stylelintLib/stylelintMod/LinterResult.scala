package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterResult extends js.Object {
  var errored: scala.Boolean
  var output: java.lang.String
  var results: js.Array[LintResult]
}

object LinterResult {
  @scala.inline
  def apply(errored: scala.Boolean, output: java.lang.String, results: js.Array[LintResult]): LinterResult = {
    val __obj = js.Dynamic.literal(errored = errored, output = output, results = results)
  
    __obj.asInstanceOf[LinterResult]
  }
}

