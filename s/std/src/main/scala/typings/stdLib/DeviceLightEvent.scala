package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceLightEvent provides web developers with information from photo sensors or similiar detectors about ambient light levels near the device. For example this may be useful to adjust the screen's brightness based on the current ambient light level in order to save energy or provide better readability. */
@js.native
trait DeviceLightEvent extends Event {
  val value: scala.Double = js.native
}

@JSGlobal("DeviceLightEvent")
@js.native
class DeviceLightEventCls protected () extends DeviceLightEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: DeviceLightEventInit) = this()
}

@JSGlobal("DeviceLightEvent")
@js.native
object DeviceLightEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, DeviceLightEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceLightEventInit, 
      DeviceLightEvent
    ]

