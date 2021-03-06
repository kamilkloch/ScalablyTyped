package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility to write changes made on a result set back to database. */
trait XResultSetUpdate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * cancels the updates made to a row.
    *
    * This method may be called after calling an `updateXXX` method(s) and before calling {@link com.sun.star.sdbc.XResultSetUpdate.updateRow()} to rollback
    * the updates made to a row. If no updates have been made or `updateRow` has already been called, then this method has no effect.
    * @throws SQLException if a database access error occurs.
    */
  def cancelRowUpdates(): scala.Unit
  /**
    * deletes the current row from the result set and the underlying database. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def deleteRow(): scala.Unit
  /**
    * inserts the contents of the insert row into the result set and the database. Must be on the insert row when this method is called.
    * @throws SQLException if a database access error occurs.
    */
  def insertRow(): scala.Unit
  /**
    * moves the cursor to the remembered cursor position, usually the current row. This method has no effect if the cursor is not on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def moveToCurrentRow(): scala.Unit
  /**
    * moves the cursor to the insert row. The current cursor position is remembered while the cursor is positioned on the insert row.
    *
    * The insert row is a special row associated with an updatable result set. It is essentially a buffer where a new row may be constructed by calling the
    * `updateXXX` methods prior to inserting the row into the result set.
    *
    * Only the `updateXXX` , `getXXX` , and {@link com.sun.star.sdbc.XResultSetUpdate.insertRow()} methods may be called when the cursor is on the insert
    * row. All of the columns in a result set must be given a value each time this method is called before calling `insertRow` . The method `updateXXX` must
    * be called before a `getXXX` method can be called on a column value.
    * @throws SQLException if a database access error occurs.
    */
  def moveToInsertRow(): scala.Unit
  /**
    * updates the underlying database with the new contents of the current row. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def updateRow(): scala.Unit
}

object XResultSetUpdate {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    cancelRowUpdates: () => scala.Unit,
    deleteRow: () => scala.Unit,
    insertRow: () => scala.Unit,
    moveToCurrentRow: () => scala.Unit,
    moveToInsertRow: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateRow: () => scala.Unit
  ): XResultSetUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelRowUpdates = js.Any.fromFunction0(cancelRowUpdates), deleteRow = js.Any.fromFunction0(deleteRow), insertRow = js.Any.fromFunction0(insertRow), moveToCurrentRow = js.Any.fromFunction0(moveToCurrentRow), moveToInsertRow = js.Any.fromFunction0(moveToInsertRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateRow = js.Any.fromFunction0(updateRow))
  
    __obj.asInstanceOf[XResultSetUpdate]
  }
}

