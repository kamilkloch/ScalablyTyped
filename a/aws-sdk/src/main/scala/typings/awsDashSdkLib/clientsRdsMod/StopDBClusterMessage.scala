package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDBClusterMessage extends js.Object {
  /**
    * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String
}

object StopDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
  
    __obj.asInstanceOf[StopDBClusterMessage]
  }
}

