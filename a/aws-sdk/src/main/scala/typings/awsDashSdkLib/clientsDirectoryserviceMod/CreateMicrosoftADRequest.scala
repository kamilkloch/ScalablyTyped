package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMicrosoftADRequest extends js.Object {
  /**
    * A textual description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.undefined
  /**
    * The fully qualified domain name for the directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
    */
  var Name: DirectoryName
  /**
    * The password for the default administrative user named Admin.
    */
  var Password: awsDashSdkLib.clientsDirectoryserviceMod.Password
  /**
    * The NetBIOS name for your domain. A short identifier for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  /**
    * The tags to be assigned to the AWS Managed Microsoft AD directory.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
    */
  var VpcSettings: DirectoryVpcSettings
}

object CreateMicrosoftADRequest {
  @scala.inline
  def apply(
    Name: DirectoryName,
    Password: Password,
    VpcSettings: DirectoryVpcSettings,
    Description: Description = null,
    Edition: DirectoryEdition = null,
    ShortName: DirectoryShortName = null,
    Tags: Tags = null
  ): CreateMicrosoftADRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Password = Password, VpcSettings = VpcSettings)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateMicrosoftADRequest]
  }
}

