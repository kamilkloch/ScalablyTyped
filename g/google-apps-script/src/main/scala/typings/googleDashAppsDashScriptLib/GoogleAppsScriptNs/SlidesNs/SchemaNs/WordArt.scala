package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArt extends js.Object {
  var renderedText: js.UndefOr[java.lang.String] = js.undefined
}

object WordArt {
  @scala.inline
  def apply(renderedText: java.lang.String = null): WordArt = {
    val __obj = js.Dynamic.literal()
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText)
    __obj.asInstanceOf[WordArt]
  }
}

