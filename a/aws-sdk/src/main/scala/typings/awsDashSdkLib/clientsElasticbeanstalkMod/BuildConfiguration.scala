package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildConfiguration extends js.Object {
  /**
    * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label-artifact-name.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label.zip. 
    */
  var ArtifactName: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var CodeBuildServiceRole: NonEmptyString
  /**
    * Information about the compute resources the build project will use.    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds     BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds     BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds   
    */
  var ComputeType: js.UndefOr[ComputeType] = js.undefined
  /**
    * The ID of the Docker image to use for this build project.
    */
  var Image: NonEmptyString
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  var TimeoutInMinutes: js.UndefOr[BoxedInt] = js.undefined
}

object BuildConfiguration {
  @scala.inline
  def apply(
    CodeBuildServiceRole: NonEmptyString,
    Image: NonEmptyString,
    ArtifactName: String = null,
    ComputeType: ComputeType = null,
    TimeoutInMinutes: js.UndefOr[BoxedInt] = js.undefined
  ): BuildConfiguration = {
    val __obj = js.Dynamic.literal(CodeBuildServiceRole = CodeBuildServiceRole, Image = Image)
    if (ArtifactName != null) __obj.updateDynamic("ArtifactName")(ArtifactName)
    if (ComputeType != null) __obj.updateDynamic("ComputeType")(ComputeType.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeoutInMinutes)) __obj.updateDynamic("TimeoutInMinutes")(TimeoutInMinutes)
    __obj.asInstanceOf[BuildConfiguration]
  }
}

