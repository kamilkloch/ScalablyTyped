package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCategoriesMessage extends js.Object {
  /**
    * A list of EventCategoriesMap data types.
    */
  var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
}

object EventCategoriesMessage {
  @scala.inline
  def apply(EventCategoriesMapList: EventCategoriesMapList = null): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (EventCategoriesMapList != null) __obj.updateDynamic("EventCategoriesMapList")(EventCategoriesMapList)
    __obj.asInstanceOf[EventCategoriesMessage]
  }
}

