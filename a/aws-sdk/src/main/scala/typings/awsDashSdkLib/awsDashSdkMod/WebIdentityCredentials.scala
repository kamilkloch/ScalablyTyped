package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "WebIdentityCredentials")
@js.native
class WebIdentityCredentials ()
  extends awsDashSdkLib.libCoreMod.WebIdentityCredentials {
  /**
       * Creates a new credentials object with optional configuraion.
       * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
       * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
       */
  def this(options: awsDashSdkLib.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions) = this()
  /**
       * Creates a new credentials object with optional configuraion.
       * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
       * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
       */
  def this(options: awsDashSdkLib.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions, clientConfig: awsDashSdkLib.libConfigMod.ConfigurationOptions) = this()
}
