package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProvisioningParametersOutput extends js.Object {
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters] = js.undefined
  /**
    * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences] = js.undefined
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[UsageInstructions] = js.undefined
}

object DescribeProvisioningParametersOutput {
  @scala.inline
  def apply(
    ConstraintSummaries: ConstraintSummaries = null,
    ProvisioningArtifactParameters: ProvisioningArtifactParameters = null,
    ProvisioningArtifactPreferences: ProvisioningArtifactPreferences = null,
    TagOptions: TagOptionSummaries = null,
    UsageInstructions: UsageInstructions = null
  ): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintSummaries != null) __obj.updateDynamic("ConstraintSummaries")(ConstraintSummaries)
    if (ProvisioningArtifactParameters != null) __obj.updateDynamic("ProvisioningArtifactParameters")(ProvisioningArtifactParameters)
    if (ProvisioningArtifactPreferences != null) __obj.updateDynamic("ProvisioningArtifactPreferences")(ProvisioningArtifactPreferences)
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions)
    if (UsageInstructions != null) __obj.updateDynamic("UsageInstructions")(UsageInstructions)
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
}

