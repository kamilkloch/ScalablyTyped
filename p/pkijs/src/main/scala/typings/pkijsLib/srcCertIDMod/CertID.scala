package typings
package pkijsLib.srcCertIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertID extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var issuerKeyHash: asn1jsLib.asn1jsMod.OctetString
  var issuerNameHash: asn1jsLib.asn1jsMod.OctetString
  var serialNumber: asn1jsLib.asn1jsMod.Integer
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: pkijsLib.srcCertificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[scala.Unit]
  def fromSchema(schema: js.Any): scala.Unit
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): scala.Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertID {
  @scala.inline
  def apply(
    createForCertificate: (pkijsLib.srcCertificateMod.default, CreateFroCertificateParams) => js.Thenable[scala.Unit],
    fromSchema: js.Any => scala.Unit,
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    isEqual: CertID => scala.Boolean,
    issuerKeyHash: asn1jsLib.asn1jsMod.OctetString,
    issuerNameHash: asn1jsLib.asn1jsMod.OctetString,
    serialNumber: asn1jsLib.asn1jsMod.Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertID = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm, isEqual = js.Any.fromFunction1(isEqual), issuerKeyHash = issuerKeyHash, issuerNameHash = issuerNameHash, serialNumber = serialNumber, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CertID]
  }
}

