package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Song ============================================================================================
trait Song extends js.Object {
  var album: js.UndefOr[js.Any] = js.undefined
  var annotation_count: scala.Double
  var api_path: java.lang.String
  var apple_music_id: js.UndefOr[js.Any] = js.undefined
  var apple_music_player_url: java.lang.String
  var current_user_metadata: lyricistLib.Anon_Excludedpermissions
  var custom_performances: js.Array[_]
  var description: Description
  var description_annotation: DescriptionAnnotation
  var embed_content: java.lang.String
  var featured_artists: js.Array[_]
  var featured_video: scala.Boolean
  var full_title: java.lang.String
  var header_image_thumbnail_url: java.lang.String
  var header_image_url: java.lang.String
  var id: scala.Double
  var lyrics: java.lang.String
  var lyrics_marked_complete_by: js.UndefOr[js.Any] = js.undefined
  var lyrics_owner_id: scala.Double
  var lyrics_state: java.lang.String
  var media: js.Array[Media]
  var path: java.lang.String
  var primary_artist: ArtistBrief
  var producer_artists: js.Array[ArtistBrief]
  var pyongs_count: js.UndefOr[js.Any] = js.undefined
  var recording_location: js.UndefOr[js.Any] = js.undefined
  var release_date: java.lang.String
  var song_art_image_thumbnail_url: java.lang.String
  var song_art_image_url: java.lang.String
  var song_relationships: js.Array[lyricistLib.Anon_Songs]
  var stats: lyricistLib.Anon_Acceptedannotations
  var title: java.lang.String
  var title_with_featured: java.lang.String
  var url: java.lang.String
  var verified_annotations_by: js.Array[_]
  var verified_contributors: js.Array[_]
  var verified_lyrics_by: js.Array[_]
  var writer_artists: js.Array[ArtistBrief]
}

object Song {
  @scala.inline
  def apply(
    annotation_count: scala.Double,
    api_path: java.lang.String,
    apple_music_player_url: java.lang.String,
    current_user_metadata: lyricistLib.Anon_Excludedpermissions,
    custom_performances: js.Array[_],
    description: Description,
    description_annotation: DescriptionAnnotation,
    embed_content: java.lang.String,
    featured_artists: js.Array[_],
    featured_video: scala.Boolean,
    full_title: java.lang.String,
    header_image_thumbnail_url: java.lang.String,
    header_image_url: java.lang.String,
    id: scala.Double,
    lyrics: java.lang.String,
    lyrics_owner_id: scala.Double,
    lyrics_state: java.lang.String,
    media: js.Array[Media],
    path: java.lang.String,
    primary_artist: ArtistBrief,
    producer_artists: js.Array[ArtistBrief],
    release_date: java.lang.String,
    song_art_image_thumbnail_url: java.lang.String,
    song_art_image_url: java.lang.String,
    song_relationships: js.Array[lyricistLib.Anon_Songs],
    stats: lyricistLib.Anon_Acceptedannotations,
    title: java.lang.String,
    title_with_featured: java.lang.String,
    url: java.lang.String,
    verified_annotations_by: js.Array[_],
    verified_contributors: js.Array[_],
    verified_lyrics_by: js.Array[_],
    writer_artists: js.Array[ArtistBrief],
    album: js.Any = null,
    apple_music_id: js.Any = null,
    lyrics_marked_complete_by: js.Any = null,
    pyongs_count: js.Any = null,
    recording_location: js.Any = null
  ): Song = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count, api_path = api_path, apple_music_player_url = apple_music_player_url, current_user_metadata = current_user_metadata, custom_performances = custom_performances, description = description, description_annotation = description_annotation, embed_content = embed_content, featured_artists = featured_artists, featured_video = featured_video, full_title = full_title, header_image_thumbnail_url = header_image_thumbnail_url, header_image_url = header_image_url, id = id, lyrics = lyrics, lyrics_owner_id = lyrics_owner_id, lyrics_state = lyrics_state, media = media, path = path, primary_artist = primary_artist, producer_artists = producer_artists, release_date = release_date, song_art_image_thumbnail_url = song_art_image_thumbnail_url, song_art_image_url = song_art_image_url, song_relationships = song_relationships, stats = stats, title = title, title_with_featured = title_with_featured, url = url, verified_annotations_by = verified_annotations_by, verified_contributors = verified_contributors, verified_lyrics_by = verified_lyrics_by, writer_artists = writer_artists)
    if (album != null) __obj.updateDynamic("album")(album)
    if (apple_music_id != null) __obj.updateDynamic("apple_music_id")(apple_music_id)
    if (lyrics_marked_complete_by != null) __obj.updateDynamic("lyrics_marked_complete_by")(lyrics_marked_complete_by)
    if (pyongs_count != null) __obj.updateDynamic("pyongs_count")(pyongs_count)
    if (recording_location != null) __obj.updateDynamic("recording_location")(recording_location)
    __obj.asInstanceOf[Song]
  }
}

