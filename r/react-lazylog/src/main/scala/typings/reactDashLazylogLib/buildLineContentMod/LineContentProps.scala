package typings
package reactDashLazylogLib.buildLineContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineContentProps extends js.Object {
  var data: js.Array[reactDashLazylogLib.Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNode]] = js.undefined
  var number: scala.Double
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object LineContentProps {
  @scala.inline
  def apply(
    data: js.Array[reactDashLazylogLib.Anon_Text],
    number: scala.Double,
    formatPart: /* text */ java.lang.String => reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null
  ): LineContentProps = {
    val __obj = js.Dynamic.literal(data = data, number = number)
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineContentProps]
  }
}

