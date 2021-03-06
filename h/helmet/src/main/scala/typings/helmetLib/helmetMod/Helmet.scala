package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helmet extends js.Object {
  /**
    * @summary Constructor.
    * @return {RequestHandler} The Request handler.
    */
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(options: IHelmetConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Set policy around third-party content via headers
    * @param {IHelmetContentSecurityPolicyConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def contentSecurityPolicy(): expressLib.expressMod.RequestHandler = js.native
  def contentSecurityPolicy(options: IHelmetContentSecurityPolicyConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Stop browsers from doing DNS prefetching.
    * @param {IHelmetDnsPrefetchControlConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def dnsPrefetchControl(): expressLib.expressMod.RequestHandler = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "Expect-CT" header.
    * @param {helmet.IHelmetExpectCtConfiguration} options
    * @returns {e.RequestHandler}
    */
  def expectCt(): expressLib.expressMod.RequestHandler = js.native
  def expectCt(options: IHelmetExpectCtConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Prevent clickjacking.
    * @param {IHelmetFrameguardConfiguration} options The options
    * @return {RequestHandler} The Request handler
    */
  def frameguard(): expressLib.expressMod.RequestHandler = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Hide "X-Powered-By" header.
    * @param {IHelmetHidePoweredByConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hidePoweredBy(): expressLib.expressMod.RequestHandler = js.native
  def hidePoweredBy(options: IHelmetHidePoweredByConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "Public-Key-Pins" header.
    * @param {IHelmetHpkpConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hpkp(): expressLib.expressMod.RequestHandler = js.native
  def hpkp(options: IHelmetHpkpConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "Strict-Transport-Security" header.
    * @param {IHelmetHstsConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def hsts(): expressLib.expressMod.RequestHandler = js.native
  def hsts(options: IHelmetHstsConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Add the "X-Download-Options" header.
    * @return {RequestHandler} The Request handler.
    */
  def ieNoOpen(): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Add the "Cache-Control" and "Pragma" headers to stop caching.
    * @return {RequestHandler} The Request handler.
    */
  def noCache(): expressLib.expressMod.RequestHandler = js.native
  def noCache(options: js.Object): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "X-Content-Type-Options" header.
    * @return {RequestHandler} The Request handler.
    */
  def noSniff(): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "X-Permitted-Cross-Domain-Policies" header.
    * @param {helmet.IHelmetPermittedCrossDomainPoliciesConfiguration} options
    * @returns {express.RequestHandler}
    */
  def permittedCrossDomainPolicies(): expressLib.expressMod.RequestHandler = js.native
  def permittedCrossDomainPolicies(options: IHelmetPermittedCrossDomainPoliciesConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Adds the "Referrer-Policy" header.
    * @return {RequestHandler} The Request handler.
    */
  def referrerPolicy(): expressLib.expressMod.RequestHandler = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): expressLib.expressMod.RequestHandler = js.native
  /**
    * @summary Mitigate cross-site scripting attacks with the "X-XSS-Protection" header.
    * @param {IHelmetXssFilterConfiguration} options The options
    * @return {RequestHandler} The Request handler.
    */
  def xssFilter(): expressLib.expressMod.RequestHandler = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): expressLib.expressMod.RequestHandler = js.native
}

