package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsGetCommentsForReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: atOctokitRestLib.atOctokitRestMod.Endpoint = js.native
  def apply(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.PullsGetCommentsForReviewResponse]
  ] = js.native
  def apply(params: atOctokitRestLib.atOctokitRestMod.PullsGetCommentsForReviewParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.PullsGetCommentsForReviewResponse]
  ] = js.native
  def apply(params: atOctokitRestLib.atOctokitRestMod.PullsGetCommentsForReviewParamsDeprecatedNumber): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.PullsGetCommentsForReviewResponse]
  ] = js.native
  def endpoint(EndpointOptions: atOctokitRestLib.atOctokitRestMod.EndpointOptions): atOctokitRestLib.atOctokitRestMod.RequestOptions = js.native
  def endpoint(Route: java.lang.String): atOctokitRestLib.atOctokitRestMod.RequestOptions = js.native
  def endpoint(Route: java.lang.String, EndpointOptions: atOctokitRestLib.atOctokitRestMod.EndpointOptions): atOctokitRestLib.atOctokitRestMod.RequestOptions = js.native
}

