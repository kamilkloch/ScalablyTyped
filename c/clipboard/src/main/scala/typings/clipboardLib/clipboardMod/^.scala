package typings
package clipboardLib.clipboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboard", JSImport.Namespace)
@js.native
class ^ protected () extends ClipboardJS {
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: stdLib.NodeListOf[stdLib.Element]) = this()
  def this(selector: java.lang.String, options: Options) = this()
  def this(selector: stdLib.Element, options: Options) = this()
  def this(selector: stdLib.NodeListOf[stdLib.Element], options: Options) = this()
}

@JSImport("clipboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Checks if clipboard.js is supported
    */
  def isSupported(): scala.Boolean = js.native
}

