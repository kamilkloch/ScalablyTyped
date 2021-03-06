package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to delete.
    */
  var cluster: String
}

object DeleteClusterRequest {
  @scala.inline
  def apply(cluster: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster)
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

