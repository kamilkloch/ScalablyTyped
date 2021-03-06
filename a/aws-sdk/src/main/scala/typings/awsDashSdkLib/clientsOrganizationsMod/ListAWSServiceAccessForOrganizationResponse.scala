package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
  /**
    * A list of the service principals for the services that are enabled to integrate with your organization. Each principal is a structure that includes the name and the date that it was enabled for integration with AWS Organizations.
    */
  var EnabledServicePrincipals: js.UndefOr[EnabledServicePrincipals] = js.undefined
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAWSServiceAccessForOrganizationResponse {
  @scala.inline
  def apply(EnabledServicePrincipals: EnabledServicePrincipals = null, NextToken: NextToken = null): ListAWSServiceAccessForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (EnabledServicePrincipals != null) __obj.updateDynamic("EnabledServicePrincipals")(EnabledServicePrincipals)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
  }
}

