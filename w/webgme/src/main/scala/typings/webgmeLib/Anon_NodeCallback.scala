package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NodeCallback extends js.Object {
  def apply(node: webgmeLib.CoreNs.Node): stdLib.Promise[scala.Unit] = js.native
  def apply(node: webgmeLib.CoreNs.Node, callback: webgmeLib.GmeCommonNs.ErrorOnlyCallback): scala.Unit = js.native
}
