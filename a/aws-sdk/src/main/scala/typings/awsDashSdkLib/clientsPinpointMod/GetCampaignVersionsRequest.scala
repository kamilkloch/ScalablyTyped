package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignVersionsRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the campaign.
    */
  var CampaignId: __string
  /**
    * The number of entries you want on each page in the response.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var Token: js.UndefOr[__string] = js.undefined
}

object GetCampaignVersionsRequest {
  @scala.inline
  def apply(ApplicationId: __string, CampaignId: __string, PageSize: __string = null, Token: __string = null): GetCampaignVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetCampaignVersionsRequest]
  }
}

