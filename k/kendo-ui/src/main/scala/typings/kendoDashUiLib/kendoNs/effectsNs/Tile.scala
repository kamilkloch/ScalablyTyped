package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends Effect {
  def direction(value: java.lang.String): Tile
}

object Tile {
  @scala.inline
  def apply(
    add: Effect => Tile,
    direction: java.lang.String => Tile,
    duration: scala.Double => Tile,
    play: () => kendoDashUiLib.JQueryPromise[_],
    reverse: () => kendoDashUiLib.JQueryPromise[_],
    stop: () => Tile
  ): Tile = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Tile]
  }
}

