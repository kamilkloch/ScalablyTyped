package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageResizeModeStatic extends js.Object {
  /**
       * center - The image will be scaled down such that it is completely visible,
       * if bigger than the area of the view.
       * The image will not be scaled up.
       */
  var center: ImageResizeMode
  /**
       * contain - The image will be resized such that it will be completely
       * visible, contained within the frame of the View.
       */
  var contain: ImageResizeMode
  /**
       * cover - The image will be resized such that the entire area of the view
       * is covered by the image, potentially clipping parts of the image.
       */
  var cover: ImageResizeMode
  /**
       * repeat - The image will be repeated to cover the frame of the View. The
       * image will keep it's size and aspect ratio.
       */
  var repeat: ImageResizeMode
  /**
       * stretch - The image will be stretched to fill the entire frame of the
       * view without clipping.  This may change the aspect ratio of the image,
       * distoring it.  Only supported on iOS.
       */
  var stretch: ImageResizeMode
}
