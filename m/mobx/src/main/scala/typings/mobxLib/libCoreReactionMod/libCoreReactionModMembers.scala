package typings
package mobxLib.libCoreReactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/reaction", JSImport.Namespace)
@js.native
object libCoreReactionModMembers extends js.Object {
  val isReaction: js.Function1[/* x */ js.Any, /* is Reaction */scala.Boolean] = js.native
  def onReactionError(
    handler: js.Function2[
      /* error */ js.Any, 
      /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def runReactions(): scala.Unit = js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[scala.Unit], scala.Unit]): scala.Unit = js.native
}
