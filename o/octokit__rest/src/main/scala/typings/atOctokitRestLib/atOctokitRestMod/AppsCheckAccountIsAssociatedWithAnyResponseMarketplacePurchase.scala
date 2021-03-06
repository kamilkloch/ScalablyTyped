package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase extends js.Object {
  var billing_cycle: java.lang.String
  var free_trial_ends_on: java.lang.String
  var next_billing_date: java.lang.String
  var on_free_trial: scala.Boolean
  var plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan
  var unit_count: scala.Null
  var updated_at: java.lang.String
}

object AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase {
  @scala.inline
  def apply(
    billing_cycle: java.lang.String,
    free_trial_ends_on: java.lang.String,
    next_billing_date: java.lang.String,
    on_free_trial: scala.Boolean,
    plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan,
    unit_count: scala.Null,
    updated_at: java.lang.String
  ): AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase = {
    val __obj = js.Dynamic.literal(billing_cycle = billing_cycle, free_trial_ends_on = free_trial_ends_on, next_billing_date = next_billing_date, on_free_trial = on_free_trial, plan = plan, unit_count = unit_count, updated_at = updated_at)
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase]
  }
}

