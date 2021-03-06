package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of setting and retrieving the position of the current cell in a grid control.
  *
  * Note that a grid control does not allow free control over the current row: In such a control, every line represents a row of data of the underlying
  * {@link com.sun.star.form.component.DataForm} . Thus, the **current row** of the grid control always equals the current row of the {@link
  * com.sun.star.form.component.DataForm} , and can be affected only by changing the latter. ;  The current column of a grid control, whoever, can be
  * freely controlled.
  * @deprecated Deprecated
  * @see com.sun.star.form.component.GridControl
  * @see com.sun.star.form.control.GridControl
  */
trait XGrid
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the current column position. */
  var CurrentColumnPosition: scala.Double
  /** retrieves the current column position. */
  def getCurrentColumnPosition(): scala.Double
  /** sets the current column position. */
  def setCurrentColumnPosition(nPos: scala.Double): scala.Unit
}

object XGrid {
  @scala.inline
  def apply(
    CurrentColumnPosition: scala.Double,
    acquire: () => scala.Unit,
    getCurrentColumnPosition: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCurrentColumnPosition: scala.Double => scala.Unit
  ): XGrid = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition, acquire = js.Any.fromFunction0(acquire), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition))
  
    __obj.asInstanceOf[XGrid]
  }
}

