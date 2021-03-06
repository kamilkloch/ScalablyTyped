package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the database. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * A DatabaseInput object defining the metadata database to create in the catalog.
    */
  var DatabaseInput: awsDashSdkLib.clientsGlueMod.DatabaseInput
}

object CreateDatabaseRequest {
  @scala.inline
  def apply(DatabaseInput: DatabaseInput, CatalogId: CatalogIdString = null): CreateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[CreateDatabaseRequest]
  }
}

