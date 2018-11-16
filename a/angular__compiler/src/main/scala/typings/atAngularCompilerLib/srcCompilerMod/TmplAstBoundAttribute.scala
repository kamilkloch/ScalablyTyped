package typings
package atAngularCompilerLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected ()
  extends atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute = js.native
}
