package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRamp
  extends Accessor
     with JSONSupport {
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html#type)
    */
  val `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.algorithmic | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.multipart = js.native
}

@JSGlobal("__esri.ColorRamp")
@js.native
/**
  * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html)
  */
class ColorRampCls () extends ColorRamp {
  def this(properties: ColorRampProperties) = this()
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

