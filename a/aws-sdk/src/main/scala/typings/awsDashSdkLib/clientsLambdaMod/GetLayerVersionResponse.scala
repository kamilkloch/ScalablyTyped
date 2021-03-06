package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionResponse extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.undefined
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[LayerArn] = js.undefined
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.undefined
}

object GetLayerVersionResponse {
  @scala.inline
  def apply(
    CompatibleRuntimes: CompatibleRuntimes = null,
    Content: LayerVersionContentOutput = null,
    CreatedDate: Timestamp = null,
    Description: Description = null,
    LayerArn: LayerArn = null,
    LayerVersionArn: LayerVersionArn = null,
    LicenseInfo: LicenseInfo = null,
    Version: js.UndefOr[LayerVersionNumber] = js.undefined
  ): GetLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LayerArn != null) __obj.updateDynamic("LayerArn")(LayerArn)
    if (LayerVersionArn != null) __obj.updateDynamic("LayerVersionArn")(LayerVersionArn)
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetLayerVersionResponse]
  }
}

