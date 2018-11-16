package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
         * be dynamically provisioned.
         *
         * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
         * ObjectMeta.Name.
         */

trait StorageClass extends js.Object {
  /**
               * AllowVolumeExpansion shows whether the storage class allow volume expand
               */
  val allowVolumeExpansion: scala.Boolean
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
               * Dynamically provisioned PersistentVolumes of this storage class are created with these
               * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
               * is invalid.
               */
  val mountOptions: js.Array[java.lang.String]
  /**
               * Parameters holds the parameters for the provisioner that should create volumes of this
               * storage class.
               */
  val parameters: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
               * Provisioner indicates the type of the provisioner.
               */
  val provisioner: java.lang.String
  /**
               * Dynamically provisioned PersistentVolumes of this storage class are created with this
               * reclaimPolicy. Defaults to Delete.
               */
  val reclaimPolicy: java.lang.String
  /**
               * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
               * When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored
               * by servers that enable the VolumeScheduling feature.
               */
  val volumeBindingMode: java.lang.String
}
