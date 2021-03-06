package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Cell Value Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTextComparisonRule extends js.Object {
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Contains | officeDashJsLib.officeDashJsLibStrings.NotContains | officeDashJsLib.officeDashJsLibStrings.BeginsWith | officeDashJsLib.officeDashJsLibStrings.EndsWith
  /**
    *
    * The Text value of conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var text: java.lang.String
}

object ConditionalTextComparisonRule {
  @scala.inline
  def apply(
    operator: ConditionalTextOperator | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Contains | officeDashJsLib.officeDashJsLibStrings.NotContains | officeDashJsLib.officeDashJsLibStrings.BeginsWith | officeDashJsLib.officeDashJsLibStrings.EndsWith,
    text: java.lang.String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
}

