package typings
package reactDashTrackingLib.reactDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingProp extends js.Object {
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object
  def trackEvent(has: js.Any): js.Any
}

object TrackingProp {
  @scala.inline
  def apply(getTrackingData: () => js.Object, trackEvent: js.Any => js.Any): TrackingProp = {
    val __obj = js.Dynamic.literal(getTrackingData = js.Any.fromFunction0(getTrackingData), trackEvent = js.Any.fromFunction1(trackEvent))
  
    __obj.asInstanceOf[TrackingProp]
  }
}

