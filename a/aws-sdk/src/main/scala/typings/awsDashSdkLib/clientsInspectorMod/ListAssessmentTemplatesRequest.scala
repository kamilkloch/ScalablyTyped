package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentTemplatesRequest extends js.Object {
  /**
    * A list of ARNs that specifies the assessment targets whose assessment templates you want to list.
    */
  var assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentTemplates action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentTemplatesRequest {
  @scala.inline
  def apply(
    assessmentTargetArns: ListParentArnList = null,
    filter: AssessmentTemplateFilter = null,
    maxResults: js.UndefOr[ListMaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (assessmentTargetArns != null) __obj.updateDynamic("assessmentTargetArns")(assessmentTargetArns)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentTemplatesRequest]
  }
}

