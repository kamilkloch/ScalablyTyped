package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the minimum interface to fullfil in order to be a sprite manager.
  */
@js.native
trait ISpriteManager extends IDisposable {
  /**
    * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
    */
  var isPickable: scala.Boolean = js.native
  /**
    * Restricts the camera to viewing objects with the same layerMask.
    * A camera with a layerMask of 1 will render spriteManager.layerMask & camera.layerMask!== 0
    */
  var layerMask: scala.Double = js.native
  /**
    * Specifies the rendering group id for this mesh (0 by default)
    * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
    */
  var renderingGroupId: scala.Double = js.native
  /**
    * Defines the list of sprites managed by the manager.
    */
  var sprites: js.Array[Sprite] = js.native
  /**
    * Tests the intersection of a sprite with a specific ray.
    * @param ray The ray we are sending to test the collision
    * @param camera The camera space we are sending rays in
    * @param predicate A predicate allowing excluding sprites from the list of object to test
    * @param fastCheck Is the hit test done in a OOBB or AOBB fashion the faster, the less precise
    * @returns picking info or null.
    */
  def intersects(ray: Ray, camera: Camera): Nullable[PickingInfo] = js.native
  def intersects(ray: Ray, camera: Camera, predicate: js.Function1[/* sprite */ Sprite, scala.Boolean]): Nullable[PickingInfo] = js.native
  def intersects(
    ray: Ray,
    camera: Camera,
    predicate: js.Function1[/* sprite */ Sprite, scala.Boolean],
    fastCheck: scala.Boolean
  ): Nullable[PickingInfo] = js.native
  /**
    * Renders the list of sprites on screen.
    */
  def render(): scala.Unit = js.native
}

