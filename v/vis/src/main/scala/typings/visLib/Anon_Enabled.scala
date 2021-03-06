package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var scaleFactor: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    scaleFactor: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

