package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosCollection extends js.Object {
  // Batches multiple POS-related calls in a single request.
  def custombatch(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchRequest): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchResponse = js.native
  // Batches multiple POS-related calls in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosCustomBatchResponse = js.native
  // Retrieves information about the given store.
  def get(merchantId: java.lang.String, targetMerchantId: java.lang.String, storeCode: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore = js.native
  // Creates a store for the given merchant.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore = js.native
  // Creates a store for the given merchant.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosStore = js.native
  // Submit inventory for the given merchant.
  def inventory(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryRequest,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryResponse = js.native
  // Submit inventory for the given merchant.
  def inventory(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryRequest,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosInventoryResponse = js.native
  // Lists the stores of the target merchant.
  def list(merchantId: java.lang.String, targetMerchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosListResponse = js.native
  // Deletes a store for the given merchant.
  def remove(merchantId: java.lang.String, targetMerchantId: java.lang.String, storeCode: java.lang.String): scala.Unit = js.native
  // Deletes a store for the given merchant.
  def remove(
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String,
    storeCode: java.lang.String,
    optionalArgs: js.Object
  ): scala.Unit = js.native
  // Submit a sale event for the given merchant.
  def sale(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleRequest,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleResponse = js.native
  // Submit a sale event for the given merchant.
  def sale(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleRequest,
    merchantId: java.lang.String,
    targetMerchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.PosSaleResponse = js.native
}

