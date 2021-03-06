package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstClickAction extends js.Object

@JSGlobal("ej.Sunburst.SunburstClickAction")
@js.native
object SunburstClickAction extends js.Object {
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstClickAction
  
  val None: None with java.lang.String = js.native
  val ToggleSegmentSelection: ToggleSegmentSelection with java.lang.String = js.native
  val ToggleSegmentVisibility: ToggleSegmentVisibility with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstClickAction with java.lang.String] = js.native
}

