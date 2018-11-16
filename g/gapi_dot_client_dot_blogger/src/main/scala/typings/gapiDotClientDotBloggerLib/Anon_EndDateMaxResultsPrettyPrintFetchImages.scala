package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EndDateMaxResultsPrettyPrintFetchImages extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the blog to fetch posts from. */
  var blogId: java.lang.String
  /** Latest post date to fetch, a date-time with RFC 3339 formatting. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether the body content of posts is included (default: true). This should be set to false when the post bodies are not required, to help minimize
                   * traffic.
                   */
  var fetchBodies: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether image URL metadata for each post is included. */
  var fetchImages: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Comma-separated list of labels to search for. */
  var labels: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of posts to fetch. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Sort search results */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token if the request is paged. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Earliest post date to fetch, a date-time with RFC 3339 formatting. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Statuses to include in the results. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Access level with which to view the returned result. Note that some fields require escalated access. */
  var view: js.UndefOr[java.lang.String] = js.undefined
}
