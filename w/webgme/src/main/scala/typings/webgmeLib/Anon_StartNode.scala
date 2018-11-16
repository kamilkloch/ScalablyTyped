package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_StartNode extends js.Object {
  def apply(startNode: webgmeLib.CoreNs.Node, relativePath: webgmeLib.GmeCommonNs.Path): stdLib.Promise[webgmeLib.GmeCommonNs.DataObject] = js.native
  def apply(
    startNode: webgmeLib.CoreNs.Node,
    relativePath: webgmeLib.GmeCommonNs.Path,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.DataObject]
  ): scala.Unit = js.native
}
