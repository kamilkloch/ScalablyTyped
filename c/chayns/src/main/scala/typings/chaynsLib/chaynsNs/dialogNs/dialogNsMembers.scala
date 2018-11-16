package typings
package chaynsLib.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.dialog")
@js.native
object dialogNsMembers extends js.Object {
  def alert(title: java.lang.String): stdLib.Promise[buttonType] = js.native
  def alert(title: java.lang.String, message: java.lang.String): stdLib.Promise[buttonType] = js.native
  def confirm(title: java.lang.String): stdLib.Promise[buttonType] = js.native
  def confirm(title: java.lang.String, message: java.lang.String): stdLib.Promise[buttonType] = js.native
  def confirm(title: java.lang.String, message: java.lang.String, buttons: js.Array[chaynsLib.DialogButton]): stdLib.Promise[buttonType] = js.native
  def date(config: chaynsLib.DialogDateConfig): stdLib.Promise[chaynsLib.DialogDateResult] = js.native
  def facebook(options: chaynsLib.DialogFacebookOptions): stdLib.Promise[chaynsLib.DialogFacebookResult] = js.native
  def input(config: chaynsLib.DialogInputConfig): stdLib.Promise[chaynsLib.DialogInputResult] = js.native
  def select(config: chaynsLib.DialogSelectConfig): stdLib.Promise[chaynsLib.DialogSelectResult] = js.native
}
