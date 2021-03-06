package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseoverEventArgs extends js.Object {
  /** Returns hovered map shape object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MouseoverEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): MouseoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MouseoverEventArgs]
  }
}

