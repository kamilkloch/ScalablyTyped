package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An energy source object. Can be harvested by creeps with a WORK body part.
  */
trait Source extends RoomObject {
  /**
    * The remaining amount of energy.
    */
  var energy: scala.Double
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  var energyCapacity: scala.Double
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  @JSName("room")
  var room_Source: Room
  /**
    * The remaining time after which the source will be refilled.
    */
  var ticksToRegeneration: scala.Double
}

@JSGlobal("Source")
@js.native
class SourceCls protected () extends Source {
  def this(id: java.lang.String) = this()
  /**
    * The remaining amount of energy.
    */
  /* CompleteClass */
  override var energy: scala.Double = js.native
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  /* CompleteClass */
  override var energyCapacity: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
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
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Source: Room = js.native
  /**
    * The remaining time after which the source will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: scala.Double = js.native
}

object Source {
  @scala.inline
  def apply(
    energy: scala.Double,
    energyCapacity: scala.Double,
    id: java.lang.String,
    pos: RoomPosition,
    room: Room,
    ticksToRegeneration: scala.Double
  ): Source = {
    val __obj = js.Dynamic.literal(energy = energy, energyCapacity = energyCapacity, id = id, pos = pos, room = room, ticksToRegeneration = ticksToRegeneration)
  
    __obj.asInstanceOf[Source]
  }
}

