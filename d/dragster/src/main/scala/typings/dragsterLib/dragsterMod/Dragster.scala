package typings
package dragsterLib.dragsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dragster extends js.Object {
  def removeListeners(): scala.Unit
  def reset(): scala.Unit
}

object Dragster {
  @scala.inline
  def apply(removeListeners: () => scala.Unit, reset: () => scala.Unit): Dragster = {
    val __obj = js.Dynamic.literal(removeListeners = js.Any.fromFunction0(removeListeners), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Dragster]
  }
}

