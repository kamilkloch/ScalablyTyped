package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairKeyObjectResult extends js.Object {
  var privateKey: KeyObject
  var publicKey: KeyObject
}

object KeyPairKeyObjectResult {
  @scala.inline
  def apply(privateKey: KeyObject, publicKey: KeyObject): KeyPairKeyObjectResult = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPairKeyObjectResult]
  }
}

