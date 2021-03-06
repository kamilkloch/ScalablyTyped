package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackLyricsAddParams extends js.Object {
  var lyrics_body: js.UndefOr[java.lang.String] = js.undefined
  var lyrics_id: js.UndefOr[scala.Double] = js.undefined
}

object TrackLyricsAddParams {
  @scala.inline
  def apply(lyrics_body: java.lang.String = null, lyrics_id: scala.Int | scala.Double = null): TrackLyricsAddParams = {
    val __obj = js.Dynamic.literal()
    if (lyrics_body != null) __obj.updateDynamic("lyrics_body")(lyrics_body)
    if (lyrics_id != null) __obj.updateDynamic("lyrics_id")(lyrics_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLyricsAddParams]
  }
}

