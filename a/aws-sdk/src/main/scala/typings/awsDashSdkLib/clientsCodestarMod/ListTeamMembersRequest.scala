package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeamMembersRequest extends js.Object {
  /**
    * The maximum number of team members you want returned in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the project for which you want to list team members.
    */
  var projectId: ProjectId
}

object ListTeamMembersRequest {
  @scala.inline
  def apply(
    projectId: ProjectId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListTeamMembersRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTeamMembersRequest]
  }
}

