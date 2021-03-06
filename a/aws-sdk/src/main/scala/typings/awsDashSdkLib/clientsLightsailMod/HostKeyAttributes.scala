package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostKeyAttributes extends js.Object {
  /**
    * The SSH host key algorithm or the RDP certificate format. For SSH host keys, the algorithm may be ssh-rsa, ecdsa-sha2-nistp256, ssh-ed25519, etc. For RDP certificates, the algorithm is always x509-cert.
    */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-1 SSH fingerprint:  SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0    Example of an SHA-1 RDP fingerprint:  af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45   
    */
  var fingerprintSHA1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-256 SSH fingerprint:  SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o    Example of an SHA-256 RDP fingerprint:  03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68   
    */
  var fingerprintSHA256: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The returned RDP certificate is not valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidAfter: js.UndefOr[IsoDate] = js.undefined
  /**
    * The returned RDP certificate is valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidBefore: js.UndefOr[IsoDate] = js.undefined
  /**
    * The public SSH host key or the RDP certificate.
    */
  var publicKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time that the SSH host key or RDP certificate was recorded by Lightsail.
    */
  var witnessedAt: js.UndefOr[IsoDate] = js.undefined
}

object HostKeyAttributes {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    fingerprintSHA1: java.lang.String = null,
    fingerprintSHA256: java.lang.String = null,
    notValidAfter: IsoDate = null,
    notValidBefore: IsoDate = null,
    publicKey: java.lang.String = null,
    witnessedAt: IsoDate = null
  ): HostKeyAttributes = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (fingerprintSHA1 != null) __obj.updateDynamic("fingerprintSHA1")(fingerprintSHA1)
    if (fingerprintSHA256 != null) __obj.updateDynamic("fingerprintSHA256")(fingerprintSHA256)
    if (notValidAfter != null) __obj.updateDynamic("notValidAfter")(notValidAfter)
    if (notValidBefore != null) __obj.updateDynamic("notValidBefore")(notValidBefore)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (witnessedAt != null) __obj.updateDynamic("witnessedAt")(witnessedAt)
    __obj.asInstanceOf[HostKeyAttributes]
  }
}

