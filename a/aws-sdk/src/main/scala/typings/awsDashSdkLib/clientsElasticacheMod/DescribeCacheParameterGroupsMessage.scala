package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheParameterGroupsMessage extends js.Object {
  /**
    * The name of a specific cache parameter group to return details for.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeCacheParameterGroupsMessage {
  @scala.inline
  def apply(
    CacheParameterGroupName: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeCacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeCacheParameterGroupsMessage]
  }
}

