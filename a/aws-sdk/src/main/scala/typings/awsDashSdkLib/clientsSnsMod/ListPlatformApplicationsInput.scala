package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPlatformApplicationsInput extends js.Object {
  /**
    * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListPlatformApplicationsInput {
  @scala.inline
  def apply(NextToken: String = null): ListPlatformApplicationsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPlatformApplicationsInput]
  }
}

