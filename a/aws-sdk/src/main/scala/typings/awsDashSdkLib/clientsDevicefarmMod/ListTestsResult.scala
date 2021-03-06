package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTestsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the tests.
    */
  var tests: js.UndefOr[Tests] = js.undefined
}

object ListTestsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, tests: Tests = null): ListTestsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tests != null) __obj.updateDynamic("tests")(tests)
    __obj.asInstanceOf[ListTestsResult]
  }
}

