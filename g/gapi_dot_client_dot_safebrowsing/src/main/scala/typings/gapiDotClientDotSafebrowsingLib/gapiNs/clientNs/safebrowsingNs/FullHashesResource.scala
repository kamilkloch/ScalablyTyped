package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[FindFullHashesResponse]
}

object FullHashesResource {
  @scala.inline
  def apply(
    find: gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[FindFullHashesResponse]
  ): FullHashesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[FullHashesResource]
  }
}

