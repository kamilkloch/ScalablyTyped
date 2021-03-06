package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobId): gapiDotClientLib.gapiNs.clientNs.Request[JobCancelResponse]
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobId): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /** Retrieves the results of a query job. */
  def getQueryResults(request: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobIdKey): gapiDotClientLib.gapiNs.clientNs.Request[GetQueryResultsResponse]
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: gapiDotClientDotBigqueryLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Job]
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: gapiDotClientDotBigqueryLib.Anon_AllUsers): gapiDotClientLib.gapiNs.clientNs.Request[JobList]
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: gapiDotClientDotBigqueryLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[QueryResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobId => gapiDotClientLib.gapiNs.clientNs.Request[JobCancelResponse],
    get: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobId => gapiDotClientLib.gapiNs.clientNs.Request[Job],
    getQueryResults: gapiDotClientDotBigqueryLib.Anon_AltFieldsJobIdKey => gapiDotClientLib.gapiNs.clientNs.Request[GetQueryResultsResponse],
    insert: gapiDotClientDotBigqueryLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Job],
    list: gapiDotClientDotBigqueryLib.Anon_AllUsers => gapiDotClientLib.gapiNs.clientNs.Request[JobList],
    query: gapiDotClientDotBigqueryLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[QueryResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), getQueryResults = js.Any.fromFunction1(getQueryResults), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[JobsResource]
  }
}

