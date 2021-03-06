package typings
package stripeLib.stripeMod.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for picking the last usage record reported within a period, `last_ever` for picking the last usage record ever (across period bounds) or `max` which picks the usage record with the maximum reported usage during a period. Defaults to `sum`.
    */
  var aggregate_usage: js.UndefOr[
    stripeLib.stripeLibStrings.sum | stripeLib.stripeLibStrings.last_during_period | stripeLib.stripeLibStrings.last_ever | stripeLib.stripeLibStrings.max
  ] = js.undefined
  /**
    * A positive integer in cents/pence (or 0 for a free plan) representing how much to charge (on a recurring basis).
    */
  var amount: scala.Double
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
    */
  var billing_scheme: js.UndefOr[stripeLib.stripeLibStrings.per_unit | stripeLib.stripeLibStrings.tiered] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * An identifier randomly generated by Stripe. Used to identify this plan when subscribing a customer. You can optionally override this
    * ID, but the ID must be unique across all plans in your Stripe account. You can, however, use the same plan ID in both live and test
    * modes.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies billing frequency. Either "day", "week", "month" or "year".
    */
  var interval: IntervalUnit
  /**
    * The number of intervals between each subscription billing. For example, interval=month and interval_count=3 bills every 3 months.
    * Maximum of one year interval allowed (1 year, 12 months, or 52 weeks).
    */
  var interval_count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  @JSName("metadata")
  var metadata_IPlanCreationOptions: js.UndefOr[stripeLib.stripeMod.IMetadata] = js.undefined
  /**
    * A brief description of the plan, hidden from customers.
    */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The product whose pricing the created plan will represent. This can either be the ID of an existing product, or a dictionary containing
    * fields used to create a service product.
    */
  var product: java.lang.String | IPlanCreationOptionsProductHash
  /**
    * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
    */
  var tiers: js.UndefOr[js.Array[ITier]] = js.undefined
  /**
    * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity grows.
    */
  var tiers_mode: js.UndefOr[stripeLib.stripeLibStrings.graduated | stripeLib.stripeLibStrings.volume] = js.undefined
  /**
    * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined with `tiers`.
    */
  var transform_usage: js.UndefOr[ITransformUsage] = js.undefined
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configures how the quantity per period should be determined, can be either `metered` or `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to a subscription, `metered` will aggregate the total usage based on usage records. Defaults to `licensed`.
    */
  var usage_type: js.UndefOr[stripeLib.stripeLibStrings.metered | stripeLib.stripeLibStrings.licensed] = js.undefined
}

object IPlanCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    interval: IntervalUnit,
    product: java.lang.String | IPlanCreationOptionsProductHash,
    aggregate_usage: stripeLib.stripeLibStrings.sum | stripeLib.stripeLibStrings.last_during_period | stripeLib.stripeLibStrings.last_ever | stripeLib.stripeLibStrings.max = null,
    billing_scheme: stripeLib.stripeLibStrings.per_unit | stripeLib.stripeLibStrings.tiered = null,
    expand: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    include: js.Array[java.lang.String] = null,
    interval_count: scala.Int | scala.Double = null,
    livemode: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: stripeLib.stripeMod.IMetadata = null,
    nickname: java.lang.String = null,
    tiers: js.Array[ITier] = null,
    tiers_mode: stripeLib.stripeLibStrings.graduated | stripeLib.stripeLibStrings.volume = null,
    transform_usage: ITransformUsage = null,
    trial_period_days: scala.Int | scala.Double = null,
    usage_type: stripeLib.stripeLibStrings.metered | stripeLib.stripeLibStrings.licensed = null
  ): IPlanCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, interval = interval, product = product.asInstanceOf[js.Any])
    if (aggregate_usage != null) __obj.updateDynamic("aggregate_usage")(aggregate_usage.asInstanceOf[js.Any])
    if (billing_scheme != null) __obj.updateDynamic("billing_scheme")(billing_scheme.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (id != null) __obj.updateDynamic("id")(id)
    if (include != null) __obj.updateDynamic("include")(include)
    if (interval_count != null) __obj.updateDynamic("interval_count")(interval_count.asInstanceOf[js.Any])
    if (!js.isUndefined(livemode)) __obj.updateDynamic("livemode")(livemode)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (tiers != null) __obj.updateDynamic("tiers")(tiers)
    if (tiers_mode != null) __obj.updateDynamic("tiers_mode")(tiers_mode.asInstanceOf[js.Any])
    if (transform_usage != null) __obj.updateDynamic("transform_usage")(transform_usage)
    if (trial_period_days != null) __obj.updateDynamic("trial_period_days")(trial_period_days.asInstanceOf[js.Any])
    if (usage_type != null) __obj.updateDynamic("usage_type")(usage_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlanCreationOptions]
  }
}

