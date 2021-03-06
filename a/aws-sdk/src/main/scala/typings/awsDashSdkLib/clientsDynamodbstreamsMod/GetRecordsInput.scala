package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecordsInput extends js.Object {
  /**
    * The maximum number of records to return from the shard. The upper limit is 1000.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  /**
    * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to access the stream records in this shard.
    */
  var ShardIterator: awsDashSdkLib.clientsDynamodbstreamsMod.ShardIterator
}

object GetRecordsInput {
  @scala.inline
  def apply(ShardIterator: ShardIterator, Limit: js.UndefOr[PositiveIntegerObject] = js.undefined): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[GetRecordsInput]
  }
}

