package typings
package vortexDashWebDashClientLib.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS")
@js.native
object DDSNsMembers extends js.Object {
  var DataReaderQos: EntityQos = js.native
  var DataWriterQos: EntityQos = js.native
  var TopicQos: EntityQos = js.native
  var VERSION: java.lang.String = js.native
  var runtime: vortexDashWebDashClientLib.Anon_Runtime = js.native
  def ContentFilter(expr: java.lang.String): Policy = js.native
  def Partition(policies: java.lang.String*): Policy = js.native
  def TimeFilter(period: scala.Double): Policy = js.native
}
