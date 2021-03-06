package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFolderContentsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
}

object DeleteFolderContentsRequest {
  @scala.inline
  def apply(FolderId: ResourceIdType, AuthenticationToken: AuthenticationHeaderType = null): DeleteFolderContentsRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[DeleteFolderContentsRequest]
  }
}

