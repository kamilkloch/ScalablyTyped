package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentScopeFollowUpdatesParams extends js.Object {
  var feed: js.UndefOr[nanoLib.nanoLibStrings.continuous] = js.undefined
  var filter: js.UndefOr[java.lang.String | FollowUpdatesParamsFilterFunction] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  var inactivity_ms: js.UndefOr[scala.Double] = js.undefined
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  var initial_retry_delay: js.UndefOr[scala.Double] = js.undefined
  var max_retry_seconds: js.UndefOr[scala.Double] = js.undefined
  var query_params: js.UndefOr[js.Any] = js.undefined
  var response_grace_time: js.UndefOr[scala.Double] = js.undefined
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentScopeFollowUpdatesParams {
  @scala.inline
  def apply(
    feed: nanoLib.nanoLibStrings.continuous = null,
    filter: java.lang.String | FollowUpdatesParamsFilterFunction = null,
    headers: js.Any = null,
    heartbeat: scala.Int | scala.Double = null,
    inactivity_ms: scala.Int | scala.Double = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    initial_retry_delay: scala.Int | scala.Double = null,
    max_retry_seconds: scala.Int | scala.Double = null,
    query_params: js.Any = null,
    response_grace_time: scala.Int | scala.Double = null,
    since: java.lang.String = null
  ): DocumentScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal()
    if (feed != null) __obj.updateDynamic("feed")(feed)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (inactivity_ms != null) __obj.updateDynamic("inactivity_ms")(inactivity_ms.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (initial_retry_delay != null) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.asInstanceOf[js.Any])
    if (max_retry_seconds != null) __obj.updateDynamic("max_retry_seconds")(max_retry_seconds.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params)
    if (response_grace_time != null) __obj.updateDynamic("response_grace_time")(response_grace_time.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[DocumentScopeFollowUpdatesParams]
  }
}

