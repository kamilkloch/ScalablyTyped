package typings
package jsDashCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[jsDashCookieLib.jsDashCookieMod.CookieReadConverter] = js.undefined
  var write: js.UndefOr[jsDashCookieLib.jsDashCookieMod.CookieWriteConverter[TConv]] = js.undefined
}

object Anon_Read {
  @scala.inline
  def apply[TConv /* <: js.Object */](
    read: jsDashCookieLib.jsDashCookieMod.CookieReadConverter = null,
    write: jsDashCookieLib.jsDashCookieMod.CookieWriteConverter[TConv] = null
  ): Anon_Read[TConv] = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Anon_Read[TConv]]
  }
}

