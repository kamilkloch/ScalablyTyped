package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSource extends js.Object {
  /**
    * The ID of the output source, for example the URL of an Amazon S3 bucket.
    */
  var OutputSourceId: js.UndefOr[OutputSourceId] = js.undefined
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[OutputSourceType] = js.undefined
}

object OutputSource {
  @scala.inline
  def apply(OutputSourceId: OutputSourceId = null, OutputSourceType: OutputSourceType = null): OutputSource = {
    val __obj = js.Dynamic.literal()
    if (OutputSourceId != null) __obj.updateDynamic("OutputSourceId")(OutputSourceId)
    if (OutputSourceType != null) __obj.updateDynamic("OutputSourceType")(OutputSourceType)
    __obj.asInstanceOf[OutputSource]
  }
}

