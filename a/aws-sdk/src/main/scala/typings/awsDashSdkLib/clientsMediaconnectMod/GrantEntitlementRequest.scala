package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantEntitlementRequest extends js.Object {
  /**
    * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[Encryption] = js.undefined
  /**
    * The name of the entitlement. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flows using your content as the source.
    */
  var Subscribers: __listOf__string
}

object GrantEntitlementRequest {
  @scala.inline
  def apply(
    Subscribers: __listOf__string,
    Description: __string = null,
    Encryption: Encryption = null,
    Name: __string = null
  ): GrantEntitlementRequest = {
    val __obj = js.Dynamic.literal(Subscribers = Subscribers)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[GrantEntitlementRequest]
  }
}

