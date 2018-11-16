package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Image extends js.Object {
  /** Size of the image tar.gz archive stored in Google Cloud Storage (in bytes). */
  var archiveSizeBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The deprecation status associated with this image. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Size of the image when restored onto a persistent disk (in GB). */
  var diskSizeGb: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The
               * image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
               */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of features to enable on the guest OS. Applicable for bootable images only. Currently, only one feature can be enabled, VIRTIO_SCSI_MULTIQUEUE,
               * which allows each virtual CPU to have its own queue. For Windows images, you can only enable VIRTIO_SCSI_MULTIQUEUE on images with driver version
               * 1.2.0.1621 or higher. Linux images with kernel versions 3.17 and higher will support VIRTIO_SCSI_MULTIQUEUE.
               *
               * For newer Windows images, the server might also populate this property with the value WINDOWS to indicate that this is a Windows image.
               */
  var guestOsFeatures: js.UndefOr[js.Array[GuestOsFeature]] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Encrypts the image using a customer-supplied encryption key.
               *
               * After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the
               * image).
               *
               * Customer-supplied encryption keys do not protect access to metadata of the disk.
               *
               * If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not
               * need to provide a key to use the image later.
               */
  var imageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /** [Output Only] Type of the resource. Always compute#image for images. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is
               * initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint
               * hash in order to update or change labels.
               *
               * To see the latest fingerprint, make a get() request to retrieve an image.
               */
  var labelFingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Labels to apply to this image. These can be later modified by the setLabels method. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Any applicable license URI. */
  var licenses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The parameters of the raw disk image. */
  var rawDisk: js.UndefOr[gapiDotClientDotComputeLib.Anon_Sha1Checksum] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * URL of the source disk used to create this image. This can be a full or valid partial URL. You must provide either this property or the rawDisk.source
               * property but not both to create an image. For example, the following are valid values:
               * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
               * - projects/project/zones/zone/disks/disk
               * - zones/zone/disks/disk
               */
  var sourceDisk: js.UndefOr[java.lang.String] = js.undefined
  /** The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key. */
  var sourceDiskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /**
               * The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous
               * instance of a given disk name.
               */
  var sourceDiskId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * URL of the source image used to create this image. This can be a full or valid partial URL. You must provide exactly one of:
               * - this property, or
               * - the rawDisk.source property, or
               * - the sourceDisk property   in order to create an image.
               */
  var sourceImage: js.UndefOr[java.lang.String] = js.undefined
  /** The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. */
  var sourceImageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /**
               * [Output Only] The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or
               * a previous instance of a given image name.
               */
  var sourceImageId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the image used to create this disk. The default and only value is RAW */
  var sourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully
               * created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
}
