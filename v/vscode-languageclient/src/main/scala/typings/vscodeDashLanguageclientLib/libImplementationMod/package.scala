package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libImplementationMod {
  type ProvideImplementationSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]]
  ]
}
