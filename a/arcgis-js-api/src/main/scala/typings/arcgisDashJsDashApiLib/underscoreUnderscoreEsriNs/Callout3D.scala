package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callout3D
  extends Accessor
     with JSONSupport

@JSGlobal("__esri.Callout3D")
@js.native
/**
  * When symbols have an offset from their position, it's important to still see what the real location is. This can be achieved with callouts:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html)
  */
class Callout3DCls () extends Callout3D {
  def this(properties: Callout3DProperties) = this()
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

