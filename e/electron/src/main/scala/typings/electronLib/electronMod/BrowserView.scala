package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView ()
  extends electronLib.ElectronNs.BrowserView {
  def this(options: electronLib.ElectronNs.BrowserViewConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: scala.Double): electronLib.ElectronNs.BrowserView = js.native
  def fromWebContents(webContents: electronLib.ElectronNs.WebContents): electronLib.ElectronNs.BrowserView | scala.Null = js.native
  def getAllViews(): js.Array[electronLib.ElectronNs.BrowserView] = js.native
}

