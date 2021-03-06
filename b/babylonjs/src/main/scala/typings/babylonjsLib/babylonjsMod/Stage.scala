package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Repressentation of a stage in the scene (Basically a list of ordered steps)
  * @hidden
  */
@JSImport("babylonjs", "Stage")
@js.native
/**
  * Hide ctor from the rest of the world.
  * @param items The items to add.
  */
class Stage[T /* <: js.Function */] protected ()
  extends babylonjsLib.BABYLONNs.Stage[T]

/* static members */
@JSImport("babylonjs", "Stage")
@js.native
object Stage extends js.Object {
  /**
    * Creates a new Stage.
    * @returns A new instance of a Stage
    */
  def Create[T /* <: js.Function */](): babylonjsLib.BABYLONNs.Stage[T] = js.native
}

