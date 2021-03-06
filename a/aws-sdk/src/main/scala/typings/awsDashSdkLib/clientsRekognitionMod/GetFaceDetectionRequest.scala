package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFaceDetectionRequest extends js.Object {
  /**
    * Unique identifier for the face detection job. The JobId is returned from StartFaceDetection.
    */
  var JobId: awsDashSdkLib.clientsRekognitionMod.JobId
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the previous response was incomplete (because there are more faces to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object GetFaceDetectionRequest {
  @scala.inline
  def apply(JobId: JobId, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: PaginationToken = null): GetFaceDetectionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetFaceDetectionRequest]
  }
}

