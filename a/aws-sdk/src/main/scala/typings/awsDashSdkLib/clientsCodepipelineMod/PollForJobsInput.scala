package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollForJobsInput extends js.Object {
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  /**
    * A map of property names and values. For an action type with no queryable properties, this value must be null or an empty map. For an action type with a queryable property, you must supply that property as a key in the map. Only jobs whose action configuration matches the mapped value will be returned.
    */
  var queryParam: js.UndefOr[QueryParamMap] = js.undefined
}

object PollForJobsInput {
  @scala.inline
  def apply(
    actionTypeId: ActionTypeId,
    maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined,
    queryParam: QueryParamMap = null
  ): PollForJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId)
    if (!js.isUndefined(maxBatchSize)) __obj.updateDynamic("maxBatchSize")(maxBatchSize)
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam)
    __obj.asInstanceOf[PollForJobsInput]
  }
}

