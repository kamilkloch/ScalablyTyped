package typings
package atEmberRunloopLib.atEmberRunloopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", "scheduleOnce")
@js.native
object scheduleOnce extends js.Object {
  def apply[Target](
    queue: atEmberRunloopLib.dashPrivateTypesMod.EmberRunQueues,
    target: Target,
    method: atEmberRunloopLib.dashPrivateTypesMod.RunMethod[Target, _],
    args: js.Any*
  ): atEmberRunloopLib.typesMod.EmberRunTimer = js.native
}

