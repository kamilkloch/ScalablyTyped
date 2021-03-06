package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePermissionRequest extends js.Object {
  /**
    * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
    */
  var StatementId: awsDashSdkLib.clientsCloudwatcheventsMod.StatementId
}

object RemovePermissionRequest {
  @scala.inline
  def apply(StatementId: StatementId): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(StatementId = StatementId)
  
    __obj.asInstanceOf[RemovePermissionRequest]
  }
}

