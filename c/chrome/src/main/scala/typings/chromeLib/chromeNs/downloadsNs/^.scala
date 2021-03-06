package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.downloads")
@js.native
object ^ extends js.Object {
  var onChanged: DownloadChangedEvent = js.native
  var onCreated: DownloadCreatedEvent = js.native
  var onDeterminingFilename: DownloadDeterminingFilenameEvent = js.native
  var onErased: DownloadErasedEvent = js.native
  def acceptDanger(downloadId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def cancel(downloadId: scala.Double): scala.Unit = js.native
  def cancel(downloadId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def download(options: DownloadOptions): scala.Unit = js.native
  def download(options: DownloadOptions, callback: js.Function1[/* downloadId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def drag(downloadId: scala.Double): scala.Unit = js.native
  def erase(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[scala.Double], scala.Unit]): scala.Unit = js.native
  def getFileIcon(downloadId: scala.Double, callback: js.Function1[/* iconURL */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getFileIcon(
    downloadId: scala.Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def open(downloadId: scala.Double): scala.Unit = js.native
  def pause(downloadId: scala.Double): scala.Unit = js.native
  def pause(downloadId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeFile(downloadId: scala.Double): scala.Unit = js.native
  def removeFile(downloadId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def resume(downloadId: scala.Double): scala.Unit = js.native
  def resume(downloadId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def search(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], scala.Unit]): scala.Unit = js.native
  def setShelfEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def show(downloadId: scala.Double): scala.Unit = js.native
  def showDefaultFolder(): scala.Unit = js.native
}

