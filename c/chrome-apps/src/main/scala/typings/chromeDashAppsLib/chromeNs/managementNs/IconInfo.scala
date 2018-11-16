package typings
package chromeDashAppsLib.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an icon belonging to an extension, app, or theme. */

trait IconInfo extends js.Object {
  /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
  var size: chromeDashAppsLib.chromeNs.integer
  /**
               * The URL for this icon image.
               * To display a grayscale version of the icon (to indicate that an extension is disabled, for example),
               * append ?grayscale=true to the URL. */
  var url: java.lang.String
}
