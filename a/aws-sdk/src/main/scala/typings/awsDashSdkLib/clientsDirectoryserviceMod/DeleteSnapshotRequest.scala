package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory snapshot to be deleted.
    */
  var SnapshotId: awsDashSdkLib.clientsDirectoryserviceMod.SnapshotId
}

object DeleteSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId)
  
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
}

