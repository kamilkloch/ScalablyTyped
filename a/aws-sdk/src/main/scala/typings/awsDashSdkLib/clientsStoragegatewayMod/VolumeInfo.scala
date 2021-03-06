package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeInfo extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var GatewayId: js.UndefOr[GatewayId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB   Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume. 
    */
  var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined
  /**
    * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeId: js.UndefOr[VolumeId] = js.undefined
  /**
    * The size of the volume in bytes. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[VolumeType] = js.undefined
}

object VolumeInfo {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    VolumeARN: VolumeARN = null,
    VolumeAttachmentStatus: VolumeAttachmentStatus = null,
    VolumeId: VolumeId = null,
    VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
    VolumeType: VolumeType = null
  ): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    if (VolumeAttachmentStatus != null) __obj.updateDynamic("VolumeAttachmentStatus")(VolumeAttachmentStatus)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (!js.isUndefined(VolumeSizeInBytes)) __obj.updateDynamic("VolumeSizeInBytes")(VolumeSizeInBytes)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    __obj.asInstanceOf[VolumeInfo]
  }
}

