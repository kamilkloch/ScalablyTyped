package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAliasRequest extends js.Object {
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.undefined
  /**
    * The name of the alias.
    */
  var Name: Alias
  /**
    * Only update the alias if the revision ID matches the ID that's specified. Use this option to avoid modifying an alias that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
}

object UpdateAliasRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    Name: Alias,
    Description: Description = null,
    FunctionVersion: Version = null,
    RevisionId: String = null,
    RoutingConfig: AliasRoutingConfiguration = null
  ): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig)
    __obj.asInstanceOf[UpdateAliasRequest]
  }
}

