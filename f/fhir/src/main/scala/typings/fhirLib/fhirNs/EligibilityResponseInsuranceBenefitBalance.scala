package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Benefits by Category
  */
trait EligibilityResponseInsuranceBenefitBalance extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'excluded'.
    */
  var _excluded: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Type of services covered
    */
  var category: CodeableConcept
  /**
    * Description of the benefit or services covered
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Excluded from the plan
    */
  var excluded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Benefit Summary
    */
  var financial: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]] = js.undefined
  /**
    * Short name for the benefit
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In or out of network
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Detailed services covered within the type
    */
  var subCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Annual or lifetime
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Individual or family
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}

object EligibilityResponseInsuranceBenefitBalance {
  @scala.inline
  def apply(
    category: CodeableConcept,
    _description: Element = null,
    _excluded: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    description: java.lang.String = null,
    excluded: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    financial: js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    network: CodeableConcept = null,
    subCategory: CodeableConcept = null,
    term: CodeableConcept = null,
    unit: CodeableConcept = null
  ): EligibilityResponseInsuranceBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_excluded != null) __obj.updateDynamic("_excluded")(_excluded)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(excluded)) __obj.updateDynamic("excluded")(excluded)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (financial != null) __obj.updateDynamic("financial")(financial)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (subCategory != null) __obj.updateDynamic("subCategory")(subCategory)
    if (term != null) __obj.updateDynamic("term")(term)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalance]
  }
}

