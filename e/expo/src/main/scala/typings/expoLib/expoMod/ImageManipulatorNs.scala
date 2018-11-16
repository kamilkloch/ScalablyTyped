package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ImageManipulator")
@js.native
object ImageManipulatorNs extends js.Object {
  
  trait Crop extends js.Object {
    var height: scala.Double
    var originX: scala.Double
    var originY: scala.Double
    var width: scala.Double
  }
  
  
  trait Flip extends js.Object {
    var flip: js.UndefOr[expoLib.Anon_Horizontal] = js.undefined
  }
  
  
  trait ImageResult extends js.Object {
    var base64: js.UndefOr[java.lang.String] = js.undefined
    var height: scala.Double
    var uri: java.lang.String
    var width: scala.Double
  }
  
  
  trait Resize extends js.Object {
    var resize: expoLib.Anon_HeightWidth
  }
  
  
  trait Rotate extends js.Object {
    var rotate: scala.Double
  }
  
  
  trait SaveOptions extends js.Object {
    var base64: js.UndefOr[scala.Boolean] = js.undefined
    /** A value in range `0` - `1` specifying compression level of the result image. `1` means no compression and `0` the highest compression. */
    var compress: js.UndefOr[scala.Double] = js.undefined
    var format: js.UndefOr[expoLib.expoLibStrings.jpeg | expoLib.expoLibStrings.png] = js.undefined
  }
  
  def manipulate(uri: java.lang.String, actions: js.Array[Action]): stdLib.Promise[ImageResult] = js.native
  def manipulate(uri: java.lang.String, actions: js.Array[Action], saveOptions: SaveOptions): stdLib.Promise[ImageResult] = js.native
  type Action = Resize | Rotate | Flip | Crop
}
