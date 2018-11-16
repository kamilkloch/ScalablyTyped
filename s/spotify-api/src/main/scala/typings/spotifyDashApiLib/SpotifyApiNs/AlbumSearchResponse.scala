package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search for an album
     * 
     * GET /v1/search?type=album
     * https://developer.spotify.com/web-api/search-item/
     */

trait AlbumSearchResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified]
}
