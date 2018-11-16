package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: gapiDotClientDotStorageLib.Anon_IfMetagenerationMatchDestinationObject): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: gapiDotClientDotStorageLib.Anon_IfSourceMetagenerationMatchIfMetagenerationMatch): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: gapiDotClientDotStorageLib.Anon_IfMetagenerationMatchGeneration): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves an object or its metadata. */
  def get(request: gapiDotClientDotStorageLib.Anon_IfMetagenerationMatchProjectionGeneration): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: gapiDotClientDotStorageLib.Anon_Generation): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Stores a new object and metadata. */
  def insert(request: gapiDotClientDotStorageLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: gapiDotClientDotStorageLib.Anon_ProjectionMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: gapiDotClientDotStorageLib.Anon_IfMetagenerationMatchProjectionGenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: gapiDotClientDotStorageLib.Anon_IfSourceMetagenerationMatch): gapiDotClientLib.gapiNs.clientNs.Request[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: gapiDotClientDotStorageLib.Anon_Generation): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: gapiDotClientDotStorageLib.Anon_GenerationPrettyPrintPermissions): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: gapiDotClientDotStorageLib.Anon_IfMetagenerationMatchProjectionGenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: gapiDotClientDotStorageLib.Anon_ProjectionMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}
