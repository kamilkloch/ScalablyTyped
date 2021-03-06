package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReceiptRuleRequest extends js.Object {
  /**
    * The name of the receipt rule to delete.
    */
  var RuleName: ReceiptRuleName
  /**
    * The name of the receipt rule set that contains the receipt rule to delete.
    */
  var RuleSetName: ReceiptRuleSetName
}

object DeleteReceiptRuleRequest {
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName, RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[DeleteReceiptRuleRequest]
  }
}

