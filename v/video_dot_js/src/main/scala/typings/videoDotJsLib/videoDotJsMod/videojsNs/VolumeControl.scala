package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The component for controlling the volume level
	 */
@js.native
trait VolumeControl extends Component {
  /**
  		 * Handle `mousedown` or `touchstart` events on the `VolumeControl`.
  		 *
  		 * @param event
  		 *        `mousedown` or `touchstart` event that triggered this function
  		 *
  		 * @listens mousedown
  		 * @listens touchstart
  		 */
  def handleMouseDown(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle `mousedown` or `touchstart` events on the `VolumeControl`.
  		 *
  		 * @param event
  		 *        `mousedown` or `touchstart` event that triggered this function
  		 *
  		 * @listens mousedown
  		 * @listens touchstart
  		 */
  def handleMouseMove(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle `mouseup` or `touchend` events on the `VolumeControl`.
  		 *
  		 * @param event
  		 *        `mouseup` or `touchend` event that triggered this function.
  		 *
  		 * @listens touchend
  		 * @listens mouseup
  		 */
  def handleMouseUp(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
}

