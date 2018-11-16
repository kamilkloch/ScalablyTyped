package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Subscription extends js.Object {
  /** Read-only field that returns the current billing method for a subscription. */
  var billingMethod: js.UndefOr[java.lang.String] = js.undefined
  /** The creationTime property is the date when subscription was created. It is in milliseconds using the Epoch format. See an example Epoch converter. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** Primary domain name of the customer */
  var customerDomain: js.UndefOr[java.lang.String] = js.undefined
  /**
               * This property will always be returned in a response as the unique identifier generated by Google. In a request, this property can be either the primary
               * domain or the unique identifier generated by Google.
               */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in insert requests in order to receive
               * discounted rate. This property is optional, regular pricing applies if left empty.
               */
  var dealCode: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the resource as a Subscription. Value: reseller#subscription */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The plan property is required. In this version of the API, the G Suite plans are the flexible plan, annual commitment plan, and the 30-day free trial
               * plan. For more information about the API"s payment plans, see the API concepts.
               */
  var plan: js.UndefOr[gapiDotClientDotResellerLib.Anon_CommitmentInterval] = js.undefined
  /**
               * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value
               * is given it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
               */
  var purchaseOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. */
  var renewalSettings: js.UndefOr[RenewalSettings] = js.undefined
  /**
               * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by the API service. This is used if your client application
               * requires the customer to complete a task using the Subscriptions page in the Admin console.
               */
  var resourceUiUrl: js.UndefOr[java.lang.String] = js.undefined
  /** This is a required property. The number and limit of user seat licenses in the plan. */
  var seats: js.UndefOr[Seats] = js.undefined
  /**
               * A required property. The skuId is a unique system identifier for a product's SKU assigned to a customer in the subscription. For products and SKUs
               * available in this version of the API, see  Product and SKU IDs.
               */
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Read-only external display name for a product's SKU assigned to a customer in the subscription. SKU names are subject to change at Google's discretion.
               * For products and SKUs available in this version of the API, see  Product and SKU IDs.
               */
  var skuName: js.UndefOr[java.lang.String] = js.undefined
  /** This is an optional property. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The subscriptionId is the subscription identifier and is unique for each customer. This is a required property. Since a subscriptionId changes when a
               * subscription is updated, we recommend not using this ID as a key for persistent data. Use the subscriptionId as described in retrieve all reseller
               * subscriptions.
               */
  var subscriptionId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Read-only field containing an enumerable of all the current suspension reasons for a subscription. It is possible for a subscription to have many
               * concurrent, overlapping suspension reasons. A subscription's STATUS is SUSPENDED until all pending suspensions are removed.
               *
               * Possible options include:
               * - PENDING_TOS_ACCEPTANCE - The customer has not logged in and accepted the G Suite Resold Terms of Services.
               * - RENEWAL_WITH_TYPE_CANCEL - The customer's commitment ended and their service was cancelled at the end of their term.
               * - RESELLER_INITIATED - A manual suspension invoked by a Reseller.
               * - TRIAL_ENDED - The customer's trial expired without a plan selected.
               * - OTHER - The customer is suspended for an internal Google reason (e.g. abuse or otherwise).
               */
  var suspensionReasons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Read-only transfer related information for the subscription. For more information, see retrieve transferable subscriptions for a customer. */
  var transferInfo: js.UndefOr[gapiDotClientDotResellerLib.Anon_MinimumTransferableSeats] = js.undefined
  /** The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For more information, see the API concepts. */
  var trialSettings: js.UndefOr[gapiDotClientDotResellerLib.Anon_IsInTrial] = js.undefined
}
