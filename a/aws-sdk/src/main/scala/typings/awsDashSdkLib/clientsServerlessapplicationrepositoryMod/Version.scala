package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: __string
  /**
    * The date and time this resource was created.
    */
  var CreationTime: __string
  /**
    * An array of parameter types supported by the application.
    */
  var ParameterDefinitions: __listOfParameterDefinition
  /**
    * A list of values that you must specify before you can deploy certain applications.
    Some applications might include resources that can affect permissions in your AWS
    account, for example, by creating new AWS Identity and Access Management (IAM) users.
    For those applications, you must explicitly acknowledge their capabilities by
    specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
    CAPABILITY_RESOURCE_POLICY, and CAPABILITY_AUTO_EXPAND.The following resources require you to specify CAPABILITY_IAM or
    CAPABILITY_NAMED_IAM:
    AWS::IAM::Group,
    AWS::IAM::InstanceProfile,
    AWS::IAM::Policy, and
    AWS::IAM::Role.
    If the application contains IAM resources, you can specify either CAPABILITY_IAM
    or CAPABILITY_NAMED_IAM. If the application contains IAM resources
    with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
    AWS::Lambda::Permission,
    AWS::IAM:Policy,
    AWS::ApplicationAutoScaling::ScalingPolicy,
    AWS::S3::BucketPolicy,
    AWS::SQS::QueuePolicy, and
    AWS::SNS::TopicPolicy.Applications that contain one or more nested applications require you to specify
    CAPABILITY_AUTO_EXPAND.If your application template contains any of the above resources, we recommend that you review
    all permissions associated with the application before deploying. If you don't specify
    this parameter for an application that requires capabilities, the call will fail.
    */
  var RequiredCapabilities: __listOfCapability
  /**
    * Whether all of the AWS resources contained in this application are supported in the region
    in which it is being retrieved.
    */
  var ResourcesSupported: __boolean
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: __string
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[__string] = js.undefined
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: __string
}

object Version {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CreationTime: __string,
    ParameterDefinitions: __listOfParameterDefinition,
    RequiredCapabilities: __listOfCapability,
    ResourcesSupported: __boolean,
    SemanticVersion: __string,
    TemplateUrl: __string,
    SourceCodeArchiveUrl: __string = null,
    SourceCodeUrl: __string = null
  ): Version = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CreationTime = CreationTime, ParameterDefinitions = ParameterDefinitions, RequiredCapabilities = RequiredCapabilities, ResourcesSupported = ResourcesSupported, SemanticVersion = SemanticVersion, TemplateUrl = TemplateUrl)
    if (SourceCodeArchiveUrl != null) __obj.updateDynamic("SourceCodeArchiveUrl")(SourceCodeArchiveUrl)
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl)
    __obj.asInstanceOf[Version]
  }
}

