package typings
package reactDashLazylogLib.buildScrollFollowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[scala.Boolean] = js.undefined
  def render(props: ScrollFollowRenderProps): reactLib.reactMod.ReactNode
}

object ScrollFollowProps {
  @scala.inline
  def apply(
    render: ScrollFollowRenderProps => reactLib.reactMod.ReactNode,
    startFollowing: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollFollowProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing)
    __obj.asInstanceOf[ScrollFollowProps]
  }
}

