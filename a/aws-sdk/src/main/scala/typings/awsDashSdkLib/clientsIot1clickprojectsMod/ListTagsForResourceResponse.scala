package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The tags (metadata key/value pairs) which you have assigned to the resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: TagMap = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

