package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChangeRequest extends js.Object {
  /**
    * The ID of the change batch request. The value that you specify here is the value that ChangeResourceRecordSets returned in the Id element when you submitted the request.
    */
  var Id: ResourceId
}

object GetChangeRequest {
  @scala.inline
  def apply(Id: ResourceId): GetChangeRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetChangeRequest]
  }
}

