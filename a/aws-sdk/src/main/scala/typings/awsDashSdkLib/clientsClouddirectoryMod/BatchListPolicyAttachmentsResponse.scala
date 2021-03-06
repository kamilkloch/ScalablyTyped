package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListPolicyAttachmentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
}

object BatchListPolicyAttachmentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ObjectIdentifiers: ObjectIdentifierList = null): BatchListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ObjectIdentifiers != null) __obj.updateDynamic("ObjectIdentifiers")(ObjectIdentifiers)
    __obj.asInstanceOf[BatchListPolicyAttachmentsResponse]
  }
}

