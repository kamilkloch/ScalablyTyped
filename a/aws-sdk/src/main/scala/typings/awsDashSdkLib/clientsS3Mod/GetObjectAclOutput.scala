package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectAclOutput extends js.Object {
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[Grants] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[Owner] = js.undefined
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
}

object GetObjectAclOutput {
  @scala.inline
  def apply(Grants: Grants = null, Owner: Owner = null, RequestCharged: RequestCharged = null): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAclOutput]
  }
}

