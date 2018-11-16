package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RegionCode extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The chart parameter identifies the chart that you want to retrieve. */
  var chart: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The
                   * parameter value must be a language code included in the list returned by the i18nLanguages.list method.
                   *
                   * If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if
                   * localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
                   */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id
                   * property specifies the video's ID.
                   */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** DEPRECATED */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The maxHeight parameter specifies a maximum height of the embedded player. If maxWidth is provided, maxHeight may not be reached in order to not
                   * violate the width request.
                   */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
                   *
                   * Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with
                   * the id parameter.
                   */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The maxWidth parameter specifies a maximum width of the embedded player. If maxHeight is provided, maxWidth may not be reached in order to not violate
                   * the height request.
                   */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Set this parameter's value to like or dislike to instruct the API to only return videos liked or disliked by the authenticated user. */
  var myRating: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Note: This parameter is intended exclusively for YouTube content partners.
                   *
                   * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the
                   * content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube
                   * channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication
                   * credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
                   */
  var onBehalfOfContentOwner: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
                   * properties identify other pages that could be retrieved.
                   *
                   * Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with
                   * the id parameter.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The part parameter specifies a comma-separated list of one or more video resource properties that the API response will include.
                   *
                   * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video
                   * resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set part=snippet, the API
                   * response will contain all of those properties.
                   */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The regionCode parameter instructs the API to select a video chart available in the specified region. This parameter can only be used in conjunction
                   * with the chart parameter. The parameter value is an ISO 3166-1 alpha-2 country code.
                   */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The videoCategoryId parameter identifies the video category for which the chart should be retrieved. This parameter can only be used in conjunction
                   * with the chart parameter. By default, charts are not restricted to a particular category.
                   */
  var videoCategoryId: js.UndefOr[java.lang.String] = js.undefined
}
