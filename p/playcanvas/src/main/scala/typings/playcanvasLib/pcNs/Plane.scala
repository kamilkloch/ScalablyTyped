package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.Plane
  * @class An infinite plane.
  * @description Create an infinite plane.
  * @param {pc.Vec3} [point] Point position on the plane. The constructor takes a reference of this parameter.
  * @param {pc.Vec3} [normal] Normal of the plane. The constructor takes a reference of this parameter.
  */
@JSGlobal("pc.Plane")
@js.native
class Plane () extends js.Object {
  def this(point: Vec3) = this()
  def this(point: Vec3, normal: Vec3) = this()
  var normal: Vec3 = js.native
  var point: Vec3 = js.native
  /**
    * @function
    * @name pc.Plane#intersectsLine
    * @description Test if the plane intersects between two points.
    * @param {pc.Vec3} start Start position of line.
    * @param {pc.Vec3} end End position of line.
    * @param {pc.Vec3} [point] If there is an intersection, the intersection point will be copied into here.
    * @returns {Boolean} True if there is an intersection.
    */
  def intersectsLine(start: Vec3, end: Vec3): scala.Boolean = js.native
  def intersectsLine(start: Vec3, end: Vec3, point: Vec3): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Plane#intersectsRay
    * @description Test if a ray intersects with the infinite plane
    * @param {pc.Ray} ray Ray to test against (direction must be normalized)
    * @param {pc.Vec3} [point] If there is an intersection, the intersection point will be copied into here
    * @returns {Boolean} True if there is an intersection
    */
  def intersectsRay(ray: Ray): scala.Boolean = js.native
  def intersectsRay(ray: Ray, point: Vec3): scala.Boolean = js.native
}

