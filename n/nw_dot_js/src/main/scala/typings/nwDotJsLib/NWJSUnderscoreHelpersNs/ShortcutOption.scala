package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Shortcut option is an object contains initial settings for the Shortcut.
     */
@js.native
trait ShortcutOption extends js.Object {
  /**
           * {Function} (Optional) A callback when the hotkey is triggered.
           */
  var active: js.Function = js.native
  /**
           * {string} Key combinations of the shortcut, such as "ctrl+shift+a".
           */
  var key: java.lang.String = js.native
  /**
           * {Function} (Optional) A callback when failed to register the hotkey.
           *
           * @param msg {string} Failure message
           */
  def failed(): js.Any = js.native
  /**
           * {Function} (Optional) A callback when failed to register the hotkey.
           *
           * @param msg {string} Failure message
           */
  def failed(msg: java.lang.String): js.Any = js.native
}
