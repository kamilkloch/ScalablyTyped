package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportCertificateRequest extends js.Object {
  /**
    * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:  arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: Arn
  /**
    * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:   openssl rsa -in encrypted_key.pem -out decrypted_key.pem 
    */
  var Passphrase: PassphraseBlob
}

object ExportCertificateRequest {
  @scala.inline
  def apply(CertificateArn: Arn, Passphrase: PassphraseBlob): ExportCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn, Passphrase = Passphrase.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportCertificateRequest]
  }
}

