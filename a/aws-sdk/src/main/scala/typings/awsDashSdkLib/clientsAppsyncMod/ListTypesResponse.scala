package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypesResponse extends js.Object {
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The Type objects.
    */
  var types: js.UndefOr[TypeList] = js.undefined
}

object ListTypesResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, types: TypeList = null): ListTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[ListTypesResponse]
  }
}

