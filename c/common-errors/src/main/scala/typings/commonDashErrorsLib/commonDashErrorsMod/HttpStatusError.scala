package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "HttpStatusError")
@js.native
class HttpStatusError protected () extends ErrorConstructor {
  /**
    * @param err any instanceof Error
    * @param req the request object
    */
  def this(err: Error) = this()
  /**
    * Figure out a proper status code and message from a given error. To
    * change the mappings, modify HttpStatusError.message_map and
    * HttpStatusError.code_map
    *
    * @param status_code any HTTP status code integer
    * @param message     any message
    */
  def this(status_code: scala.Double) = this()
  def this(err: Error, req: expressLib.expressMod.Request) = this()
  def this(status_code: scala.Double, message: java.lang.String) = this()
  /**
    * Status code for this error.
    */
  var statusCode: scala.Double = js.native
}

