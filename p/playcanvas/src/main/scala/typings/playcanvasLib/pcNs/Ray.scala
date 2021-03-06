package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Ray
  * @class An infinite ray
  * @description Creates a new infinite ray starting at a given origin and pointing in a given direction.
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  * // the entity's negative Z axis
  * var ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  * @param {pc.Vec3} [origin] The starting point of the ray. The constructor takes a reference of this parameter.
  * Defaults to the origin (0, 0, 0).
  * @param {pc.Vec3} [direction] The direction of the ray. The constructor takes a reference of this parameter.
  * Defaults to a direction down the world negative Z axis (0, 0, -1).
  */
@JSGlobal("pc.Ray")
@js.native
class Ray () extends js.Object {
  def this(origin: Vec3) = this()
  def this(origin: Vec3, direction: Vec3) = this()
  var direction: Vec3 = js.native
  var origin: Vec3 = js.native
}

