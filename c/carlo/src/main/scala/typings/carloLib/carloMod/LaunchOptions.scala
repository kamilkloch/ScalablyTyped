package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends WindowOptions {
  /**
    * Additional arguments to pass to the browser instance.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Browser to be used, defaults to ['stable']
    */
  var channel: js.UndefOr[js.Array[Channel]] = js.undefined
  /**
    * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
    * If executablePath is a relative path, then it is resolved relative to current working directory.
    * Carlo is only guaranteed to work with the latest Chrome stable version.
    */
  var executablePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Application icon to be used in the system dock.
    * Either buffer containing PNG or a path to the PNG file on the file system.
    * This feature is only available in Chrome M72+.
    * One can use 'canary' channel to see it in action before M72 hits stable.
    */
  var icon: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /**
    * Optional parameters to share between Carlo instances.
    */
  var paramsForReuse: js.UndefOr[js.Any] = js.undefined
  /**
    * Application title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
    */
  var userDataDir: js.UndefOr[java.lang.String] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    bgcolor: java.lang.String = null,
    channel: js.Array[Channel] = null,
    executablePath: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    icon: nodeLib.Buffer | java.lang.String = null,
    left: scala.Int | scala.Double = null,
    paramsForReuse: js.Any = null,
    title: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    userDataDir: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (paramsForReuse != null) __obj.updateDynamic("paramsForReuse")(paramsForReuse)
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

