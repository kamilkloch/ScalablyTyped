package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about exception (or error) that was thrown during script compilation or
  * execution.
  */
trait ExceptionDetails extends js.Object {
  /**
    * Column number of the exception location (0-based).
    */
  var columnNumber: scala.Double
  /**
    * Exception object if available.
    */
  var exception: js.UndefOr[RemoteObject] = js.undefined
  /**
    * Exception id.
    */
  var exceptionId: scala.Double
  /**
    * Identifier of the context where exception happened.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Line number of the exception location (0-based).
    */
  var lineNumber: scala.Double
  /**
    * Script ID of the exception location.
    */
  var scriptId: js.UndefOr[ScriptId] = js.undefined
  /**
    * JavaScript stack trace if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Exception text, which should be used together with exception object when available.
    */
  var text: java.lang.String
  /**
    * URL of the exception location, to be used when the script was not reported.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ExceptionDetails {
  @scala.inline
  def apply(
    columnNumber: scala.Double,
    exceptionId: scala.Double,
    lineNumber: scala.Double,
    text: java.lang.String,
    exception: RemoteObject = null,
    executionContextId: js.UndefOr[ExecutionContextId] = js.undefined,
    scriptId: ScriptId = null,
    stackTrace: StackTrace = null,
    url: java.lang.String = null
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, exceptionId = exceptionId, lineNumber = lineNumber, text = text)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (!js.isUndefined(executionContextId)) __obj.updateDynamic("executionContextId")(executionContextId)
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ExceptionDetails]
  }
}

