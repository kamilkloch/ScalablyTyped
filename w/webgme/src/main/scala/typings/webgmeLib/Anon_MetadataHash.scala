package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataHash extends js.Object {
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): stdLib.Promise[webgmeLib.GmeClassesNs.Artifact] = js.native
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeClassesNs.Artifact]
  ): scala.Unit = js.native
}
