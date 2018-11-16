package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadOptions extends js.Object {
  /** Optional. Post body.  */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. A file path relative to the Downloads directory to contain the downloaded file, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will cause an error. onDeterminingFilename allows suggesting a filename after the file's MIME type and a tentative filename have been determined.  */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented as a dictionary containing the keys name and either value or binaryValue, restricted to those allowed by XMLHttpRequest.  */
  var headers: js.UndefOr[js.Array[HeaderNameValuePair]] = js.undefined
  /** Optional. The HTTP method to use if the URL uses the HTTP[S] protocol.  */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Use a file-chooser to allow the user to select a filename regardless of whether filename is set or already exists.  */
  var saveAs: js.UndefOr[scala.Boolean] = js.undefined
  /** The URL to download. */
  var url: java.lang.String
}
