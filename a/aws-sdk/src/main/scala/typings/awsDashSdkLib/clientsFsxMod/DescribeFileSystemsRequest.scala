package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFileSystemsRequest extends js.Object {
  /**
    * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
    */
  var FileSystemIds: js.UndefOr[FileSystemIds] = js.undefined
  /**
    * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If a token present, the action continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeFileSystemsRequest {
  @scala.inline
  def apply(
    FileSystemIds: FileSystemIds = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    if (FileSystemIds != null) __obj.updateDynamic("FileSystemIds")(FileSystemIds)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
}

