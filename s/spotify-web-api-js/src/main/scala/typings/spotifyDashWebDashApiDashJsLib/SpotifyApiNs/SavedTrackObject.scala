package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait SavedTrackObject extends js.Object {
  var added_at: java.lang.String
  var track: TrackObjectFull
}

object SavedTrackObject {
  @scala.inline
  def apply(added_at: java.lang.String, track: TrackObjectFull): SavedTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at, track = track)
  
    __obj.asInstanceOf[SavedTrackObject]
  }
}

