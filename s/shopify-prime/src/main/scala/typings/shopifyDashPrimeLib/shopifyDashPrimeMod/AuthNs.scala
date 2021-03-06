package typings
package shopifyDashPrimeLib.shopifyDashPrimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime", "Auth")
@js.native
object AuthNs extends js.Object {
  def authorize(
    code: java.lang.String,
    shopDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    shopifySecretKey: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String,
    state: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def buildAuthorizationUrl(
    scopes: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreScopeMod.AuthScope],
    shopifyDomain: java.lang.String,
    shopifyApiKey: java.lang.String,
    redirectUrl: java.lang.String,
    state: java.lang.String,
    grants: js.Array[shopifyDashPrimeLib.distEnumsAuthUnderscoreGrantMod.AuthGrant]
  ): js.Promise[java.lang.String] = js.native
  def isAuthenticProxyRequest(
    querystring: org.scalablytyped.runtime.StringDictionary[js.Any],
    shopifySecretKey: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def isAuthenticRequest(
    querystring: org.scalablytyped.runtime.StringDictionary[js.Any],
    shopifySecretKey: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def isAuthenticWebhook(headers: java.lang.String, requestBody: java.lang.String, shopifySecretKey: java.lang.String): js.Promise[scala.Boolean] = js.native
  def isAuthenticWebhook(
    headers: org.scalablytyped.runtime.StringDictionary[js.Any],
    requestBody: java.lang.String,
    shopifySecretKey: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def isValidShopifyDomain(shopifyDomain: java.lang.String): js.Promise[scala.Boolean] = js.native
}

