package typings
package fullcalendarLib.businessHourRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/BusinessHourRenderer", "Default")
@js.native
class Default protected () extends js.Object {
  def this(component: js.Any, fillRenderer: js.Any) = this()
  var component: js.Any = js.native
  var fillRenderer: js.Any = js.native
  var segs: js.Any = js.native
  def getSegs(): js.Any = js.native
  def render(businessHourGenerator: js.Any): scala.Unit = js.native
  def renderEventFootprints(eventFootprints: js.Any): scala.Unit = js.native
  def renderSegs(segs: js.Any): scala.Unit = js.native
  def unrender(): scala.Unit = js.native
}

@JSImport("fullcalendar/BusinessHourRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any, fillRenderer: js.Any) = this()
}

