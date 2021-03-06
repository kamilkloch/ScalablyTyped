package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupsRequest extends js.Object {
  /**
    * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not found, BackupNotFound will be thrown.
    */
  var BackupIds: js.UndefOr[BackupIds] = js.undefined
  /**
    * (Optional) Filters structure. Supported names are file-system-id and backup-type.
    */
  var Filters: js.UndefOr[Filters] = js.undefined
  /**
    * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeBackups operation (String). If a token present, the action continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(
    BackupIds: BackupIds = null,
    Filters: Filters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    if (BackupIds != null) __obj.updateDynamic("BackupIds")(BackupIds)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

