package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionScheduledEventAttributes extends js.Object {
  /**
    * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The unique ID of the Lambda task.
    */
  var id: FunctionId
  /**
    * The input provided to the Lambda task.
    */
  var input: js.UndefOr[FunctionInput] = js.undefined
  /**
    * The name of the Lambda function.
    */
  var name: FunctionName
  /**
    * The maximum amount of time a worker can take to process the Lambda task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
}

object LambdaFunctionScheduledEventAttributes {
  @scala.inline
  def apply(
    decisionTaskCompletedEventId: EventId,
    id: FunctionId,
    name: FunctionName,
    control: Data = null,
    input: FunctionInput = null,
    startToCloseTimeout: DurationInSecondsOptional = null
  ): LambdaFunctionScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, id = id, name = name)
    if (control != null) __obj.updateDynamic("control")(control)
    if (input != null) __obj.updateDynamic("input")(input)
    if (startToCloseTimeout != null) __obj.updateDynamic("startToCloseTimeout")(startToCloseTimeout)
    __obj.asInstanceOf[LambdaFunctionScheduledEventAttributes]
  }
}

