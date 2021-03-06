package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProtectedResourcesOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  var Results: js.UndefOr[ProtectedResourcesList] = js.undefined
}

object ListProtectedResourcesOutput {
  @scala.inline
  def apply(NextToken: java.lang.String = null, Results: ProtectedResourcesList = null): ListProtectedResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[ListProtectedResourcesOutput]
  }
}

