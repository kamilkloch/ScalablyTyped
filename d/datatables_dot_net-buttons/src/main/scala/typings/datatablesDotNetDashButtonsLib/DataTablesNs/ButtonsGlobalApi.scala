package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsGlobalApi extends js.Object {
  def apply(): ButtonsApi = js.native
  def apply(groupSelector: js.Any): ButtonsApi = js.native
  def apply(groupSelector: js.Any, buttonSelector: js.Any): ButtonsApi = js.native
  /**
           * Obtain data from a DataTable that is suitable for exporting by saving into a file or copying to clipboard.
           */
  def exportData(): ButtonsApiExportDataReturn = js.native
  /**
           * Obtain data from a DataTable that is suitable for exporting by saving into a file or copying to clipboard.
           */
  def exportData(options: ButtonsApiExportDataParameter): ButtonsApiExportDataReturn = js.native
  /**
           * Get meta information that is common to many different button types.
           */
  def exportInfo(): ButtonsApiExportInfoReturn = js.native
  /**
           * Get meta information that is common to many different button types.
           */
  def exportInfo(options: ButtonsApiExportInfoParameter): ButtonsApiExportInfoReturn = js.native
  /**
           * Display / hide an information message to the end user to indicate that something has happened.
           */
  def info(title: java.lang.String): Api = js.native
  /**
           * Display / hide an information message to the end user to indicate that something has happened.
           */
  def info(title: java.lang.String, message: java.lang.String): Api = js.native
  /**
           * Display / hide an information message to the end user to indicate that something has happened.
           */
  def info(title: java.lang.String, message: java.lang.String, time: scala.Double): Api = js.native
  /**
           * Resize the Flash movie clips to take account of the current button dimensions.
           */
  def resize(): Api = js.native
}
