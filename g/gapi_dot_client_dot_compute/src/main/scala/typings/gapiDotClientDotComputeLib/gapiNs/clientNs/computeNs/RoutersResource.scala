package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: gapiDotClientDotComputeLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[RouterAggregatedList],
    delete: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => gapiDotClientLib.gapiNs.clientNs.Request[Router],
    getRouterStatus: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => gapiDotClientLib.gapiNs.clientNs.Request[RouterStatusResponse],
    insert: gapiDotClientDotComputeLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotComputeLib.Anon_AltFieldsFilter => gapiDotClientLib.gapiNs.clientNs.Request[RouterList],
    patch: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    preview: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => gapiDotClientLib.gapiNs.clientNs.Request[RoutersPreviewResponse],
    update: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RoutersResource]
  }
}

