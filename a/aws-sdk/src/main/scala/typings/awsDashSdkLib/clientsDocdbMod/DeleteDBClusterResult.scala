package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[DBCluster] = js.undefined
}

object DeleteDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): DeleteDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[DeleteDBClusterResult]
  }
}

