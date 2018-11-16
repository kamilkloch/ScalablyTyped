package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.ISignatureAlgorithm because Would inherit conflicting mutable fields List(algorithm, namespaceURI))*/
@js.native
trait SignatureAlgorithm extends XmlAlgorithm {
  /**
           * Sign the given string using the given key
           */
  def Sign(signedInfo: java.lang.String, signingKey: stdLib.CryptoKey, algorithm: stdLib.Algorithm): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Verify the given signature of the given string using key
           */
  def Verify(signedInfo: java.lang.String, key: stdLib.CryptoKey, signatureValue: stdLib.Uint8Array): stdLib.PromiseLike[scala.Boolean] = js.native
  /**
           * Verify the given signature of the given string using key
           */
  def Verify(
    signedInfo: java.lang.String,
    key: stdLib.CryptoKey,
    signatureValue: stdLib.Uint8Array,
    algorithm: stdLib.Algorithm
  ): stdLib.PromiseLike[scala.Boolean] = js.native
}
