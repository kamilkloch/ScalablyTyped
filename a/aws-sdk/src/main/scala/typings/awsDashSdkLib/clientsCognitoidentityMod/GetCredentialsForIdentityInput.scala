package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsForIdentityInput
  extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.
    */
  var CustomRoleArn: js.UndefOr[ARNString] = js.undefined
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.IdentityId
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow the syntax "provider_name": "provider_user_identifier". Logins should not be specified when trying to get credentials for an unauthenticated identity. The Logins parameter is required when using identities associated with external identity providers such as FaceBook. For examples of Logins maps, see the code examples in the External Identity Providers section of the Amazon Cognito Developer Guide.
    */
  var Logins: js.UndefOr[LoginsMap] = js.undefined
}

object GetCredentialsForIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId, CustomRoleArn: ARNString = null, Logins: LoginsMap = null): GetCredentialsForIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId)
    if (CustomRoleArn != null) __obj.updateDynamic("CustomRoleArn")(CustomRoleArn)
    if (Logins != null) __obj.updateDynamic("Logins")(Logins)
    __obj.asInstanceOf[GetCredentialsForIdentityInput]
  }
}

