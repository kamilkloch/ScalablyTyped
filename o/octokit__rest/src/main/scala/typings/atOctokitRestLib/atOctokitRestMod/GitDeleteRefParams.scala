package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeleteRefParams extends js.Object {
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
}

object GitDeleteRefParams {
  @scala.inline
  def apply(owner: java.lang.String, ref: java.lang.String, repo: java.lang.String): GitDeleteRefParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[GitDeleteRefParams]
  }
}

