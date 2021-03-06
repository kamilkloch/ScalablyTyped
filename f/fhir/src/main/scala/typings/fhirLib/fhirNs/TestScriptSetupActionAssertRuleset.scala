package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reference to a TestScript.ruleset
  */
trait TestScriptSetupActionAssertRuleset extends BackboneElement {
  /**
    * Contains extended information for property 'rulesetId'.
    */
  var _rulesetId: js.UndefOr[Element] = js.undefined
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.undefined
  /**
    * Id of the TestScript.ruleset
    */
  var rulesetId: id
}

object TestScriptSetupActionAssertRuleset {
  @scala.inline
  def apply(
    rulesetId: id,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _rulesetId: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    rule: js.Array[TestScriptSetupActionAssertRulesetRule] = null
  ): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_rulesetId != null) __obj.updateDynamic("_rulesetId")(_rulesetId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
}

