package typings
package shopifyDashPrimeLib.distServicesUsageUnderscoreChargesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/usage_charges", "UsageCharges")
@js.native
class UsageCharges protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Creates a new charge.
       * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
       */
  def create(
    recurringChargeId: scala.Double,
    charge: shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge] = js.native
  /**
       * Gets a charge with the given id.
       * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
       * @param id The id of the charge to get.
       * @param options Options for filtering the result.
       */
  def get(recurringChargeId: scala.Double, id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge] = js.native
  /**
       * Gets a charge with the given id.
       * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
       * @param id The id of the charge to get.
       * @param options Options for filtering the result.
       */
  def get(
    recurringChargeId: scala.Double,
    id: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge] = js.native
  /**
       * Retrieves a list of all charges.
       * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
       * @param options Options for filtering the result.
       */
  def list(recurringChargeId: scala.Double): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge]] = js.native
  /**
       * Retrieves a list of all charges.
       * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
       * @param options Options for filtering the result.
       */
  def list(recurringChargeId: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsUsageUnderscoreChargeMod.UsageCharge]] = js.native
}
