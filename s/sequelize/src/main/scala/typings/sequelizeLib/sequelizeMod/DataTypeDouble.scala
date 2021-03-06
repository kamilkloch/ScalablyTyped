package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeDouble extends DataTypeAbstractNumber[DataTypeDouble] {
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeDouble = js.native
  def apply(length: scala.Double): DataTypeDouble = js.native
  def apply(length: scala.Double, decimals: scala.Double): DataTypeDouble = js.native
  def apply(options: sequelizeLib.Anon_Decimals): DataTypeDouble = js.native
}

