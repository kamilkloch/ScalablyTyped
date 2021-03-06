package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPipelineReprocessingResponse extends js.Object {
  /**
    * The ID of the pipeline reprocessing activity that was started.
    */
  var reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
}

object StartPipelineReprocessingResponse {
  @scala.inline
  def apply(reprocessingId: ReprocessingId = null): StartPipelineReprocessingResponse = {
    val __obj = js.Dynamic.literal()
    if (reprocessingId != null) __obj.updateDynamic("reprocessingId")(reprocessingId)
    __obj.asInstanceOf[StartPipelineReprocessingResponse]
  }
}

