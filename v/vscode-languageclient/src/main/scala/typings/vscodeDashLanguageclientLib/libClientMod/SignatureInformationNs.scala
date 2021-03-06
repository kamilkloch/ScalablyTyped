package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "SignatureInformation")
@js.native
object SignatureInformationNs extends js.Object {
  def create(label: java.lang.String): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation = js.native
  def create(
    label: java.lang.String,
    documentation: java.lang.String,
    parameters: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ParameterInformation*
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation = js.native
}

