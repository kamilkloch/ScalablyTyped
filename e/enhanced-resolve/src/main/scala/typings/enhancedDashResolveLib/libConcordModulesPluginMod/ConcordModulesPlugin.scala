package typings
package enhancedDashResolveLib.libConcordModulesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordModulesPlugin extends js.Object {
  var options: enhancedDashResolveLib.libConcordMod.Dictionary[_]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object ConcordModulesPlugin {
  @scala.inline
  def apply(
    apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit,
    options: enhancedDashResolveLib.libConcordMod.Dictionary[_],
    source: java.lang.String,
    target: java.lang.String
  ): ConcordModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options, source = source, target = target)
  
    __obj.asInstanceOf[ConcordModulesPlugin]
  }
}

