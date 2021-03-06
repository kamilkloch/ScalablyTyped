package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkerBlocksResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  /**
    *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
    */
  var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.undefined
}

object ListWorkerBlocksResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined,
    WorkerBlocks: WorkerBlockList = null
  ): ListWorkerBlocksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults)
    if (WorkerBlocks != null) __obj.updateDynamic("WorkerBlocks")(WorkerBlocks)
    __obj.asInstanceOf[ListWorkerBlocksResponse]
  }
}

