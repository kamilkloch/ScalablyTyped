package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintOnBehalfOfContentOwnerChannelQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintOnBehalfOfContentOwnerChannel): gapiDotClientLib.gapiNs.clientNs.Request[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_MineMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintOnBehalfOfContentOwnerChannel): gapiDotClientLib.gapiNs.clientNs.Request[LiveStream]
}
