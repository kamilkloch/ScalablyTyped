package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerOptions extends js.Object {
  var allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined
  var groupId: java.lang.String
  var heartbeatInterval: js.UndefOr[scala.Double] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var maxBytesPerPartition: js.UndefOr[scala.Double] = js.undefined
  var maxWaitTimeInMs: js.UndefOr[scala.Double] = js.undefined
  var metadataMaxAge: js.UndefOr[scala.Double] = js.undefined
  var minBytes: js.UndefOr[scala.Double] = js.undefined
  var partitionAssigners: js.UndefOr[js.Array[PartitionAssigner]] = js.undefined
  var readUncommitted: js.UndefOr[scala.Boolean] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var sessionTimeout: js.UndefOr[scala.Double] = js.undefined
}

object ConsumerOptions {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined,
    heartbeatInterval: scala.Int | scala.Double = null,
    maxBytes: scala.Int | scala.Double = null,
    maxBytesPerPartition: scala.Int | scala.Double = null,
    maxWaitTimeInMs: scala.Int | scala.Double = null,
    metadataMaxAge: scala.Int | scala.Double = null,
    minBytes: scala.Int | scala.Double = null,
    partitionAssigners: js.Array[PartitionAssigner] = null,
    readUncommitted: js.UndefOr[scala.Boolean] = js.undefined,
    retry: RetryOptions = null,
    sessionTimeout: scala.Int | scala.Double = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId)
    if (!js.isUndefined(allowAutoTopicCreation)) __obj.updateDynamic("allowAutoTopicCreation")(allowAutoTopicCreation)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxBytesPerPartition != null) __obj.updateDynamic("maxBytesPerPartition")(maxBytesPerPartition.asInstanceOf[js.Any])
    if (maxWaitTimeInMs != null) __obj.updateDynamic("maxWaitTimeInMs")(maxWaitTimeInMs.asInstanceOf[js.Any])
    if (metadataMaxAge != null) __obj.updateDynamic("metadataMaxAge")(metadataMaxAge.asInstanceOf[js.Any])
    if (minBytes != null) __obj.updateDynamic("minBytes")(minBytes.asInstanceOf[js.Any])
    if (partitionAssigners != null) __obj.updateDynamic("partitionAssigners")(partitionAssigners)
    if (!js.isUndefined(readUncommitted)) __obj.updateDynamic("readUncommitted")(readUncommitted)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

