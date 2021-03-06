package typings
package personaLib.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var loggedInUser: java.lang.String
  var onready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def onlogin(s: java.lang.String): scala.Unit
  def onlogout(): scala.Unit
}

object WatchOptions {
  @scala.inline
  def apply(
    loggedInUser: java.lang.String,
    onlogin: java.lang.String => scala.Unit,
    onlogout: () => scala.Unit,
    onready: () => scala.Unit = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser, onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
    if (onready != null) __obj.updateDynamic("onready")(js.Any.fromFunction0(onready))
    __obj.asInstanceOf[WatchOptions]
  }
}

