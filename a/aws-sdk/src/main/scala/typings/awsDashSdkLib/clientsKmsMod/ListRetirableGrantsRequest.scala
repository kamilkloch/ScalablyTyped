package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRetirableGrantsRequest extends js.Object {
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a value, it defaults to 50.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  /**
    * The retiring principal for which to list grants. To specify the retiring principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the Amazon Web Services General Reference.
    */
  var RetiringPrincipal: PrincipalIdType
}

object ListRetirableGrantsRequest {
  @scala.inline
  def apply(
    RetiringPrincipal: PrincipalIdType,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: MarkerType = null
  ): ListRetirableGrantsRequest = {
    val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListRetirableGrantsRequest]
  }
}

