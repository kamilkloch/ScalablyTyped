package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disk extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Encrypts the disk using a customer-supplied encryption key.
    *
    * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later (e.g. to create a disk snapshot or an
    * image, or to attach the disk to a virtual machine).
    *
    * Customer-supplied encryption keys do not protect access to metadata of the disk.
    *
    * If you do not provide an encryption key when creating the disk, then the disk will be encrypted using an automatically generated key and you do not
    * need to provide a key to use the disk later.
    */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#disk for disks. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is
    * initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint
    * hash in order to update or change labels.
    *
    * To see the latest fingerprint, make a get() request to retrieve a disk.
    */
  var labelFingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Labels to apply to this disk. These can be later modified by the setLabels method. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** [Output Only] Last attach timestamp in RFC3339 text format. */
  var lastAttachTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Last detach timestamp in RFC3339 text format. */
  var lastDetachTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** Any applicable publicly visible licenses. */
  var licenses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Internal use only. */
  var options: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size of the persistent disk, specified in GB. You can specify this field when creating a persistent disk using the sourceImage or sourceSnapshot
    * parameter, or specify it alone to create an empty persistent disk.
    *
    * If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb must not be less than the size of the sourceImage or the size
    * of the snapshot. Acceptable values are 1 to 65536, inclusive.
    */
  var sizeGb: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The source image used to create this disk. If the source image is deleted, this field will not be set.
    *
    * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-8 to use the
    * latest Debian 8 image:
    *
    * projects/debian-cloud/global/images/family/debian-8
    *
    * Alternatively, use a specific version of a public operating system image:
    *
    * projects/debian-cloud/global/images/debian-8-jessie-vYYYYMMDD
    *
    * To create a disk with a private image that you created, specify the image name in the following format:
    *
    * global/images/my-private-image
    *
    * You can also specify a private image by its image family, which returns the latest version of the image in that family. Replace the image name with
    * family/family-name:
    *
    * global/images/family/my-private-family
    */
  var sourceImage: js.UndefOr[java.lang.String] = js.undefined
  /** The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. */
  var sourceImageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /**
    * [Output Only] The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk.
    * For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would
    * identify the exact version of the image that was used.
    */
  var sourceImageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid
    * values:
    * - https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot
    * - projects/project/global/snapshots/snapshot
    * - global/snapshots/snapshot
    */
  var sourceSnapshot: js.UndefOr[java.lang.String] = js.undefined
  /** The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key. */
  var sourceSnapshotEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /**
    * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent
    * disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID
    * would identify the exact version of the snapshot that was used.
    */
  var sourceSnapshotId: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The status of disk creation. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance */
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] URL of the zone where the disk resides. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Disk {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    diskEncryptionKey: CustomerEncryptionKey = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labelFingerprint: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    lastAttachTimestamp: java.lang.String = null,
    lastDetachTimestamp: java.lang.String = null,
    licenses: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    options: java.lang.String = null,
    selfLink: java.lang.String = null,
    sizeGb: java.lang.String = null,
    sourceImage: java.lang.String = null,
    sourceImageEncryptionKey: CustomerEncryptionKey = null,
    sourceImageId: java.lang.String = null,
    sourceSnapshot: java.lang.String = null,
    sourceSnapshotEncryptionKey: CustomerEncryptionKey = null,
    sourceSnapshotId: java.lang.String = null,
    status: java.lang.String = null,
    `type`: java.lang.String = null,
    users: js.Array[java.lang.String] = null,
    zone: java.lang.String = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (diskEncryptionKey != null) __obj.updateDynamic("diskEncryptionKey")(diskEncryptionKey)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lastAttachTimestamp != null) __obj.updateDynamic("lastAttachTimestamp")(lastAttachTimestamp)
    if (lastDetachTimestamp != null) __obj.updateDynamic("lastDetachTimestamp")(lastDetachTimestamp)
    if (licenses != null) __obj.updateDynamic("licenses")(licenses)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb)
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage)
    if (sourceImageEncryptionKey != null) __obj.updateDynamic("sourceImageEncryptionKey")(sourceImageEncryptionKey)
    if (sourceImageId != null) __obj.updateDynamic("sourceImageId")(sourceImageId)
    if (sourceSnapshot != null) __obj.updateDynamic("sourceSnapshot")(sourceSnapshot)
    if (sourceSnapshotEncryptionKey != null) __obj.updateDynamic("sourceSnapshotEncryptionKey")(sourceSnapshotEncryptionKey)
    if (sourceSnapshotId != null) __obj.updateDynamic("sourceSnapshotId")(sourceSnapshotId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (users != null) __obj.updateDynamic("users")(users)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Disk]
  }
}

