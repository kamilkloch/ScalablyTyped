package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataHashCallbackSubpath extends js.Object {
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Content],
    subpath: java.lang.String
  ): scala.Unit = js.native
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): stdLib.Promise[webgmeLib.GmeCommonNs.Content] = js.native
}
