package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery extends js.Object {
  var current: java.lang.String
  var queries: js.Array[java.lang.String]
  def atLeast(size: java.lang.String): scala.Boolean
  def get(size: java.lang.String): java.lang.String
}

object MediaQuery {
  @scala.inline
  def apply(
    atLeast: java.lang.String => scala.Boolean,
    current: java.lang.String,
    get: java.lang.String => java.lang.String,
    queries: js.Array[java.lang.String]
  ): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current, get = js.Any.fromFunction1(get), queries = queries)
  
    __obj.asInstanceOf[MediaQuery]
  }
}

