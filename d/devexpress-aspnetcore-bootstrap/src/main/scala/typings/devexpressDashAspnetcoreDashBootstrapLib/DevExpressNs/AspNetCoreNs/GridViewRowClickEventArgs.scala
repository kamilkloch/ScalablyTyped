package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewRowClickEventArgs extends GridViewRowCancelEventArgs {
  val htmlEvent: js.Any
}

object GridViewRowClickEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: scala.Double): GridViewRowClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewRowClickEventArgs]
  }
}

