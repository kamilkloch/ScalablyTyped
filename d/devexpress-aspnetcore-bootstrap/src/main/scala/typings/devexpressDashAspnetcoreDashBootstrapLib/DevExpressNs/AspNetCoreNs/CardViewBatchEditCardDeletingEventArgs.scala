package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditCardDeletingEventArgs extends CancelEventArgs {
  val cardValues: js.Any
  val visibleIndex: scala.Double
}

object CardViewBatchEditCardDeletingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cardValues: js.Any, sender: Control, visibleIndex: scala.Double): CardViewBatchEditCardDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewBatchEditCardDeletingEventArgs]
  }
}

