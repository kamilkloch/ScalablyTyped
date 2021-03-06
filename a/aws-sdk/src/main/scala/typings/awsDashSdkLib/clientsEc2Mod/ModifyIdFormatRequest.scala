package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyIdFormatRequest extends js.Object {
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. Alternatively, use the all-current option to include all resource types that are currently within their opt-in period for longer IDs.
    */
  var Resource: String
  /**
    * Indicate whether the resource should use longer IDs (17-character IDs).
    */
  var UseLongIds: Boolean
}

object ModifyIdFormatRequest {
  @scala.inline
  def apply(Resource: String, UseLongIds: Boolean): ModifyIdFormatRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource, UseLongIds = UseLongIds)
  
    __obj.asInstanceOf[ModifyIdFormatRequest]
  }
}

