package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExecutionHistoryOutput extends js.Object {
  /**
    * The list of events that occurred in the execution.
    */
  var events: HistoryEventList
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
}

object GetExecutionHistoryOutput {
  @scala.inline
  def apply(events: HistoryEventList, nextToken: PageToken = null): GetExecutionHistoryOutput = {
    val __obj = js.Dynamic.literal(events = events)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetExecutionHistoryOutput]
  }
}

