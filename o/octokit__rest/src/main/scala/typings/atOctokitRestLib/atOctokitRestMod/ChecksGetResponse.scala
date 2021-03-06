package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponse extends js.Object {
  var app: ChecksGetResponseApp
  var check_suite: ChecksGetResponseCheckSuite
  var completed_at: java.lang.String
  var conclusion: java.lang.String
  var details_url: java.lang.String
  var external_id: java.lang.String
  var head_sha: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var output: ChecksGetResponseOutput
  var pull_requests: js.Array[ChecksGetResponsePullRequestsItem]
  var started_at: java.lang.String
  var status: java.lang.String
  var url: java.lang.String
}

object ChecksGetResponse {
  @scala.inline
  def apply(
    app: ChecksGetResponseApp,
    check_suite: ChecksGetResponseCheckSuite,
    completed_at: java.lang.String,
    conclusion: java.lang.String,
    details_url: java.lang.String,
    external_id: java.lang.String,
    head_sha: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    output: ChecksGetResponseOutput,
    pull_requests: js.Array[ChecksGetResponsePullRequestsItem],
    started_at: java.lang.String,
    status: java.lang.String,
    url: java.lang.String
  ): ChecksGetResponse = {
    val __obj = js.Dynamic.literal(app = app, check_suite = check_suite, completed_at = completed_at, conclusion = conclusion, details_url = details_url, external_id = external_id, head_sha = head_sha, html_url = html_url, id = id, name = name, node_id = node_id, output = output, pull_requests = pull_requests, started_at = started_at, status = status, url = url)
  
    __obj.asInstanceOf[ChecksGetResponse]
  }
}

