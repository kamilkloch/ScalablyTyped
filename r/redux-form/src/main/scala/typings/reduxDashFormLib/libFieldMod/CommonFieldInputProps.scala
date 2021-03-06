package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFieldInputProps extends js.Object {
  var name: java.lang.String = js.native
  @JSName("onDragStart")
  var onDragStart_Original: EventHandler[reactLib.reactMod.DragEvent[_]] = js.native
  @JSName("onDrop")
  var onDrop_Original: EventHandler[reactLib.reactMod.DragEvent[_]] = js.native
  @JSName("onFocus")
  var onFocus_Original: EventHandler[reactLib.reactMod.FocusEvent[_]] = js.native
  def onDragStart(event: reactLib.reactMod.DragEvent[_]): scala.Unit = js.native
  def onDragStart(event: reactLib.reactMod.DragEvent[_], name: java.lang.String): scala.Unit = js.native
  def onDrop(event: reactLib.reactMod.DragEvent[_]): scala.Unit = js.native
  def onDrop(event: reactLib.reactMod.DragEvent[_], name: java.lang.String): scala.Unit = js.native
  def onFocus(event: reactLib.reactMod.FocusEvent[_]): scala.Unit = js.native
  def onFocus(event: reactLib.reactMod.FocusEvent[_], name: java.lang.String): scala.Unit = js.native
}

