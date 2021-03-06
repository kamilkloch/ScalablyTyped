package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a form which is connected to a database and displays the results of SQL queries. It provides the possibility of adding new data
  * records, modifying existing ones, or deleting them.
  *
  * A database form is a special kind of enhanced database row set which provides all information for displaying the data and has more possibilities for
  * configuring the data manipulation.
  */
@js.native
trait DataForm
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.RowSet
     with Form
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XReset
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XLoadable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterBroadcaster {
  /**
    * determines if deletions of records of the form are allowed.
    *
    * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for deletions
    * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
    */
  var AllowDeletes: scala.Boolean = js.native
  /**
    * determines if insertions into the form's row set are allowed.
    *
    * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for insertions
    * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
    */
  var AllowInserts: scala.Boolean = js.native
  /**
    * determines if modifications of the current record of the form are allowed.
    *
    * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for updates
    * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
    */
  var AllowUpdates: scala.Boolean = js.native
  /** returns the kind of tabulator controlling. */
  var Cycle: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabulatorCycle = js.native
  /**
    * is used for subforms and contains the names of the columns of the subform which are related to the master fields of the parent form.
    *
    * Entries in this sequence can either denote column names in the sub form, or parameter names. ;  For instance, you could base the form on the SQL
    * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
    * the corresponding master field. ;  Alternatively, you could simply base your form on the table `invoices` , and add the column name `cust_ref` to the
    * DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
    * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
    * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
    *
    * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail form.
    *
    * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
    */
  var DetailFields: stdLib.SafeArray[java.lang.String] = js.native
  /**
    * is used for subforms and contains the names of columns of the parent form.
    *
    * These columns are typically the foreign key fields of the parent form. The values of theses columns are used to identify the data for the subform.
    * Each time the parent form changes its current row, the subform requeries it's data based on the values of the master fields.
    *
    * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
    */
  var MasterFields: stdLib.SafeArray[java.lang.String] = js.native
  /** determines how an navigation bar for this form should act. */
  var NavigationBarMode: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.NavigationBarMode = js.native
}

