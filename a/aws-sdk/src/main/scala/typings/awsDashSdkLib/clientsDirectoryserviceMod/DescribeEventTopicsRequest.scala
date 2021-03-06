package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventTopicsRequest extends js.Object {
  /**
    * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[TopicNames] = js.undefined
}

object DescribeEventTopicsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null, TopicNames: TopicNames = null): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (TopicNames != null) __obj.updateDynamic("TopicNames")(TopicNames)
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
}

