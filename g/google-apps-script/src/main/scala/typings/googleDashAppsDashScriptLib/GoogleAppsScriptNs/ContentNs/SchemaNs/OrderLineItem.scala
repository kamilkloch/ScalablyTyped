package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItem extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  var quantityCanceled: js.UndefOr[scala.Double] = js.undefined
  var quantityDelivered: js.UndefOr[scala.Double] = js.undefined
  var quantityOrdered: js.UndefOr[scala.Double] = js.undefined
  var quantityPending: js.UndefOr[scala.Double] = js.undefined
  var quantityReturned: js.UndefOr[scala.Double] = js.undefined
  var quantityShipped: js.UndefOr[scala.Double] = js.undefined
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.undefined
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  var tax: js.UndefOr[Price] = js.undefined
}

object OrderLineItem {
  @scala.inline
  def apply(
    annotations: js.Array[OrderMerchantProvidedAnnotation] = null,
    cancellations: js.Array[OrderCancellation] = null,
    id: java.lang.String = null,
    price: Price = null,
    product: OrderLineItemProduct = null,
    quantityCanceled: scala.Int | scala.Double = null,
    quantityDelivered: scala.Int | scala.Double = null,
    quantityOrdered: scala.Int | scala.Double = null,
    quantityPending: scala.Int | scala.Double = null,
    quantityReturned: scala.Int | scala.Double = null,
    quantityShipped: scala.Int | scala.Double = null,
    returnInfo: OrderLineItemReturnInfo = null,
    returns: js.Array[OrderReturn] = null,
    shippingDetails: OrderLineItemShippingDetails = null,
    tax: Price = null
  ): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (cancellations != null) __obj.updateDynamic("cancellations")(cancellations)
    if (id != null) __obj.updateDynamic("id")(id)
    if (price != null) __obj.updateDynamic("price")(price)
    if (product != null) __obj.updateDynamic("product")(product)
    if (quantityCanceled != null) __obj.updateDynamic("quantityCanceled")(quantityCanceled.asInstanceOf[js.Any])
    if (quantityDelivered != null) __obj.updateDynamic("quantityDelivered")(quantityDelivered.asInstanceOf[js.Any])
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (quantityPending != null) __obj.updateDynamic("quantityPending")(quantityPending.asInstanceOf[js.Any])
    if (quantityReturned != null) __obj.updateDynamic("quantityReturned")(quantityReturned.asInstanceOf[js.Any])
    if (quantityShipped != null) __obj.updateDynamic("quantityShipped")(quantityShipped.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo)
    if (returns != null) __obj.updateDynamic("returns")(returns)
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    __obj.asInstanceOf[OrderLineItem]
  }
}

