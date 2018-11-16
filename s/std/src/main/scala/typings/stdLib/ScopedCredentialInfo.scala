package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScopedCredentialInfo extends js.Object {
  val credential: ScopedCredential
  val publicKey: CryptoKey
}

@JSGlobal("ScopedCredentialInfo")
@js.native
object ScopedCredentialInfo
  extends ScalablyTyped.runtime.Instantiable0[ScopedCredentialInfo]
