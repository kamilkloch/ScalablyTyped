package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStackProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  var forceSync: js.UndefOr[scala.Boolean] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  def render(props: TabsRendererProps): reactLib.reactMod.ReactNode
}

object TabStackProps {
  @scala.inline
  def apply(
    render: TabsRendererProps => reactLib.reactMod.ReactNode,
    children: js.Array[reactLib.reactMod.ReactNode] = null,
    forceSync: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): TabStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStackProps]
  }
}

