package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredential extends js.Object {
  val id: ArrayBuffer
  val `type`: ScopedCredentialType
}

@JSGlobal("ScopedCredential")
@js.native
class ScopedCredentialCls () extends ScopedCredential {
  /* CompleteClass */
  override val id: ArrayBuffer = js.native
  /* CompleteClass */
  override val `type`: ScopedCredentialType = js.native
}

@JSGlobal("ScopedCredential")
@js.native
object ScopedCredential
  extends org.scalablytyped.runtime.Instantiable0[ScopedCredential]

