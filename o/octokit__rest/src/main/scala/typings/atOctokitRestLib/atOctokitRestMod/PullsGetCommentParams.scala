package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentParams extends js.Object {
  var comment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object PullsGetCommentParams {
  @scala.inline
  def apply(comment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): PullsGetCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsGetCommentParams]
  }
}

