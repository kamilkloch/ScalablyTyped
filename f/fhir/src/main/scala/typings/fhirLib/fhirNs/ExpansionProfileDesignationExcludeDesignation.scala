package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The designation to be excluded
  */
trait ExpansionProfileDesignationExcludeDesignation extends BackboneElement {
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Human language of the designation to be excluded
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * What kind of Designation to exclude
    */
  var use: js.UndefOr[Coding] = js.undefined
}

object ExpansionProfileDesignationExcludeDesignation {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _language: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    language: code = null,
    modifierExtension: js.Array[Extension] = null,
    use: Coding = null
  ): ExpansionProfileDesignationExcludeDesignation = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[ExpansionProfileDesignationExcludeDesignation]
  }
}

