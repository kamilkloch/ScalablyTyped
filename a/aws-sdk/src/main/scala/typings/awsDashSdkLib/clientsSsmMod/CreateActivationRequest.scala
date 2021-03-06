package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateActivationRequest extends js.Object {
  /**
    * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS command line tools to list EC2 resources.  Do not enter personally identifiable information in this field. 
    */
  var DefaultInstanceName: js.UndefOr[DefaultInstanceName] = js.undefined
  /**
    * A user-defined description of the resource that you want to register with Amazon EC2.   Do not enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ActivationDescription] = js.undefined
  /**
    * The date by which this activation request should expire. The default value is 24 hours.
    */
  var ExpirationDate: js.UndefOr[ExpirationDate] = js.undefined
  /**
    * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance. 
    */
  var IamRole: awsDashSdkLib.clientsSsmMod.IamRole
  /**
    * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
    */
  var RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises servers or VMs.  You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how to add tags to your managed instances, see AddTagsToResource. For information about how to remove tags from your managed instances, see RemoveTagsFromResource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateActivationRequest {
  @scala.inline
  def apply(
    IamRole: IamRole,
    DefaultInstanceName: DefaultInstanceName = null,
    Description: ActivationDescription = null,
    ExpirationDate: ExpirationDate = null,
    RegistrationLimit: js.UndefOr[RegistrationLimit] = js.undefined,
    Tags: TagList = null
  ): CreateActivationRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole)
    if (DefaultInstanceName != null) __obj.updateDynamic("DefaultInstanceName")(DefaultInstanceName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (!js.isUndefined(RegistrationLimit)) __obj.updateDynamic("RegistrationLimit")(RegistrationLimit)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateActivationRequest]
  }
}

