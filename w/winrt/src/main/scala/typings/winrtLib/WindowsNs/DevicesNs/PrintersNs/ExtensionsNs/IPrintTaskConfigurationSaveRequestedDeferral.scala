package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  def complete(): scala.Unit
}

object IPrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => scala.Unit): IPrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
  }
}

