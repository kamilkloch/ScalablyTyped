package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNamedQueryOutput extends js.Object {
  /**
    * The unique ID of the query.
    */
  var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
}

object CreateNamedQueryOutput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId = null): CreateNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId)
    __obj.asInstanceOf[CreateNamedQueryOutput]
  }
}

