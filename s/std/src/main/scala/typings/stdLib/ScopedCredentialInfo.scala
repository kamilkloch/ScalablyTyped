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
class ScopedCredentialInfoCls () extends ScopedCredentialInfo {
  /* CompleteClass */
  override val credential: ScopedCredential = js.native
  /* CompleteClass */
  override val publicKey: CryptoKey = js.native
}

@JSGlobal("ScopedCredentialInfo")
@js.native
object ScopedCredentialInfo
  extends org.scalablytyped.runtime.Instantiable0[ScopedCredentialInfo]

