package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListReposWatchedByUserResponseItemLicense extends js.Object {
  var key: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var spdx_id: java.lang.String
  var url: java.lang.String
}

object ActivityListReposWatchedByUserResponseItemLicense {
  @scala.inline
  def apply(
    key: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    spdx_id: java.lang.String,
    url: java.lang.String
  ): ActivityListReposWatchedByUserResponseItemLicense = {
    val __obj = js.Dynamic.literal(key = key, name = name, node_id = node_id, spdx_id = spdx_id, url = url)
  
    __obj.asInstanceOf[ActivityListReposWatchedByUserResponseItemLicense]
  }
}

