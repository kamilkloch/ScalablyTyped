package typings
package enhancedDashResolveLib.libTryNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryNextPlugin extends js.Object {
  var message: java.lang.String | scala.Null
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object TryNextPlugin {
  @scala.inline
  def apply(
    apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit,
    source: java.lang.String,
    target: java.lang.String,
    message: java.lang.String = null
  ): TryNextPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TryNextPlugin]
  }
}

