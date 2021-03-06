package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStageRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The stage name.
    */
  var StageName: __string
}

object GetStageRequest {
  @scala.inline
  def apply(ApiId: __string, StageName: __string): GetStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, StageName = StageName)
  
    __obj.asInstanceOf[GetStageRequest]
  }
}

