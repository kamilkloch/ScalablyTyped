package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserChoice extends js.Object {
  /**
       * Clears the current user choice of preferred navigator app.
       * @param callback - function to call once operation is complete.
       */
  def clear(callback: js.Function0[scala.Unit]): scala.Unit
  /**
       * Indicates whether a user choice exists for a preferred navigator app.
       * @param callback - function to pass result to: will receive a boolean argument.
       */
  def exists(callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit
  /**
       * Returns current user choice of preferred navigator app.
       * @param callback - function to pass result to: will receive a string argument indicating the app, which is a constant in `launchnavigator.APP`.
       */
  def get(callback: js.Function1[/* app */ java.lang.String, scala.Unit]): scala.Unit
  /**
       * Sets the current user choice of preferred navigator app.
       * @param app - app to set as preferred choice as a constant in `launchnavigator.APP`.
       * @param callback - function to call once operation is complete.
       */
  def set(app: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
}
