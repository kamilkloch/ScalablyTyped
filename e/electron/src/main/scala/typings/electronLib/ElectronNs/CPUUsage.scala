package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CPUUsage extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/cpu-usage
  /**
       * The number of average idle cpu wakeups per second since the last call to
       * getCPUUsage. First call returns 0. Will always return 0 on Windows.
       */
  var idleWakeupsPerSecond: scala.Double
  /**
       * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
       */
  var percentCPUUsage: scala.Double
}
