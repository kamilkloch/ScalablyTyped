package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassStatics extends js.Object {
  def getDefault(): Compass
}

object ICompassStatics {
  @scala.inline
  def apply(getDefault: () => Compass): ICompassStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[ICompassStatics]
  }
}

