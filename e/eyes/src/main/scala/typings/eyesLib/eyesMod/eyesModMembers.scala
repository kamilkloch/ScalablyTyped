package typings
package eyesLib.eyesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eyes", JSImport.Namespace)
@js.native
object eyesModMembers extends js.Object {
  def inspect(thing: js.Any): scala.Unit = js.native
  def inspect(thing: js.Any, label: java.lang.String): scala.Unit = js.native
  def inspector(): InspectorFunction = js.native
  def inspector(options: EyesOptions): InspectorFunction = js.native
}
