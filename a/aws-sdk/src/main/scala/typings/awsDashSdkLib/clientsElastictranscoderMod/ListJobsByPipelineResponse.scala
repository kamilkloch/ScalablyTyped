package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsByPipelineResponse extends js.Object {
  /**
    * An array of Job objects that are in the specified pipeline.
    */
  var Jobs: js.UndefOr[Jobs] = js.undefined
  /**
    *  A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified pipeline fit on one page or when you've reached the last page of results, the value of NextPageToken is null. 
    */
  var NextPageToken: js.UndefOr[Id] = js.undefined
}

object ListJobsByPipelineResponse {
  @scala.inline
  def apply(Jobs: Jobs = null, NextPageToken: Id = null): ListJobsByPipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[ListJobsByPipelineResponse]
  }
}

