package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a gamepad control stick position
     */
@JSImport("babylonjs", "StickValues")
@js.native
class StickValues protected ()
  extends babylonjsLib.BABYLONNs.StickValues {
  /**
           * Initializes the gamepad x and y control stick values
           * @param x The x component of the gamepad control stick value
           * @param y The y component of the gamepad control stick value
           */
  def this(/**
           * The x component of the control stick
           */
  x: scala.Double, /**
           * The y component of the control stick
           */
  y: scala.Double) = this()
}
