package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Settings extends js.Object {
  /**
       * The command-line arguments to pass to the executable. Defaults to an empty
       * array. Take care to wrap paths in quotes.
       */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * true to open the app as hidden. Defaults to false. The user can edit this
       * setting from the System Preferences so
       * app.getLoginItemSettings().wasOpenedAsHidden should be checked when the app is
       * opened to know the current value. This setting is not available on .
       */
  var openAsHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * true to open the app at login, false to remove the app as a login item. Defaults
       * to false.
       */
  var openAtLogin: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The executable to launch at login. Defaults to process.execPath.
       */
  var path: js.UndefOr[java.lang.String] = js.undefined
}
