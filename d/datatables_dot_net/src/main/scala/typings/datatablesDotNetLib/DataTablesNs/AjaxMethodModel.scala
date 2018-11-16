package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxMethodModel extends js.Object {
  /**
           * Get the latest JSON data obtained from the last Ajax request DataTables made
           */
  def json(): js.Object = js.native
  /**
           * Get the data submitted by DataTables to the server in the last Ajax request
           */
  def params(): js.Object = js.native
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def reload(): Api = js.native
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def reload(callback: js.Function1[/* json */ js.Any, scala.Unit]): Api = js.native
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def reload(callback: js.Function1[/* json */ js.Any, scala.Unit], resetPaging: scala.Boolean): Api = js.native
  /**
           * Reload the table data from the Ajax data source
           */
  def url(): java.lang.String = js.native
  /**
           * Reload the table data from the Ajax data source
           *
           * @param url URL to set to be the Ajax data source for the table.
           */
  def url(url: java.lang.String): AjaxMethods = js.native
}
