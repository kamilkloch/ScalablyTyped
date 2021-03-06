package typings
package reactDashBreadcrumbsLib.reactDashBreadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, reactLib.reactMod.ReactNode]] = js.undefined
  var wrapper: js.UndefOr[
    reactLib.reactMod.StatelessComponent[js.Object] | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState])
  ] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    setCrumbs: /* crumbs */ Crumbs => reactLib.reactMod.ReactNode = null,
    wrapper: reactLib.reactMod.StatelessComponent[js.Object] | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1(setCrumbs))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

