package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A nuke landing position. This object cannot be removed or modified. You can find incoming nukes in the room using the FIND_NUKES constant.
  */
trait Nuke extends RoomObject {
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: java.lang.String
  /**
    * The remaining landing time.
    */
  var timeToLand: scala.Double
}

@JSGlobal("Nuke")
@js.native
class NukeCls protected () extends Nuke {
  def this(id: java.lang.String) = this()
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * The name of the room where this nuke has been launched from.
    */
  /* CompleteClass */
  override var launchRoomName: java.lang.String = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
  /**
    * The remaining landing time.
    */
  /* CompleteClass */
  override var timeToLand: scala.Double = js.native
}

object Nuke {
  @scala.inline
  def apply(
    id: java.lang.String,
    launchRoomName: java.lang.String,
    pos: RoomPosition,
    timeToLand: scala.Double,
    room: Room = null
  ): Nuke = {
    val __obj = js.Dynamic.literal(id = id, launchRoomName = launchRoomName, pos = pos, timeToLand = timeToLand)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Nuke]
  }
}

