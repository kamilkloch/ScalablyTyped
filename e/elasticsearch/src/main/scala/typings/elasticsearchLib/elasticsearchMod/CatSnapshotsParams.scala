package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSnapshotsParams extends GenericParams {
  var format: java.lang.String
  var h: js.UndefOr[NameList] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: js.UndefOr[NameList] = js.undefined
  var v: js.UndefOr[scala.Boolean] = js.undefined
}

object CatSnapshotsParams {
  @scala.inline
  def apply(
    format: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    h: NameList = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    repository: NameList = null,
    requestTimeout: scala.Int | scala.Double = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
  ): CatSnapshotsParams = {
    val __obj = js.Dynamic.literal(format = format)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatSnapshotsParams]
  }
}

