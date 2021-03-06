package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectPolicies extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
}

object BatchListObjectPolicies {
  @scala.inline
  def apply(
    ObjectReference: ObjectReference,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): BatchListObjectPolicies = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectPolicies]
  }
}

