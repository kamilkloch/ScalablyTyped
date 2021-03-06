package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedNamedQueryId extends js.Object {
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
}

object UnprocessedNamedQueryId {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, NamedQueryId: NamedQueryId = null): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId)
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
}

