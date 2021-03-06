package typings
package threeLib.srcLoadersImageBitmapLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageBitmapLoader", "ImageBitmapLoader")
@js.native
class ImageBitmapLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  def load(url: java.lang.String): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit]
  ): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit]
  ): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): js.Any = js.native
  def setCrossOrigin(): ImageBitmapLoader = js.native
  def setOptions(options: js.Any): ImageBitmapLoader = js.native
  def setPath(path: java.lang.String): ImageBitmapLoader = js.native
}

