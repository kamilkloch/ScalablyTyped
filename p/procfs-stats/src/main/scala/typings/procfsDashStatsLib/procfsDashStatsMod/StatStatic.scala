package typings
package procfsDashStatsLib.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("procfs-stats", "StatStatic")
@js.native
class StatStatic () extends js.Object {
  var works: scala.Boolean = js.native
  def argv(callback: Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  def cpu(callback: Callback[Cpu]): scala.Nothing = js.native
  def cwd(callback: Callback[java.lang.String]): scala.Nothing = js.native
  def disk(callback: Callback[js.Array[DiskStat]]): scala.Nothing = js.native
  def env(callback: Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  def fd(fdPath: java.lang.String, callback: Callback[FileDescriptor]): scala.Nothing = js.native
  def fds(callback: Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  def io(callback: Callback[Io]): scala.Nothing = js.native
  def meminfo(callback: Callback[MemoryInfo]): scala.Nothing = js.native
  def net(callback: Callback[js.Array[Net]]): scala.Nothing = js.native
  def stat(callback: Callback[Stat]): scala.Nothing = js.native
  def statm(callback: Callback[MemoryStat]): scala.Nothing = js.native
  def status(callback: Callback[Status]): scala.Nothing = js.native
  def tcp(callback: Callback[js.Array[Tcp]]): scala.Nothing = js.native
  def thread(tid: scala.Double): Stat = js.native
  def threads(callback: Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  def udp(callback: Callback[js.Array[Udp]]): scala.Nothing = js.native
  def unix(callback: Callback[js.Array[UnixSocket]]): scala.Nothing = js.native
  def wifi(callback: Callback[js.Array[Wifi]]): scala.Nothing = js.native
}

