package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordFilter extends js.Object {
  /**
    * A value for the keyword.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}

object KeywordFilter {
  @scala.inline
  def apply(Value: NonEmptyString = null): KeywordFilter = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[KeywordFilter]
  }
}

