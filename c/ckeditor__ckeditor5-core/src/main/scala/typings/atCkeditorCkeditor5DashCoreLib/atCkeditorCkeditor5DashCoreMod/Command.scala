package typings
package atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "Command")
@js.native
class Command[T] protected ()
  extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable {
  def this(editor: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor) = this()
  val editor: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor = js.native
  val isEnabled: scala.Boolean = js.native
  val value: js.UndefOr[T] = js.native
  def destroy(): scala.Unit = js.native
  def execute(): scala.Unit = js.native
  def listenTo(
    emitter: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Emitter,
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashCoreLib.Anon_Priority
  ): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
  def once(
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
}

