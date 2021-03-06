package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishVersionRequest extends js.Object {
  /**
    * Only publish a version if the hash value matches the value that's specified. Use this option to avoid publishing a version if the function code has changed since you last updated it. You can get the hash for the version that you uploaded from the output of UpdateFunctionCode.
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  /**
    * A description for the version to override the description in the function configuration.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid publishing a version if the function configuration has changed since you last updated it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}

object PublishVersionRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    CodeSha256: String = null,
    Description: Description = null,
    RevisionId: String = null
  ): PublishVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName)
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[PublishVersionRequest]
  }
}

