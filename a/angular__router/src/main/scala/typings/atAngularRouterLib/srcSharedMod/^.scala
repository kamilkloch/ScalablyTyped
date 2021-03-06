package typings
package atAngularRouterLib.srcSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/shared", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRIMARY_OUTLET: atAngularRouterLib.atAngularRouterLibStrings.primary = js.native
  def convertToParamMap(params: Params): ParamMap = js.native
  def defaultUrlMatcher(
    segments: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment],
    segmentGroup: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup,
    route: atAngularRouterLib.srcConfigMod.Route
  ): atAngularRouterLib.srcConfigMod.UrlMatchResult | scala.Null = js.native
  def isNavigationCancelingError(error: stdLib.Error): js.Any = js.native
  def navigationCancelingError(message: java.lang.String): stdLib.Error = js.native
}

