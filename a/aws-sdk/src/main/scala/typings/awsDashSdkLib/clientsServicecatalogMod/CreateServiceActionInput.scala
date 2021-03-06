package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The self-service action definition. Can be one of the following:  Name  The name of the AWS Systems Manager Document. For example, AWS-RestartEC2Instance.  Version  The AWS Systems Manager automation document version. For example, "Version": "1"   AssumeRole  The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example, "AssumeRole": "arn:aws:iam::12345678910:role/ActionRole". To reuse the provisioned product launch role, set to "AssumeRole": "LAUNCH_ROLE".  Parameters  The list of parameters in JSON format. For example: [{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}].  
    */
  var Definition: ServiceActionDefinitionMap
  /**
    * The service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: ServiceActionDefinitionType
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: awsDashSdkLib.clientsServicecatalogMod.IdempotencyToken
  /**
    * The self-service action name.
    */
  var Name: ServiceActionName
}

object CreateServiceActionInput {
  @scala.inline
  def apply(
    Definition: ServiceActionDefinitionMap,
    DefinitionType: ServiceActionDefinitionType,
    IdempotencyToken: IdempotencyToken,
    Name: ServiceActionName,
    AcceptLanguage: AcceptLanguage = null,
    Description: ServiceActionDescription = null
  ): CreateServiceActionInput = {
    val __obj = js.Dynamic.literal(Definition = Definition, DefinitionType = DefinitionType.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken, Name = Name)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateServiceActionInput]
  }
}

