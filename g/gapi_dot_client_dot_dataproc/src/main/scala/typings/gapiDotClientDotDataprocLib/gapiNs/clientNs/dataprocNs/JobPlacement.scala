package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobPlacement extends js.Object {
  /** Required. The name of the cluster where the job will be submitted. */
  var clusterName: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. A cluster UUID generated by the Cloud Dataproc service when the job is submitted. */
  var clusterUuid: js.UndefOr[java.lang.String] = js.undefined
}
