package typings
package enhancedDashResolveLib.libAliasFieldPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasFieldPlugin extends js.Object {
  var field: java.lang.String
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object AliasFieldPlugin {
  @scala.inline
  def apply(
    apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit,
    field: java.lang.String,
    source: java.lang.String,
    target: java.lang.String
  ): AliasFieldPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), field = field, source = source, target = target)
  
    __obj.asInstanceOf[AliasFieldPlugin]
  }
}

