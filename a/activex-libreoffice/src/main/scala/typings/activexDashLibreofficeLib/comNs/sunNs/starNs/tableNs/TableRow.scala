package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a special cell range containing all cells of a single specific row in a table or spreadsheet. */
trait TableRow
  extends XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * contains the height of the row (in 1/100 mm).
    *
    * When hidden, it returns the height which the row would have, if it were visible.
    */
  var Height: scala.Double
  /** is `TRUE` , if there is a manual vertical page break attached to the row. */
  var IsStartOfNewPage: scala.Boolean
  /** is `TRUE` , if the row is visible. */
  var IsVisible: scala.Boolean
  /** is `TRUE` , if the row always keeps its optimal height. */
  var OptimalHeight: scala.Boolean
}

object TableRow {
  @scala.inline
  def apply(
    Height: scala.Double,
    IsStartOfNewPage: scala.Boolean,
    IsVisible: scala.Boolean,
    OptimalHeight: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getCellByPosition: (scala.Double, scala.Double) => XCell,
    getCellRangeByName: java.lang.String => XCellRange,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double) => XCellRange,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): TableRow = {
    val __obj = js.Dynamic.literal(Height = Height, IsStartOfNewPage = IsStartOfNewPage, IsVisible = IsVisible, OptimalHeight = OptimalHeight, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TableRow]
  }
}

