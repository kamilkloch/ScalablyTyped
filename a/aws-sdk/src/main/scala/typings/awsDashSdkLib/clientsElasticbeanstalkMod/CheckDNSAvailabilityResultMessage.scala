package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckDNSAvailabilityResultMessage extends js.Object {
  /**
    * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
    */
  var Available: js.UndefOr[CnameAvailability] = js.undefined
  /**
    * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
    */
  var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined
}

object CheckDNSAvailabilityResultMessage {
  @scala.inline
  def apply(Available: js.UndefOr[CnameAvailability] = js.undefined, FullyQualifiedCNAME: DNSCname = null): CheckDNSAvailabilityResultMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Available)) __obj.updateDynamic("Available")(Available)
    if (FullyQualifiedCNAME != null) __obj.updateDynamic("FullyQualifiedCNAME")(FullyQualifiedCNAME)
    __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
  }
}

