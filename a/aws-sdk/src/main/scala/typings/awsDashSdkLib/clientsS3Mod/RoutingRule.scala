package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingRule extends js.Object {
  /**
    * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
    */
  var Condition: js.UndefOr[Condition] = js.undefined
  /**
    * Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can specify a different error code to return.
    */
  var Redirect: awsDashSdkLib.clientsS3Mod.Redirect
}

object RoutingRule {
  @scala.inline
  def apply(Redirect: Redirect, Condition: Condition = null): RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    __obj.asInstanceOf[RoutingRule]
  }
}

