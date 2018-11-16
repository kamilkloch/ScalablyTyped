package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Service is a named abstraction of software service (for example, mysql) consisting of local
         * port (for example 3306) that the proxy listens on, and the selector that determines which
         * pods will answer requests sent through the proxy.
         */

trait Service extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * Standard object's metadata. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * Spec defines the behavior of a service.
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val spec: ServiceSpec
  /**
               * Most recently observed status of the service. Populated by the system. Read-only. More
               * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val status: ServiceStatus
}
