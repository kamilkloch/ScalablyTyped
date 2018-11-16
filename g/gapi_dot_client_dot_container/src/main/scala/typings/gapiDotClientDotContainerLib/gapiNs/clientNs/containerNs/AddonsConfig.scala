package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AddonsConfig extends js.Object {
  /**
               * Configuration for the horizontal pod autoscaling feature, which
               * increases or decreases the number of replica pods a replication controller
               * has based on the resource usage of the existing pods.
               */
  var horizontalPodAutoscaling: js.UndefOr[HorizontalPodAutoscaling] = js.undefined
  /**
               * Configuration for the HTTP (L7) load balancing controller addon, which
               * makes it easy to set up HTTP load balancers for services in a cluster.
               */
  var httpLoadBalancing: js.UndefOr[HttpLoadBalancing] = js.undefined
  /** Configuration for the Kubernetes Dashboard. */
  var kubernetesDashboard: js.UndefOr[KubernetesDashboard] = js.undefined
  /**
               * Configuration for NetworkPolicy. This only tracks whether the addon
               * is enabled or not on the Master, it does not track whether network policy
               * is enabled for the nodes.
               */
  var networkPolicyConfig: js.UndefOr[NetworkPolicyConfig] = js.undefined
}
