package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Encryption extends js.Object {
  /**
    * The AWS ARN of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  /**
    * The encryption mode to use for S3 data.
    */
  var S3EncryptionMode: js.UndefOr[S3EncryptionMode] = js.undefined
}

object S3Encryption {
  @scala.inline
  def apply(KmsKeyArn: KmsKeyArn = null, S3EncryptionMode: S3EncryptionMode = null): S3Encryption = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    if (S3EncryptionMode != null) __obj.updateDynamic("S3EncryptionMode")(S3EncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Encryption]
  }
}

