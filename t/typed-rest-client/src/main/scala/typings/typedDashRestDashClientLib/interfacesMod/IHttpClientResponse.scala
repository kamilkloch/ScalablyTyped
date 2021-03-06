package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpClientResponse extends js.Object {
  var message: nodeLib.httpMod.IncomingMessage
  def readBody(): js.Promise[java.lang.String]
}

object IHttpClientResponse {
  @scala.inline
  def apply(message: nodeLib.httpMod.IncomingMessage, readBody: () => js.Promise[java.lang.String]): IHttpClientResponse = {
    val __obj = js.Dynamic.literal(message = message, readBody = js.Any.fromFunction0(readBody))
  
    __obj.asInstanceOf[IHttpClientResponse]
  }
}

