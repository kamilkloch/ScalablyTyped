package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerRequest extends js.Object {
  /**
    * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined
  /**
    * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
    */
  var certificateDomainName: js.UndefOr[DomainName] = js.undefined
  /**
    * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
    */
  var certificateName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
    */
  var healthCheckPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The instance port where you're creating your load balancer.
    */
  var instancePort: Port
  /**
    * The name of your load balancer.
    */
  var loadBalancerName: ResourceName
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateLoadBalancerRequest {
  @scala.inline
  def apply(
    instancePort: Port,
    loadBalancerName: ResourceName,
    certificateAlternativeNames: DomainNameList = null,
    certificateDomainName: DomainName = null,
    certificateName: ResourceName = null,
    healthCheckPath: java.lang.String = null,
    tags: TagList = null
  ): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, loadBalancerName = loadBalancerName)
    if (certificateAlternativeNames != null) __obj.updateDynamic("certificateAlternativeNames")(certificateAlternativeNames)
    if (certificateDomainName != null) __obj.updateDynamic("certificateDomainName")(certificateDomainName)
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName)
    if (healthCheckPath != null) __obj.updateDynamic("healthCheckPath")(healthCheckPath)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
}

