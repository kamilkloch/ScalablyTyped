package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns information about the in-app product specified. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPrices): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields): gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[InappproductsBatchResponse],
    delete: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyOauthtokenPackageName => gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct],
    insert: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPrices => gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct],
    list: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKeyMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[InappproductsListResponse],
    patch: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields => gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct],
    update: gapiDotClientDotAndroidpublisherLib.Anon_AltAutoConvertMissingPricesFields => gapiDotClientLib.gapiNs.clientNs.Request[InAppProduct]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction1(batch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[InappproductsResource]
  }
}

