package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResource extends js.Object {
  def id(value: java.lang.String): PutResource = js.native
  def request(params: js.Object): js.Promise[PutResponse] = js.native
  def request(
    params: js.Object,
    callback: js.Function2[/* error */ stdLib.Error, /* res */ PutResponse, scala.Unit]
  ): js.Promise[PutResponse] = js.native
}

