package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A site of a structure which is currently under construction.
 */

trait ConstructionSite[T /* <: BuildableStructureConstant */] extends RoomObject {
  /**
       * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
       */
  var id: java.lang.String
  /**
       * Whether this is your own construction site.
       */
  var my: scala.Boolean
  /**
       * An object with the structure’s owner info.
       */
  var owner: Owner
  /**
       * The current construction progress.
       */
  var progress: scala.Double
  /**
       * The total construction progress needed for the structure to be built.
       */
  var progressTotal: scala.Double
  /**
       * One of the `STRUCTURE_*` constants.
       */
  var structureType: T
  /**
       * Remove the construction site.
       * @returns Result Code: OK, ERR_NOT_OWNER
       */
  def remove(): scala.Double
}
