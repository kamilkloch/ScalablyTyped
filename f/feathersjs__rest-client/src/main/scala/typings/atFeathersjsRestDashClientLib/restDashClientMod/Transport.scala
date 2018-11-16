package typings
package atFeathersjsRestDashClientLib.restDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  @JSName("angularHttpClient")
  var angularHttpClient_Original: Handler = js.native
  @JSName("angular")
  var angular_Original: Handler = js.native
  @JSName("axios")
  var axios_Original: Handler = js.native
  @JSName("fetch")
  var fetch_Original: Handler = js.native
  @JSName("jquery")
  var jquery_Original: Handler = js.native
  @JSName("request")
  var request_Original: Handler = js.native
  @JSName("superagent")
  var superagent_Original: Handler = js.native
  def angular(connection: js.Any): js.Function0[HandlerResult] = js.native
  def angular(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def angularHttpClient(connection: js.Any): js.Function0[HandlerResult] = js.native
  def angularHttpClient(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def axios(connection: js.Any): js.Function0[HandlerResult] = js.native
  def axios(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def fetch(connection: js.Any): js.Function0[HandlerResult] = js.native
  def fetch(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def jquery(connection: js.Any): js.Function0[HandlerResult] = js.native
  def jquery(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def request(connection: js.Any): js.Function0[HandlerResult] = js.native
  def request(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
  def superagent(connection: js.Any): js.Function0[HandlerResult] = js.native
  def superagent(connection: js.Any, options: js.Any): js.Function0[HandlerResult] = js.native
}
