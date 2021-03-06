package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsHTMLAttributes[T] extends HTMLAttributes[T] {
  var cite: js.UndefOr[java.lang.String] = js.undefined
  var dateTime: js.UndefOr[java.lang.String] = js.undefined
}

object InsHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    cite: java.lang.String = null,
    dateTime: java.lang.String = null
  ): InsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cite != null) __obj.updateDynamic("cite")(cite)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    __obj.asInstanceOf[InsHTMLAttributes[T]]
  }
}

