package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsContentProtection extends js.Object {
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined
  /**
    * If you want Elastic Transcoder to generate a key for you, leave this field blank. If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256. 
    */
  var Key: js.UndefOr[Base64EncodedString] = js.undefined
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
    */
  var KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined
  /**
    * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose WithVariantPlaylists, LicenseAcquisitionUrl must be left blank and Elastic Transcoder writes your data key into the same bucket as the associated playlist.
    */
  var KeyStoragePolicy: js.UndefOr[KeyStoragePolicy] = js.undefined
  /**
    * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
    */
  var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.undefined
  /**
    * The content protection method for your output. The only valid value is: aes-128. This value is written into the method attribute of the EXT-X-KEY metadata tag in the output playlist.
    */
  var Method: js.UndefOr[HlsContentProtectionMethod] = js.undefined
}

object HlsContentProtection {
  @scala.inline
  def apply(
    InitializationVector: ZeroTo255String = null,
    Key: Base64EncodedString = null,
    KeyMd5: Base64EncodedString = null,
    KeyStoragePolicy: KeyStoragePolicy = null,
    LicenseAcquisitionUrl: ZeroTo512String = null,
    Method: HlsContentProtectionMethod = null
  ): HlsContentProtection = {
    val __obj = js.Dynamic.literal()
    if (InitializationVector != null) __obj.updateDynamic("InitializationVector")(InitializationVector)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (KeyMd5 != null) __obj.updateDynamic("KeyMd5")(KeyMd5)
    if (KeyStoragePolicy != null) __obj.updateDynamic("KeyStoragePolicy")(KeyStoragePolicy)
    if (LicenseAcquisitionUrl != null) __obj.updateDynamic("LicenseAcquisitionUrl")(LicenseAcquisitionUrl)
    if (Method != null) __obj.updateDynamic("Method")(Method)
    __obj.asInstanceOf[HlsContentProtection]
  }
}

