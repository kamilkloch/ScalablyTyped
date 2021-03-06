package typings
package chromeDashAppsLib.chromeNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filters URLs for constious criteria. See event filtering. All criteria are case sensitive. */
trait UrlFilter extends js.Object {
  /**
    * Matches if the host name of the URL contains a specified string.
    * To test whether a host name component has a prefix 'foo',
    * use hostContains: '.foo'. This matches 'www.foobar.com' and
    * 'foo.com', because an implicit dot is added at the beginning of
    * the host name. Similarly, hostContains can be used to match
    * against component suffix ('foo.') and to exactly match against
    * components ('.foo.'). Suffix- and exact-matching for the last
    * components need to be done separately using hostSuffix, because
    * no implicit dot is added at the end of the host name.
    **/
  var hostContains: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the host name of the URL is equal to a specified string.  */
  var hostEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the host name of the URL starts with a specified string.  */
  var hostPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the host name of the URL ends with a specified string.  */
  var hostSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Matches if the URL without query segment and fragment identifier matches a specified regular expression.
    * Port numbers are stripped from the URL if they match the default port number.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax docs]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    * @since Chrome 28.
    */
  var originAndPathMatches: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the path segment of the URL contains a specified string.  */
  var pathContains: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the path segment of the URL starts with a specified string.  */
  var pathEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the path segment of the URL ends with a specified string.  */
  var pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the path segment of the URL is equal to a specified string.  */
  var pathSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Matches if the port of the URL is contained in any of the specified port lists.
    * For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.
    */
  var ports: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeNs.integer | js.Array[chromeDashAppsLib.chromeNs.integer]
    ]
  ] = js.undefined
  /** Matches if the query segment of the URL contains a specified string.  */
  var queryContains: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the query segment of the URL is equal to a specified string.  */
  var queryEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the query segment of the URL starts with a specified string.  */
  var queryPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the query segment of the URL ends with a specified string.  */
  var querySuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the scheme of the URL is equal to any of the schemes specified in the array. */
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlContains: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the URL (without fragment identifier) matches a specified regular expression.
    * Port numbers are stripped from the URL if they match the default port number.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax docs]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var urlMatches: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlSuffix: js.UndefOr[java.lang.String] = js.undefined
}

object UrlFilter {
  @scala.inline
  def apply(
    hostContains: java.lang.String = null,
    hostEquals: java.lang.String = null,
    hostPrefix: java.lang.String = null,
    hostSuffix: java.lang.String = null,
    originAndPathMatches: java.lang.String = null,
    pathContains: java.lang.String = null,
    pathEquals: java.lang.String = null,
    pathPrefix: java.lang.String = null,
    pathSuffix: java.lang.String = null,
    ports: js.Array[
      chromeDashAppsLib.chromeNs.integer | js.Array[chromeDashAppsLib.chromeNs.integer]
    ] = null,
    queryContains: java.lang.String = null,
    queryEquals: java.lang.String = null,
    queryPrefix: java.lang.String = null,
    querySuffix: java.lang.String = null,
    schemes: js.Array[java.lang.String] = null,
    urlContains: java.lang.String = null,
    urlEquals: java.lang.String = null,
    urlMatches: java.lang.String = null,
    urlPrefix: java.lang.String = null,
    urlSuffix: java.lang.String = null
  ): UrlFilter = {
    val __obj = js.Dynamic.literal()
    if (hostContains != null) __obj.updateDynamic("hostContains")(hostContains)
    if (hostEquals != null) __obj.updateDynamic("hostEquals")(hostEquals)
    if (hostPrefix != null) __obj.updateDynamic("hostPrefix")(hostPrefix)
    if (hostSuffix != null) __obj.updateDynamic("hostSuffix")(hostSuffix)
    if (originAndPathMatches != null) __obj.updateDynamic("originAndPathMatches")(originAndPathMatches)
    if (pathContains != null) __obj.updateDynamic("pathContains")(pathContains)
    if (pathEquals != null) __obj.updateDynamic("pathEquals")(pathEquals)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (pathSuffix != null) __obj.updateDynamic("pathSuffix")(pathSuffix)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (queryContains != null) __obj.updateDynamic("queryContains")(queryContains)
    if (queryEquals != null) __obj.updateDynamic("queryEquals")(queryEquals)
    if (queryPrefix != null) __obj.updateDynamic("queryPrefix")(queryPrefix)
    if (querySuffix != null) __obj.updateDynamic("querySuffix")(querySuffix)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (urlContains != null) __obj.updateDynamic("urlContains")(urlContains)
    if (urlEquals != null) __obj.updateDynamic("urlEquals")(urlEquals)
    if (urlMatches != null) __obj.updateDynamic("urlMatches")(urlMatches)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    if (urlSuffix != null) __obj.updateDynamic("urlSuffix")(urlSuffix)
    __obj.asInstanceOf[UrlFilter]
  }
}

