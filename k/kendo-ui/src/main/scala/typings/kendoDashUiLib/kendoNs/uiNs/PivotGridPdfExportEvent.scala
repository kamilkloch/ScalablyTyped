package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridPdfExportEvent extends PivotGridEvent {
  var promise: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

object PivotGridPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: PivotGrid,
    promise: kendoDashUiLib.JQueryPromise[_] = null
  ): PivotGridPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[PivotGridPdfExportEvent]
  }
}

