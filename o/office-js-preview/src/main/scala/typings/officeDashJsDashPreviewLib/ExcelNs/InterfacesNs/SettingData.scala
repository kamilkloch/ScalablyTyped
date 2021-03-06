package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "setting.toJSON()". */
trait SettingData extends js.Object {
  /**
    *
    * Returns the key that represents the id of the Setting. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SettingData {
  @scala.inline
  def apply(key: java.lang.String = null, value: js.Any = null): SettingData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SettingData]
  }
}

