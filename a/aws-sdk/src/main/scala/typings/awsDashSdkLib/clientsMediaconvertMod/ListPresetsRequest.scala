package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPresetsRequest extends js.Object {
  /**
    * Optionally, specify a preset category to limit responses to only presets from that category.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  var ListBy: js.UndefOr[PresetListBy] = js.undefined
  /**
    * Optional. Number of presets, up to twenty, that will be returned at one time
    */
  var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of presets.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[Order] = js.undefined
}

object ListPresetsRequest {
  @scala.inline
  def apply(
    Category: __string = null,
    ListBy: PresetListBy = null,
    MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
    NextToken: __string = null,
    Order: Order = null
  ): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (ListBy != null) __obj.updateDynamic("ListBy")(ListBy.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPresetsRequest]
  }
}

