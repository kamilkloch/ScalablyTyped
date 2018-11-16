package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info for a SKU of a product in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreSku")
@js.native
abstract class StoreSku () extends js.Object {
  /** Gets the availabilities for the current product SKU. Each product SKU can have one or more availabilities that have different prices. */
  var availabilities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreAvailability] = js.native
  /** Gets the list of Store IDs for the apps or add-ons that are bundled with this product SKU. */
  var bundledSkus: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets additional data for the current product SKU, if the user has an entitlement to use the SKU. */
  var collectionData: StoreCollectionData = js.native
  /** Gets the custom developer data string (also called a tag) that contains custom information about the add-on that this product SKU represents. This string corresponds to the value of the Custom developer data field in the properties page for the add-on in the Windows Dev Center dashboard. */
  var customDeveloperData: java.lang.String = js.native
  /** Gets the product SKU description from the Windows Store listing. */
  var description: java.lang.String = js.native
  /** Gets complete data for the current product SKU from the Store in JSON format. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets the images from the Windows Store listing for the product SKU. */
  var images: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreImage] = js.native
  /** Gets a value that indicates whether the current user has an entitlement to use the current product SKU. */
  var isInUserCollection: scala.Boolean = js.native
  /** Gets a value that indicates whether the current product SKU is a subscription with recurring billing. For more information about the subscription, see the SubscriptionInfo property. */
  var isSubscription: scala.Boolean = js.native
  /** Gets a value that indicates whether the current product SKU is a trial SKU. */
  var isTrial: scala.Boolean = js.native
  /** Gets the language for the data in the Windows Store listing for the product SKU. */
  var language: java.lang.String = js.native
  /** Gets the price of the default availability for this product SKU. */
  var price: StorePrice = js.native
  /** Gets the Store ID of this product SKU. */
  var storeId: java.lang.String = js.native
  /** Gets subscription information for this product SKU, if this product SKU is a subscription with recurring billing. To determine whether this product SKU is a subscription, use the IsSubscription property. */
  var subscriptionInfo: StoreSubscriptionInfo = js.native
  /** Gets the product SKU title from the Windows Store listing. */
  var title: java.lang.String = js.native
  /** Gets the videos from the Windows Store listing for the product SKU. */
  var videos: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StoreVideo] = js.native
  /**
                   * Indicates whether this product SKU is installed on the current device.
                   * @return An asynchronous operation that, on successful completion, returns true if this product SKU is installed on the current device; otherwise, false.
                   */
  def getIsInstalledAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Requests the purchase of the product SKU and displays the UI that is used to complete the transaction via the Windows Store.
                   * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
                   */
  def requestPurchaseAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
  /**
                   * Requests the purchase of the product SKU and displays the UI that is used to complete the transaction via the Windows Store. This method provides the option to specify additional details for a specific offer within a large catalog of products that are represented by a single listing in the Windows Store, including the product name to display to the user during the purchase.
                   * @param storePurchaseProperties An object that specifies additional info for the purchase request, including the product name to display to the user during the purchase.
                   * @return An asynchronous operation that, on successful completion, returns a StorePurchaseResult object that provides status and error info about the purchase.
                   */
  def requestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorePurchaseResult] = js.native
}
