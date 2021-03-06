package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Certificates associated with security profiles
  */
trait CapabilityStatementRestSecurityCertificate extends BackboneElement {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.undefined
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.undefined
}

object CapabilityStatementRestSecurityCertificate {
  @scala.inline
  def apply(
    _blob: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    blob: base64Binary = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: code = null
  ): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    if (_blob != null) __obj.updateDynamic("_blob")(_blob)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
}

