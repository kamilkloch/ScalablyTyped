package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataHashCallback extends js.Object {
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): stdLib.Promise[stdLib.JSON] = js.native
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[stdLib.JSON]
  ): scala.Unit = js.native
}
