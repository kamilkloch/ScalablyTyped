package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeGeometry extends DataTypeAbstract {
  /**
    * Geometry field for Postgres
    */
  def apply(`type`: java.lang.String): DataTypeGeometry = js.native
  def apply(`type`: java.lang.String, srid: scala.Double): DataTypeGeometry = js.native
}

