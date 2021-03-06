package typings
package atAngularCompilerLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.TreeError {
  def this(elementName: java.lang.String, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
  def this(elementName: scala.Null, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: java.lang.String) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: java.lang.String,
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: java.lang.String
  ): atAngularCompilerLib.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(
    elementName: scala.Null,
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: java.lang.String
  ): atAngularCompilerLib.srcMlUnderscoreParserParserMod.TreeError = js.native
}

