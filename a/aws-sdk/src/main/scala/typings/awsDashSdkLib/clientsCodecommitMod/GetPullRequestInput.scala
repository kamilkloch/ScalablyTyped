package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPullRequestInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
}

object GetPullRequestInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId): GetPullRequestInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId)
  
    __obj.asInstanceOf[GetPullRequestInput]
  }
}

