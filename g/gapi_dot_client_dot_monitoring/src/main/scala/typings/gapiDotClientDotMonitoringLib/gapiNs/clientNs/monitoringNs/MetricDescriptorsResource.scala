package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor]
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor]
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotMonitoringLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor],
    delete: gapiDotClientDotMonitoringLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotMonitoringLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor],
    list: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}

