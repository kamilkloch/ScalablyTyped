package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SourceRoot extends js.Object {
  def apply(sourceRoot: webgmeLib.CoreNs.Node, targetRoot: webgmeLib.CoreNs.Node): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    sourceRoot: webgmeLib.CoreNs.Node,
    targetRoot: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}
