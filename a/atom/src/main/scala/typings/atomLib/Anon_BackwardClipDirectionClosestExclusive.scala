package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirectionClosestExclusive extends js.Object {
  var clipDirection: js.UndefOr[
    atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest
  ] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var invalidate: js.UndefOr[
    atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch
  ] = js.undefined
}

object Anon_BackwardClipDirectionClosestExclusive {
  @scala.inline
  def apply(
    clipDirection: atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    invalidate: atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch = null
  ): Anon_BackwardClipDirectionClosestExclusive = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackwardClipDirectionClosestExclusive]
  }
}

