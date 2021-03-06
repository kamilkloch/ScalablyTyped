package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkteamsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var Workteams: awsDashSdkLib.clientsSagemakerMod.Workteams
}

object ListWorkteamsResponse {
  @scala.inline
  def apply(Workteams: Workteams, NextToken: NextToken = null): ListWorkteamsResponse = {
    val __obj = js.Dynamic.literal(Workteams = Workteams)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListWorkteamsResponse]
  }
}

