package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskScheduledEventDetails extends js.Object {
  /**
    * The JSON data passed to the resource referenced in a task state.
    */
  var parameters: ConnectorParameters
  /**
    * The region of the scheduled task
    */
  var region: Name
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
  /**
    * The maximum allowed duration of the task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
}

object TaskScheduledEventDetails {
  @scala.inline
  def apply(
    parameters: ConnectorParameters,
    region: Name,
    resource: Name,
    resourceType: Name,
    timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  ): TaskScheduledEventDetails = {
    val __obj = js.Dynamic.literal(parameters = parameters, region = region, resource = resource, resourceType = resourceType)
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds)
    __obj.asInstanceOf[TaskScheduledEventDetails]
  }
}

