package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteHTMLAttributes[T] extends HTMLAttributes[T] {
  var cite: js.UndefOr[java.lang.String] = js.undefined
}

object QuoteHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, cite: java.lang.String = null): QuoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cite != null) __obj.updateDynamic("cite")(cite)
    __obj.asInstanceOf[QuoteHTMLAttributes[T]]
  }
}

