package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
  /**
    * The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The security configuration to set.
    */
  var DataCatalogEncryptionSettings: awsDashSdkLib.clientsGlueMod.DataCatalogEncryptionSettings
}

object PutDataCatalogEncryptionSettingsRequest {
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings, CatalogId: CatalogIdString = null): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
}

