package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "X509Certificate")
@js.native
class X509Certificate () extends js.Object {
  def this(rawData: stdLib.BufferSource) = this()
  /**
    * Gets a issuer name of the certificate
    */
  val Issuer: java.lang.String = js.native
  /**
    * Gets the public key from the X509Certificate
    */
  val PublicKey: stdLib.CryptoKey | scala.Null = js.native
  /**
    * Gets a serial number of the certificate in HEX format
    */
  val SerialNumber: java.lang.String = js.native
  /**
    * Gets a subject name of the certificate
    */
  val Subject: java.lang.String = js.native
  var publicKey: stdLib.CryptoKey | scala.Null = js.native
  var raw: stdLib.Uint8Array = js.native
  /**
    * Returns DER raw of X509Certificate
    */
  def GetRaw(): stdLib.Uint8Array = js.native
  /**
    * Loads X509Certificate from DER data
    * @param  {Uint8Array} rawData
    */
  /* protected */ def LoadRaw(rawData: stdLib.BufferSource): scala.Unit = js.native
  /**
    * Returns a thumbprint of the certificate
    * @param  {DigestAlgorithm="SHA-1"} algName Digest algorithm name
    * @returns PromiseLike
    */
  def Thumbprint(): js.Thenable[stdLib.ArrayBuffer] = js.native
  def Thumbprint(algName: DigestAlgorithm): js.Thenable[stdLib.ArrayBuffer] = js.native
  /**
    * Returns public key from X509Certificate
    * @param  {Algorithm} algorithm
    * @returns Promise
    */
  def exportKey(algorithm: stdLib.Algorithm): js.Promise[stdLib.CryptoKey] = js.native
}

