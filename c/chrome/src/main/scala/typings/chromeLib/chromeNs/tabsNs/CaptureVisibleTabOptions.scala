package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CaptureVisibleTabOptions extends js.Object {
  /**
           * Optional. The format of an image.
           * One of: "jpeg", or "png"
           */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * When format is "jpeg", controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
           */
  var quality: js.UndefOr[scala.Double] = js.undefined
}
