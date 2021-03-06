package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListEmployeeWagesRequest")
@js.native
class ListEmployeeWagesRequest () extends js.Object {
  /**
    * Pointer to the next page of Employee Wage results to fetch.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Filter wages returned to only those that are associated with the specified employee.
    */
  var employee_id: js.UndefOr[java.lang.String] = js.native
  /**
    * Maximum number of Employee Wages to return per page. Can range between 1 and 200. The default is the maximum at
    * 200.
    */
  var limit: js.UndefOr[scala.Double] = js.native
}

