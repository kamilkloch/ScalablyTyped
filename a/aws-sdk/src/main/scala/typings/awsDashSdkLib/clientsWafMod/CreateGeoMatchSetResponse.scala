package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGeoMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * The GeoMatchSet returned in the CreateGeoMatchSet response. The GeoMatchSet contains no GeoMatchConstraints.
    */
  var GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined
}

object CreateGeoMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, GeoMatchSet: GeoMatchSet = null): CreateGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (GeoMatchSet != null) __obj.updateDynamic("GeoMatchSet")(GeoMatchSet)
    __obj.asInstanceOf[CreateGeoMatchSetResponse]
  }
}

