package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupDetails extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of Parameter instances. Each instance lists the parameters of one cluster parameter group. 
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object ClusterParameterGroupDetails {
  @scala.inline
  def apply(Marker: String = null, Parameters: ParametersList = null): ClusterParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[ClusterParameterGroupDetails]
  }
}

