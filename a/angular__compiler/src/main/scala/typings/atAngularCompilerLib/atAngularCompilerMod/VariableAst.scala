package typings
package atAngularCompilerLib.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.VariableAst {
  def this(name: java.lang.String, value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

/* static members */
@JSImport("@angular/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedVariable): atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

