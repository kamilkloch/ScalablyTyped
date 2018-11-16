package typings
package atAngularCompilerLib.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.Extractor {
  def this(host: atAngularCompilerLib.srcI18nExtractorMod.ExtractorHost, staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver, messageBundle: atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod.MessageBundle, metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver) = this()
}

@JSImport("@angular/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: atAngularCompilerLib.srcI18nExtractorMod.ExtractorHost): atAngularCompilerLib.Anon_StaticReflector = js.native
  def create(host: atAngularCompilerLib.srcI18nExtractorMod.ExtractorHost, locale: java.lang.String): atAngularCompilerLib.Anon_StaticReflector = js.native
}
