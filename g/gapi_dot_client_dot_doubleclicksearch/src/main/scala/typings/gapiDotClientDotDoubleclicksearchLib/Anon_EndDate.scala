package typings
package gapiDotClientDotDoubleclicksearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EndDate extends js.Object {
  /** Numeric ID of the ad group. */
  var adGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Numeric ID of the ad. */
  var adId: js.UndefOr[java.lang.String] = js.undefined
  /** Numeric ID of the advertiser. */
  var advertiserId: java.lang.String
  /** Numeric ID of the agency. */
  var agencyId: java.lang.String
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Numeric ID of the campaign. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /** Numeric ID of the criterion. */
  var criterionId: js.UndefOr[java.lang.String] = js.undefined
  /** Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var endDate: scala.Double
  /** Numeric ID of the engine account. */
  var engineAccountId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The number of conversions to return per call. */
  var rowCount: scala.Double
  /** First date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var startDate: scala.Double
  /** The 0-based starting index for retrieving conversions results. */
  var startRow: scala.Double
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}
