package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContentProperties extends ContentProperties {
  /**
    * The formatted string content to display. This may contain a field name enclosed in `{}`, such as `{FIELDNAME}`, or an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression name, referenced as `{expression/EXPRESSIONNAME}`. Text content may also leverage HTML tags such as `<b></b>`, `<p></p>`, and `<table></table>` for formatting the look and feel of the content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#text)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextContentProperties {
  @scala.inline
  def apply(text: java.lang.String = null): TextContentProperties = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextContentProperties]
  }
}

