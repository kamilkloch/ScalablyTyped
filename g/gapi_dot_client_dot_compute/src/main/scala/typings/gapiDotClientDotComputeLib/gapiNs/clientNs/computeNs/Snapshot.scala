package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Snapshot extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Size of the snapshot, specified in GB. */
  var diskSizeGb: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint
               * is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint
               * hash in order to update or change labels.
               *
               * To see the latest fingerprint, make a get() request to retrieve a snapshot.
               */
  var labelFingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
               * [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a
               * Windows image).
               */
  var licenses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Encrypts the snapshot using a customer-supplied encryption key.
               *
               * After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the image later For example, you must provide the
               * encryption key when you create a disk from the encrypted snapshot in a future request.
               *
               * Customer-supplied encryption keys do not protect access to metadata of the disk.
               *
               * If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do
               * not need to provide a key to use the snapshot later.
               */
  var snapshotEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /** [Output Only] The source disk used to create this snapshot. */
  var sourceDisk: js.UndefOr[java.lang.String] = js.undefined
  /** The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key. */
  var sourceDiskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /**
               * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the
               * current or a previous instance of a given disk name.
               */
  var sourceDiskId: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
               * creation/deletion.
               */
  var storageBytes: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status
               * can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
               */
  var storageBytesStatus: js.UndefOr[java.lang.String] = js.undefined
}
