package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /**
  		HTML tag value in escaped HTML.
  		*/
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(text: java.lang.String = null): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextOptions]
  }
}

