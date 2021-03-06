package typings
package popperDotJsLib.popperDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Popper extends js.Object {
  var options: PopperOptions
  var popper: stdLib.Element
  var reference: stdLib.Element | ReferenceObject
  def destroy(): scala.Unit
  def disableEventListeners(): scala.Unit
  def enableEventListeners(): scala.Unit
  def scheduleUpdate(): scala.Unit
  def update(): scala.Unit
}

object Popper {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    disableEventListeners: () => scala.Unit,
    enableEventListeners: () => scala.Unit,
    options: PopperOptions,
    popper: stdLib.Element,
    reference: stdLib.Element | ReferenceObject,
    scheduleUpdate: () => scala.Unit,
    update: () => scala.Unit
  ): Popper = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options, popper = popper, reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Popper]
  }
}

