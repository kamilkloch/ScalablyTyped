package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "cipher")
@js.native
object cipherNs extends js.Object {
  @js.native
  trait BlockCipher extends js.Object {
    var output: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer = js.native
    def finish(): scala.Boolean = js.native
    def start(): scala.Unit = js.native
    def start(options: StartOptions): scala.Unit = js.native
    def update(payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): scala.Unit = js.native
  }
  
  
  trait StartOptions extends js.Object {
    var iv: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def createCipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): BlockCipher = js.native
  def createDecipher(algorithm: Algorithm, payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): BlockCipher = js.native
  type Algorithm = nodeDashForgeLib.nodeDashForgeLibStrings.`AES-ECB` | nodeDashForgeLib.nodeDashForgeLibStrings.`AES-CBC` | nodeDashForgeLib.nodeDashForgeLibStrings.`AES-CFB` | nodeDashForgeLib.nodeDashForgeLibStrings.`AES-OFB` | nodeDashForgeLib.nodeDashForgeLibStrings.`AES-CTR` | nodeDashForgeLib.nodeDashForgeLibStrings.`AES-GCM` | nodeDashForgeLib.nodeDashForgeLibStrings.`3DES-ECB` | nodeDashForgeLib.nodeDashForgeLibStrings.`3DES-CBC` | nodeDashForgeLib.nodeDashForgeLibStrings.`DES-ECB` | nodeDashForgeLib.nodeDashForgeLibStrings.`DES-CBC`
}
