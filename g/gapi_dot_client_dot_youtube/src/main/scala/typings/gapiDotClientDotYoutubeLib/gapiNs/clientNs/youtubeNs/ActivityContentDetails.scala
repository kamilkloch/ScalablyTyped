package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActivityContentDetails extends js.Object {
  /** The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin. */
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.undefined
  /**
               * The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is
               * channelItem.
               */
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.undefined
  /** The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment. */
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.undefined
  /**
               * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is
               * favorite.
               */
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.undefined
  /**
               * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is
               * like.
               */
  var like: js.UndefOr[ActivityContentDetailsLike] = js.undefined
  /** The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem. */
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.undefined
  /** The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem. */
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.undefined
  /** The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation. */
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.undefined
  /** The social object contains details about a social network post. This property is only present if the snippet.type is social. */
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.undefined
  /**
               * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is
               * subscription.
               */
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.undefined
  /** The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload. */
  var upload: js.UndefOr[ActivityContentDetailsUpload] = js.undefined
}
