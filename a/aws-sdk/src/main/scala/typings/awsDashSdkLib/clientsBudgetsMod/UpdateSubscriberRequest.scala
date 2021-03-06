package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to update.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget whose subscriber you want to update.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
  /**
    * The updated subscriber that is associated with a budget notification.
    */
  var NewSubscriber: Subscriber
  /**
    * The notification whose subscriber you want to update.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.Notification
  /**
    * The previous subscriber that is associated with a budget notification.
    */
  var OldSubscriber: Subscriber
}

object UpdateSubscriberRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewSubscriber: Subscriber,
    Notification: Notification,
    OldSubscriber: Subscriber
  ): UpdateSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, NewSubscriber = NewSubscriber, Notification = Notification, OldSubscriber = OldSubscriber)
  
    __obj.asInstanceOf[UpdateSubscriberRequest]
  }
}

