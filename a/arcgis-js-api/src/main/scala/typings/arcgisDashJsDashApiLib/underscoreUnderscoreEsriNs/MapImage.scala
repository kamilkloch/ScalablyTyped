package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapImage
  extends Accessor
     with JSONSupport {
  /**
    * The extent of the exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#extent)
    */
  var extent: Extent = js.native
  /**
    * The requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#height)
    */
  var height: scala.Double = js.native
  /**
    * URL to the returned image. The image format must be of a type supported by the HTML `<img>` tag.  **Possible Values:** gif | jpg | png | bmp
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#href)
    */
  var href: java.lang.String = js.native
  /**
    * The opacity of the image. Value can be any number between `0` and `1` where `0` is 100% transparent, `0.5` is 50% transparent and `1` is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#opacity)
    *
    * @default 1
    */
  var opacity: scala.Double = js.native
  /**
    * Scale of the requested dynamic map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#scale)
    */
  var scale: scala.Double = js.native
  /**
    * Indicates if the requested image is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#visible)
    *
    * @default true
    */
  var visible: scala.Boolean = js.native
  /**
    * The requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html#width)
    */
  var width: scala.Double = js.native
}

@JSGlobal("__esri.MapImage")
@js.native
class MapImageCls () extends MapImage {
  def this(properties: MapImageProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

