package typings
package gapiDotClientDotDeploymentmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Project extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Sets a filter {expression} for filtering listed resources. Your {expression} must be in the format: field_name comparison_string literal_string.
                   *
                   * The field_name is the name of the field you want to compare. Only atomic field types are supported (string, number, boolean). The comparison_string
                   * must be either eq (equals) or ne (not equals). The literal_string is the string value to filter to. The literal value must be valid for the type of
                   * field you are filtering by (string, number, boolean). For string fields, the literal value is interpreted as a regular expression using RE2 syntax. The
                   * literal value must match the entire field.
                   *
                   * For example, to filter for instances that do not have a name of example-instance, you would use name ne example-instance.
                   *
                   * You can filter on nested fields. For example, you could filter on instances that have set the scheduling.automaticRestart field to true. Use filtering
                   * on nested fields to take advantage of labels to organize and search for results based on label values.
                   *
                   * To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart eq true) (zone eq
                   * us-central1-f). Multiple expressions are treated as AND expressions, meaning that resources must match all expressions to pass the filters.
                   */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a
                   * nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
                   */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.
                   *
                   * You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the
                   * creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation
                   * is returned first.
                   *
                   * Currently, only sorting by name or creationTimestamp desc is supported.
                   */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The project ID for this request. */
  var project: java.lang.String
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}
