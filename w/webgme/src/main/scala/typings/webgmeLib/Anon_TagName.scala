package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TagName extends js.Object {
  /** Name of tag to delete. */
  def apply(tagName: java.lang.String, callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback): scala.Unit = js.native
  def apply(tagname: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}
