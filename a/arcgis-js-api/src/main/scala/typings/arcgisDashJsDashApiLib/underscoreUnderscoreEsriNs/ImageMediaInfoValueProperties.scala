package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMediaInfoValueProperties extends js.Object {
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: js.UndefOr[java.lang.String] = js.undefined
}

object ImageMediaInfoValueProperties {
  @scala.inline
  def apply(linkURL: java.lang.String = null, sourceURL: java.lang.String = null): ImageMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    if (linkURL != null) __obj.updateDynamic("linkURL")(linkURL)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    __obj.asInstanceOf[ImageMediaInfoValueProperties]
  }
}

