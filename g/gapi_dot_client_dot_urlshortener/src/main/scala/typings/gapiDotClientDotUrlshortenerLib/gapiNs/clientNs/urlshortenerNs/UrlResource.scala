package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: gapiDotClientDotUrlshortenerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Creates a new short URL. */
  def insert(request: gapiDotClientDotUrlshortenerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: gapiDotClientDotUrlshortenerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotUrlshortenerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Url],
    insert: gapiDotClientDotUrlshortenerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Url],
    list: gapiDotClientDotUrlshortenerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[UrlHistory]
  ): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UrlResource]
  }
}

