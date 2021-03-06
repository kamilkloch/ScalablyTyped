package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelIconOnly extends js.Object {
  var `aria-label`: java.lang.String
  var iconOnly: js.UndefOr[scala.Nothing] = js.undefined
  var label: js.UndefOr[scala.Nothing] = js.undefined
  var role: java.lang.String
}

object Anon_ArialabelIconOnly {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String,
    role: java.lang.String,
    iconOnly: js.UndefOr[scala.Nothing] = js.undefined,
    label: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ArialabelIconOnly = {
    val __obj = js.Dynamic.literal(role = role)
    __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly)
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ArialabelIconOnly]
  }
}

