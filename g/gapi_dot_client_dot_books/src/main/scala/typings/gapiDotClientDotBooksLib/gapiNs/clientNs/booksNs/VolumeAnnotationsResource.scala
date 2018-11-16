package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: gapiDotClientDotBooksLib.Anon_LayerIdSource): gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: gapiDotClientDotBooksLib.Anon_LayerIdEndOffset): gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotations]
}
