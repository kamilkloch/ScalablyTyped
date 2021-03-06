package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableConfig extends js.Object {
  def holdComplete(callback: js.Function0[scala.Unit]): js.Function0[js.Function0[scala.Unit]]
  def holdProgress(callback: js.Function0[scala.Unit]): js.Function1[
    /* updateState */ js.Function1[/* holdLength */ scala.Double, scala.Unit], 
    js.Function0[scala.Unit]
  ]
}

object HoldableConfig {
  @scala.inline
  def apply(
    holdComplete: js.Function0[scala.Unit] => js.Function0[js.Function0[scala.Unit]],
    holdProgress: js.Function0[scala.Unit] => js.Function1[
      /* updateState */ js.Function1[/* holdLength */ scala.Double, scala.Unit], 
      js.Function0[scala.Unit]
    ]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal(holdComplete = js.Any.fromFunction1(holdComplete), holdProgress = js.Any.fromFunction1(holdProgress))
  
    __obj.asInstanceOf[HoldableConfig]
  }
}

