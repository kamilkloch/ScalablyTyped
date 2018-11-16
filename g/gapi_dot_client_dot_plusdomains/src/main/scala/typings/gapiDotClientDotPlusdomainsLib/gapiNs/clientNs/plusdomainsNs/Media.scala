package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Media extends js.Object {
  /** The person who uploaded this media. */
  var author: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_DisplayNameUrlImageId] = js.undefined
  /** The display name for this media. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Exif information of the media item. */
  var exif: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_Time] = js.undefined
  /** The height in pixels of the original image. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** ID of this media, which is generated by the API. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this media was originally created in UTC. Formatted as an RFC 3339 timestamp that matches this example: 2010-11-25T14:30:27.655Z */
  var mediaCreatedTime: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of this photo or video's still image. */
  var mediaUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this media was uploaded. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The size in bytes of this video. */
  var sizeBytes: js.UndefOr[java.lang.String] = js.undefined
  /** The list of video streams for this video. There might be several different streams available for a single video, either Flash or MPEG, of various sizes */
  var streams: js.UndefOr[js.Array[Videostream]] = js.undefined
  /** A description, or caption, for this media. */
  var summary: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this media was last updated. This includes changes to media metadata. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the page that hosts this media. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The duration in milliseconds of this video. */
  var videoDuration: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The encoding status of this video. Possible values are:
               * - "UPLOADING" - Not all the video bytes have been received.
               * - "PENDING" - Video not yet processed.
               * - "FAILED" - Video processing failed.
               * - "READY" - A single video stream is playable.
               * - "FINAL" - All video streams are playable.
               */
  var videoStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The width in pixels of the original image. */
  var width: js.UndefOr[scala.Double] = js.undefined
}
