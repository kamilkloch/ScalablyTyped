package typings
package gapiDotClientDotServicemanagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AccesstokenPageSizePrettyPrint extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Use `filter` to return subset of rollouts.
                   * The following filters are supported:
                   * -- To limit the results to only those in
                   * [status](google.api.servicemanagement.v1.RolloutStatus) 'SUCCESS',
                   * use filter='status=SUCCESS'
                   * -- To limit the results to those in
                   * [status](google.api.servicemanagement.v1.RolloutStatus) 'CANCELLED'
                   * or 'FAILED', use filter='status=CANCELLED OR status=FAILED'
                   */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The max number of items to include in the response list. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** The token of the page to retrieve. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The name of the service.  See the [overview](/service-management/overview)
                   * for naming requirements.  For example: `example.googleapis.com`.
                   */
  var serviceName: java.lang.String
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}
