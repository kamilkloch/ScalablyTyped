package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLayerRoot")
@js.native
class KmlLayerRoot () extends KmlFolder {
  /**
    * Enables a layer based on its ID.
    */
  def enableLayerById(id: java.lang.String, visibility: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the drawing order for this database.
    */
  def getDrawOrder(): scala.Double = js.native
  /**
    * Returns the layer based on the layer's ID.
    */
  def getLayerById(id: java.lang.String): KmlLayer = js.native
  /**
    * Defines the drawing order for databases.
    * Drawing order is lowest to highest.
    * Google Earth Enterprise customers can add a side database and set the drawOrder to be either before or after that of the main database.
    * Side databases default to a drawing order of 0.
    */
  def setDrawOrder(drawOrder: scala.Double): scala.Unit = js.native
}

