package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * @description Component that adds "pull-to-refresh" to an <ons-page> element
   */
//later should be updated
@js.native
trait OnsPullHookElement
  extends stdLib.HTMLElement {
  /**
       * @description A boolean value that specifies whether the element is disabled or not.
       */
  var disabled: scala.Boolean = js.native
  /**
      * @description The height of the pull hook in pixels. The default value is `64px`.
      */
  var height: java.lang.String = js.native
  /**
       * @description Define the function that will be called in the `"action"` state.
       */
  var onAction: js.UndefOr[js.Function] = js.native
  /**
       * @param {Number} ratio Pulled ratio (scroll / height).
       * @param {Object} animationOptions Object containing duration and timing.
       * @description Hook called whenever the user pulls the element.
       **/
  var onPull: js.UndefOr[js.Function] = js.native
  /**
      * @description The current number of pixels the pull hook has moved.
      */
  var pullDistance: scala.Double = js.native
  /**
      * @description The current number of pixels the pull hook has moved.
      */
  var state: java.lang.String = js.native
  /**
       * @param {Number} thresholdHeight Desired threshold height
       * @description The thresholdHeight of the pull hook in pixels. The default value is `96px`.
       */
  var thresholdHeight: java.lang.String = js.native
}
