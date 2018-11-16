package typings
package shopifyDashPrimeLib.distServicesApplicationUnderscoreCrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/application_cr", "ApplicationCredits")
@js.native
class ApplicationCredits protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Creates a new Application Credit.
       */
  def create(credit: shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit): stdLib.Promise[shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit] = js.native
  /**
       * Gets an application credit with the given id.
       * @param id The id of the credit to get.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit] = js.native
  /**
       * Gets an application credit with the given id.
       * @param id The id of the credit to get.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit] = js.native
  /**
       * Retrieves a list of all past and present application credits.
       * @param options Options for filtering the result.
       */
  def list(): stdLib.Promise[
    js.Array[shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit]
  ] = js.native
  /**
       * Retrieves a list of all past and present application credits.
       * @param options Options for filtering the result.
       */
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[
    js.Array[shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod.ApplicationCredit]
  ] = js.native
}
