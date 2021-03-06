package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectParentsRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * When set to True, returns all ListObjectParentsResponse$ParentLinks. There could be multiple links between a parent-child pair.
    */
  var IncludeAllLinksToEachParent: js.UndefOr[Bool] = js.undefined
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The reference that identifies the object for which parent objects are being listed.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
}

object ListObjectParentsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    IncludeAllLinksToEachParent: js.UndefOr[Bool] = js.undefined,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListObjectParentsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeAllLinksToEachParent)) __obj.updateDynamic("IncludeAllLinksToEachParent")(IncludeAllLinksToEachParent)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectParentsRequest]
  }
}

