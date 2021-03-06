package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: awsDashSdkLib.clientsStoragegatewayMod.TargetARN
}

object DeleteChapCredentialsInput {
  @scala.inline
  def apply(InitiatorName: IqnName, TargetARN: TargetARN): DeleteChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName, TargetARN = TargetARN)
  
    __obj.asInstanceOf[DeleteChapCredentialsInput]
  }
}

