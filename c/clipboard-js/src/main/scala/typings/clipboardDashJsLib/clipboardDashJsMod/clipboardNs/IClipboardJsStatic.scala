package typings
package clipboardDashJsLib.clipboardDashJsMod.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClipboardJsStatic extends js.Object {
  def copy(`val`: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def copy(`val`: stdLib.Element): stdLib.Promise[scala.Unit] = js.native
  def paste(): stdLib.Promise[java.lang.String] = js.native
}
