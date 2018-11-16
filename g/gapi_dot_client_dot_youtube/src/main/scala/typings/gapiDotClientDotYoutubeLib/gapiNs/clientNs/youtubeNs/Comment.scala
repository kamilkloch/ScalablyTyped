package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Comment extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the comment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#comment". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the comment. */
  var snippet: js.UndefOr[CommentSnippet] = js.undefined
}
