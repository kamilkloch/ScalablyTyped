package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDeletePendingReviewResponseLinks extends js.Object {
  var html: PullsDeletePendingReviewResponseLinksHtml
  var pull_request: PullsDeletePendingReviewResponseLinksPullRequest
}

object PullsDeletePendingReviewResponseLinks {
  @scala.inline
  def apply(
    html: PullsDeletePendingReviewResponseLinksHtml,
    pull_request: PullsDeletePendingReviewResponseLinksPullRequest
  ): PullsDeletePendingReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request)
  
    __obj.asInstanceOf[PullsDeletePendingReviewResponseLinks]
  }
}

