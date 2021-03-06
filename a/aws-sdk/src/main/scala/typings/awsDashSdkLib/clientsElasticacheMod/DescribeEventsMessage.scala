package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventsMessage extends js.Object {
  /**
    * The number of minutes worth of events to retrieve.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The end of the time interval for which to retrieve events, specified in ISO 8601 format.  Example: 2017-03-30T07:03:49.555Z
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The identifier of the event source for which events are returned. If not specified, all sources are included in the response.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
  /**
    * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.  Example: 2017-03-30T07:03:49.555Z
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
}

object DescribeEventsMessage {
  @scala.inline
  def apply(
    Duration: js.UndefOr[IntegerOptional] = js.undefined,
    EndTime: TStamp = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    SourceIdentifier: String = null,
    SourceType: SourceType = null,
    StartTime: TStamp = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

