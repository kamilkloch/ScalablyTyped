package typings
package tileDashReduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * End Event
    *
    * @returns {Events}
    * @example
    * let count = 0
    * tilereduce({...})
    * .on('end', () => {
    *     console.log(`Total count was: ${ count }`)
    * })
    */
  @JSName("on")
  def on_end(
    `type`: tileDashReduceLib.tileDashReduceLibStrings.end,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): Events = js.native
  /**
    * Map Event
    *
    * @param {Tile} tile
    * @param {number} workerId
    * @returns {Events}
    * @example
    * tilereduce({...})
    * .on('map', (tile, workerId) => {
    *     console.log(`about to process [${ tile }] on worker ${ workerId }`)
    * })
    */
  @JSName("on")
  def on_map(
    `type`: tileDashReduceLib.tileDashReduceLibStrings.map,
    callback: js.Function2[
      /* tile */ tileDashReduceLib.TileReduceNs.Tile, 
      /* workerId */ scala.Double, 
      scala.Unit
    ]
  ): Events = js.native
  /**
    * Reduce Event
    *
    * @param {any} result
    * @param {Tile} tile
    * @returns {Events}
    * @example
    * const count = 0
    * tilereduce({...})
    * .on('reduce', (result, tile) => {
    *     console.log(`got a count of ${ result } from ${ tile }`
    *     count ++
    * })
    */
  @JSName("on")
  def on_reduce(
    `type`: tileDashReduceLib.tileDashReduceLibStrings.reduce,
    callback: js.Function2[/* result */ js.Any, /* tile */ tileDashReduceLib.TileReduceNs.Tile, scala.Unit]
  ): Events = js.native
  /**
    * Start Event
    *
    * @returns {Events}
    * @example
    * tilereduce({...})
    * .on('start', () => {
    *     console.log('starting')
    * })
    */
  @JSName("on")
  def on_start(`type`: tileDashReduceLib.tileDashReduceLibStrings.start, callback: js.Function0[scala.Unit]): Events = js.native
}

