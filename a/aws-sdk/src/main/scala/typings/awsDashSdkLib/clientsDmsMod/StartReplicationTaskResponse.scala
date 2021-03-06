package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReplicationTaskResponse extends js.Object {
  /**
    * The replication task started.
    */
  var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
}

object StartReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StartReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[StartReplicationTaskResponse]
  }
}

