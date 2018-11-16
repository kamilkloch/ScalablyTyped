package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindPathOpts extends js.Object {
  /**
       * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
       * be used when the new PathFinder is enabled (use costCallback option instead).
       */
  var avoid: js.UndefOr[js.Array[_] | js.Array[RoomPosition]] = js.undefined
  /**
       * You can use this callback to modify a CostMatrix for any room during the search. The callback accepts two arguments, roomName
       * and costMatrix. Use the costMatrix instance to make changes to the positions costs. If you return a new matrix from this callback,
       * it will be used instead of the built-in cached one. This option is only used when the new PathFinder is enabled.
       *
       * @param roomName The name of the room.
       * @param costMatrix The current CostMatrix
       * @returns The new CostMatrix to use
       */
  var costCallback: js.UndefOr[
    js.Function2[
      /* roomName */ java.lang.String, 
      /* costMatrix */ CostMatrix, 
      scala.Boolean | CostMatrix
    ]
  ] = js.undefined
  /**
       * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
       * A* algorithm mechanics! The default value is 1.2.
       */
  var heuristicWeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
       * cannot be used when the new PathFinder is enabled (use costCallback option instead).
       */
  var ignore: js.UndefOr[js.Array[_] | js.Array[RoomPosition]] = js.undefined
  /**
       * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
       * value is false.
       */
  var ignoreCreeps: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
       * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
       * it automatically attacks the structure. The default value is false.
       */
  var ignoreDestructibleStructures: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
       * new PathFinder is enabled.
       */
  var ignoreRoads: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
       * The default value is 2000.
       */
  var maxOps: js.UndefOr[scala.Double] = js.undefined
  /**
       * The maximum allowed rooms to search. The default (and maximum) is 16. This is only used when the new PathFinder is enabled.
       */
  var maxRooms: js.UndefOr[scala.Double] = js.undefined
  /**
       * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
       */
  var range: js.UndefOr[scala.Double] = js.undefined
  /**
       * If true, the result path will be serialized using Room.serializePath. The default is false.
       */
  var serialize: js.UndefOr[scala.Boolean] = js.undefined
}
