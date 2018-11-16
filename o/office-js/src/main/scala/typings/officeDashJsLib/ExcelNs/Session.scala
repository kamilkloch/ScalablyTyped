package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides connection session for a remote workbook.
     */
@JSGlobal("Excel.Session")
@js.native
class Session () extends js.Object {
  def this(workbookUrl: java.lang.String) = this()
  def this(workbookUrl: java.lang.String, requestHeaders: ScalablyTyped.runtime.StringDictionary[java.lang.String]) = this()
  def this(workbookUrl: java.lang.String, requestHeaders: ScalablyTyped.runtime.StringDictionary[java.lang.String], persisted: scala.Boolean) = this()
  /**
           * Close the session.
           */
  def close(): stdLib.Promise[scala.Unit] = js.native
}

/**
     * Provides connection session for a remote workbook.
     */
@JSGlobal("Excel.Session")
@js.native
object Session extends js.Object {
  var WorkbookSessionIdHeaderName: js.Any = js.native
  var WorkbookSessionIdHeaderNameLower: js.Any = js.native
}
