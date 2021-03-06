package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  /**
    * A time stamp that indicates when the stream was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * How long the stream retains data, in hours.
    */
  var DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined
  /**
    * The name of the device that is associated with the stream.
    */
  var DeviceName: js.UndefOr[DeviceName] = js.undefined
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
    */
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The MediaType of the stream. 
    */
  var MediaType: js.UndefOr[MediaType] = js.undefined
  /**
    * The status of the stream.
    */
  var Status: js.UndefOr[Status] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[StreamName] = js.undefined
  /**
    * The version of the stream.
    */
  var Version: js.UndefOr[Version] = js.undefined
}

object StreamInfo {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined,
    DeviceName: DeviceName = null,
    KmsKeyId: KmsKeyId = null,
    MediaType: MediaType = null,
    Status: Status = null,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null,
    Version: Version = null
  ): StreamInfo = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (!js.isUndefined(DataRetentionInHours)) __obj.updateDynamic("DataRetentionInHours")(DataRetentionInHours)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MediaType != null) __obj.updateDynamic("MediaType")(MediaType)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[StreamInfo]
  }
}

