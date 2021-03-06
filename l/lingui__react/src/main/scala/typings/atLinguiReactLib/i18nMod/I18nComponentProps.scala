package typings
package atLinguiReactLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[scala.Boolean] = js.undefined
  var withHash: js.UndefOr[scala.Boolean] = js.undefined
  def children(hasI18nI18nHash: atLinguiReactLib.Anon_I18n): reactLib.reactMod.ReactNode
}

object I18nComponentProps {
  @scala.inline
  def apply(
    children: atLinguiReactLib.Anon_I18n => reactLib.reactMod.ReactNode,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    withHash: js.UndefOr[scala.Boolean] = js.undefined
  ): I18nComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash)
    __obj.asInstanceOf[I18nComponentProps]
  }
}

