package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var acknowledged: js.UndefOr[scala.Boolean] = js.undefined
  var channelType: js.UndefOr[java.lang.String] = js.undefined
  var customer: js.UndefOr[OrderCustomer] = js.undefined
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  var netAmount: js.UndefOr[Price] = js.undefined
  var paymentMethod: js.UndefOr[OrderPaymentMethod] = js.undefined
  var paymentStatus: js.UndefOr[java.lang.String] = js.undefined
  var placedDate: js.UndefOr[java.lang.String] = js.undefined
  var promotions: js.UndefOr[js.Array[OrderLegacyPromotion]] = js.undefined
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.undefined
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.undefined
  var shippingCost: js.UndefOr[Price] = js.undefined
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  var shippingOption: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var taxCollector: js.UndefOr[java.lang.String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    acknowledged: js.UndefOr[scala.Boolean] = js.undefined,
    channelType: java.lang.String = null,
    customer: OrderCustomer = null,
    deliveryDetails: OrderDeliveryDetails = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lineItems: js.Array[OrderLineItem] = null,
    merchantId: java.lang.String = null,
    merchantOrderId: java.lang.String = null,
    netAmount: Price = null,
    paymentMethod: OrderPaymentMethod = null,
    paymentStatus: java.lang.String = null,
    placedDate: java.lang.String = null,
    promotions: js.Array[OrderLegacyPromotion] = null,
    refunds: js.Array[OrderRefund] = null,
    shipments: js.Array[OrderShipment] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: java.lang.String = null,
    status: java.lang.String = null,
    taxCollector: java.lang.String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged)
    if (channelType != null) __obj.updateDynamic("channelType")(channelType)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (deliveryDetails != null) __obj.updateDynamic("deliveryDetails")(deliveryDetails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (netAmount != null) __obj.updateDynamic("netAmount")(netAmount)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus)
    if (placedDate != null) __obj.updateDynamic("placedDate")(placedDate)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (refunds != null) __obj.updateDynamic("refunds")(refunds)
    if (shipments != null) __obj.updateDynamic("shipments")(shipments)
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost)
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    if (status != null) __obj.updateDynamic("status")(status)
    if (taxCollector != null) __obj.updateDynamic("taxCollector")(taxCollector)
    __obj.asInstanceOf[Order]
  }
}

