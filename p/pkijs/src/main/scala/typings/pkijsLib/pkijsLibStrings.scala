package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pkijsLibStrings {
  @js.native
  sealed trait jwk extends js.Object
  
  @js.native
  sealed trait pkcs8 extends js.Object
  
  @js.native
  sealed trait raw extends js.Object
  
  @js.native
  sealed trait spki extends js.Object
  
  def jwk: jwk = "jwk".asInstanceOf[jwk]
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  def raw: raw = "raw".asInstanceOf[raw]
  def spki: spki = "spki".asInstanceOf[spki]
}
