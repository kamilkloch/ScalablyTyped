package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocationsResponse extends js.Object {
  /**
    * An array that contains a list of locations.
    */
  var Locations: js.UndefOr[LocationList] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin returning the next list of locations.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListLocationsResponse {
  @scala.inline
  def apply(Locations: LocationList = null, NextToken: NextToken = null): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Locations != null) __obj.updateDynamic("Locations")(Locations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLocationsResponse]
  }
}

