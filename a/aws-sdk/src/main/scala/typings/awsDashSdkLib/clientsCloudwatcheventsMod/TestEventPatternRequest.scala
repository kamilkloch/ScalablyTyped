package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEventPatternRequest extends js.Object {
  /**
    * The event, in JSON format, to test against the event pattern.
    */
  var Event: String
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
    */
  var EventPattern: awsDashSdkLib.clientsCloudwatcheventsMod.EventPattern
}

object TestEventPatternRequest {
  @scala.inline
  def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event, EventPattern = EventPattern)
  
    __obj.asInstanceOf[TestEventPatternRequest]
  }
}

