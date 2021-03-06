package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserverEntryList extends js.Object {
  def getEntries(): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
}

@JSGlobal("PerformanceObserverEntryList")
@js.native
class PerformanceObserverEntryListCls () extends PerformanceObserverEntryList

@JSGlobal("PerformanceObserverEntryList")
@js.native
object PerformanceObserverEntryList
  extends org.scalablytyped.runtime.Instantiable0[PerformanceObserverEntryList]

