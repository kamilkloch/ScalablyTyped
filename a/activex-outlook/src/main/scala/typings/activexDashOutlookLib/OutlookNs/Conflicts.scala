package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conflicts")
@js.native
class Conflicts protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.Conflicts_typekey`: Conflicts = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetFirst(): Conflict = js.native
  def GetLast(): Conflict = js.native
  def GetNext(): Conflict = js.native
  def GetPrevious(): Conflict = js.native
  def Item(Index: js.Any): Conflict = js.native
}

