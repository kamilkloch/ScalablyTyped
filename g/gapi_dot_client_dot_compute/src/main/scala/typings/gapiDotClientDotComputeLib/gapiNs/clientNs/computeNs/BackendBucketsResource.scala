package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltBackendBucket): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltBackendBucketFields): gapiDotClientLib.gapiNs.clientNs.Request[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BackendBucketList]
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltBackendBucket): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: gapiDotClientDotComputeLib.Anon_AltBackendBucket): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object BackendBucketsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotComputeLib.Anon_AltBackendBucket => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotComputeLib.Anon_AltBackendBucketFields => gapiDotClientLib.gapiNs.clientNs.Request[BackendBucket],
    insert: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotComputeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BackendBucketList],
    patch: gapiDotClientDotComputeLib.Anon_AltBackendBucket => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    update: gapiDotClientDotComputeLib.Anon_AltBackendBucket => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BackendBucketsResource]
  }
}

