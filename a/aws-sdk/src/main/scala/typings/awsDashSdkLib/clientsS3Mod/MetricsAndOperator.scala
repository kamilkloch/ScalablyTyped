package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsAndOperator extends js.Object {
  /**
    * The prefix used when evaluating an AND predicate.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * The list of tags used when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}

object MetricsAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[MetricsAndOperator]
  }
}

