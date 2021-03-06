package typings
package enhancedDashResolveLib.libAliasPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPlugin extends js.Object {
  var alias: java.lang.String
  var name: java.lang.String
  var onlyModule: scala.Boolean
  var options: enhancedDashResolveLib.enhancedDashResolveMod.ResolverFactoryNs.AliasItem
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: java.lang.String,
    apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit,
    name: java.lang.String,
    onlyModule: scala.Boolean,
    options: enhancedDashResolveLib.enhancedDashResolveMod.ResolverFactoryNs.AliasItem,
    source: java.lang.String,
    target: java.lang.String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal(alias = alias, apply = js.Any.fromFunction1(apply), name = name, onlyModule = onlyModule, options = options, source = source, target = target)
  
    __obj.asInstanceOf[AliasPlugin]
  }
}

