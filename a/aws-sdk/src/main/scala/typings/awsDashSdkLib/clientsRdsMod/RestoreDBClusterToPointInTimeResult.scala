package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBClusterToPointInTimeResult extends js.Object {
  var DBCluster: js.UndefOr[DBCluster] = js.undefined
}

object RestoreDBClusterToPointInTimeResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeResult]
  }
}

