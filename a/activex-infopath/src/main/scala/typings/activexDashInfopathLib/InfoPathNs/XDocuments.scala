package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDocuments")
@js.native
class XDocuments protected () extends js.Object {
  val Count: scala.Double = js.native
  var `InfoPath.XDocuments_typekey`: XDocuments = js.native
  def Close(varIndex: js.Any): scala.Unit = js.native
  def Item(varIndex: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def New(varURI: js.Any): _XDocument = js.native
  def New(varURI: js.Any, dwBehavior: scala.Double): _XDocument = js.native
  def NewFromSolution(varURI: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def Open(varURI: js.Any): _XDocument = js.native
  def Open(varURI: js.Any, dwBehavior: scala.Double): _XDocument = js.native
}

