package typings
package antdDashMobileDashRnLib.libLocaleDashProviderLocaleDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var locale: antdDashMobileDashRnLib.Anon_DatePicker
}

object LocaleProviderProps {
  @scala.inline
  def apply(
    locale: antdDashMobileDashRnLib.Anon_DatePicker,
    children: reactLib.reactMod.ReactElement[_] = null
  ): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

