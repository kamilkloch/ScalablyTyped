package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateCommentResponseLinks extends js.Object {
  var html: PullsUpdateCommentResponseLinksHtml
  var pull_request: PullsUpdateCommentResponseLinksPullRequest
  var self: PullsUpdateCommentResponseLinksSelf
}

object PullsUpdateCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsUpdateCommentResponseLinksHtml,
    pull_request: PullsUpdateCommentResponseLinksPullRequest,
    self: PullsUpdateCommentResponseLinksSelf
  ): PullsUpdateCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsUpdateCommentResponseLinks]
  }
}

