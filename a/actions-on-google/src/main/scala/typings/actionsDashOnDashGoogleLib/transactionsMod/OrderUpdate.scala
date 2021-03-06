package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/transactions", "OrderUpdate")
@js.native
class OrderUpdate protected () extends js.Object {
  /**
    * Constructor for OrderUpdate.
    *
    * @param orderId Unique identifier of the order.
    * @param isGoogleOrderId True if the order ID is provided by
    *     Google. False if the order ID is app provided.
    */
  def this(orderId: java.lang.String, isGoogleOrderId: scala.Boolean) = this()
  /**
    * App provided identifier of the order.
    */
  var actionOrderId: js.UndefOr[java.lang.String] = js.native
  /**
    * Google provided identifier of the order.
    */
  var googleOrderId: js.UndefOr[java.lang.String] = js.native
  /**
    * Updates for items in the order. Mapped by item id to state or price.
    */
  var lineItemUpdates: js.Object = js.native
  /**
    * Actionable items presented to the user to manage the order.
    */
  var orderManagementActions: js.Array[js.Object] = js.native
  /**
    * State of the order.
    */
  var orderState: js.UndefOr[js.Object] = js.native
  /**
    * Updated total price of the order.
    */
  var totalPrice: js.UndefOr[Price] = js.native
  /**
    * UTC timestamp of the order update as an RFC 3339 string.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.native
  /**
    * Notification content to the user for the order update.
    */
  var userNotification: js.UndefOr[js.Object] = js.native
  /**
    * Adds a single price update for a particular line item in the order.
    *
    * @param itemId Line item ID for the order item updated.
    * @param priceType One of TransactionValues.PriceType.
    * @param currencyCode Currency code of new price.
    * @param units Unit count of new price.
    * @param nanos Partial unit count of new price.
    * @param reason Reason for the price change. Required unless a
    *     reason for this line item change was already declared in
    *     addLineItemStateUpdate.
    * @return Returns current constructed OrderUpdate.
    */
  def addLineItemPriceUpdate(
    itemId: java.lang.String,
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double
  ): OrderUpdate = js.native
  def addLineItemPriceUpdate(
    itemId: java.lang.String,
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double,
    nanos: scala.Double
  ): OrderUpdate = js.native
  def addLineItemPriceUpdate(
    itemId: java.lang.String,
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double,
    nanos: scala.Double,
    reason: java.lang.String
  ): OrderUpdate = js.native
  /**
    * Adds a single state update for a particular line item in the order.
    *
    * @param itemId Line item ID for the order item updated.
    * @param state One of TransactionValues.OrderState.
    * @param label Label for the new item state.
    * @param reason Reason for the price change. This will overwrite
    *     any reason given in addLineitemPriceUpdate.
    * @return Returns current constructed OrderUpdate.
    */
  def addLineItemStateUpdate(
    itemId: java.lang.String,
    state: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState,
    label: java.lang.String
  ): OrderUpdate = js.native
  def addLineItemStateUpdate(
    itemId: java.lang.String,
    state: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState,
    label: java.lang.String,
    reason: java.lang.String
  ): OrderUpdate = js.native
  /**
    * Adds an actionable item for the user to manage the order.
    *
    * @param type One of TransactionValues.ActionType.
    * @param label Button label.
    * @param url URL to open when button is clicked.
    * @return Returns current constructed OrderUpdate.
    */
  def addOrderManagementAction(
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType,
    label: java.lang.String,
    url: java.lang.String
  ): OrderUpdate = js.native
  /**
    * Set the Action provided order ID of the order.
    *
    * @param orderId Action provided order ID.
    * @return Returns current constructed OrderUpdate.
    */
  def setActionOrderId(orderId: java.lang.String): OrderUpdate = js.native
  /**
    * Set the Google provided order ID of the order.
    *
    * @param orderId Google provided order ID.
    * @return Returns current constructed OrderUpdate.
    */
  def setGoogleOrderId(orderId: java.lang.String): OrderUpdate = js.native
  /**
    * Sets some extra information about the order. Takes an order update info
    * type, and any accompanying data. This should only be called once per
    * order update.
    *
    * @param type One of TransactionValues.OrderStateInfo.
    * @param data Proper Object matching the data necessary for the info
    *     type. For instance, for the TransactionValues.OrderStateInfo.RECEIPT info
    *     type, use the {@link ReceiptInfo} data type.
    * @return Returns current constructed OrderUpdate.
    */
  def setInfo(`type`: java.lang.String, data: js.Object): OrderUpdate = js.native
  /**
    * Set the state of the order.
    *
    * @param state One of TransactionValues.OrderState.
    * @param label Label for the order state.
    * @return Returns current constructed OrderUpdate.
    */
  def setOrderState(
    state: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState,
    label: java.lang.String
  ): OrderUpdate = js.native
  /**
    * Sets the total price for this order.
    *
    * @param priceType One of TransactionValues.PriceType.
    * @param currencyCode Currency code of price.
    * @param units Unit count of price.
    * @param nanos Partial unit count of price.
    * @return Returns current constructed OrderUpdate.
    */
  def setTotalPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double
  ): OrderUpdate = js.native
  def setTotalPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double,
    nanos: scala.Double
  ): OrderUpdate = js.native
  /**
    * Set the update time of the order.
    *
    * @param seconds Seconds since Unix epoch.
    * @param nanos Partial time units. It is rounded to the nearest millisecond.
    * @return Returns current constructed OrderUpdate.
    */
  def setUpdateTime(seconds: scala.Double): OrderUpdate = js.native
  def setUpdateTime(seconds: scala.Double, nanos: scala.Double): OrderUpdate = js.native
  /**
    * Set the user notification content of the order update.
    *
    * @param title Title of the notification.
    * @param text Text of the notification.
    * @return Returns current constructed OrderUpdate.
    */
  def setUserNotification(title: java.lang.String, text: js.Object): OrderUpdate = js.native
}

