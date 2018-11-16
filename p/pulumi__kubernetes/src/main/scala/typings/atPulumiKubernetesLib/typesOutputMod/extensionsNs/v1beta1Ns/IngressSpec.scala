package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * IngressSpec describes the Ingress the user wishes to exist.
         */

trait IngressSpec extends js.Object {
  /**
               * A default backend capable of servicing requests that don't match any rule. At least one of
               * 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer
               * controller or defaulting logic to specify a global default.
               */
  val backend: IngressBackend
  /**
               * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
               * traffic is sent to the default backend.
               */
  val rules: js.Array[IngressRule]
  /**
               * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
               * members of this list specify different hosts, they will be multiplexed on the same port
               * according to the hostname specified through the SNI TLS extension, if the ingress
               * controller fulfilling the ingress supports SNI.
               */
  val tls: js.Array[IngressTLS]
}
