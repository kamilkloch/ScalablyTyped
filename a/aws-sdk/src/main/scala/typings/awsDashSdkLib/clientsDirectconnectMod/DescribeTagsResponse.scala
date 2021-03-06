package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsResponse extends js.Object {
  /**
    * Information about the tags.
    */
  var resourceTags: js.UndefOr[ResourceTagList] = js.undefined
}

object DescribeTagsResponse {
  @scala.inline
  def apply(resourceTags: ResourceTagList = null): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (resourceTags != null) __obj.updateDynamic("resourceTags")(resourceTags)
    __obj.asInstanceOf[DescribeTagsResponse]
  }
}

