package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ParentCallbackNode extends js.Object {
  def apply(parent: webgmeLib.CoreNs.Node): stdLib.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  def apply(
    parent: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
}
