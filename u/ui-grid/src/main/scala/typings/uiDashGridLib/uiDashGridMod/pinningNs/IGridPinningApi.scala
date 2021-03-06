package typings
package uiDashGridLib.uiDashGridMod.pinningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPinningApi[TEntity] extends js.Object {
  // Events
  /**
    * raised when column pin state has changed
    * @param {ng.IScope} scope The grid scope
    * @param {columnPinHandler} handler Callback
    */
  def columnPin(scope: angularLib.angularMod.IScope, handler: columnPinHandler): scala.Unit
  // Methods
  /**
    * Pin column left, right, or none
    * @param {IGridColumn} col The column being pinned
    * @param {string} container One of the recognized container types from uiGridPinningConstants
    */
  def pinColumn(col: uiDashGridLib.uiDashGridMod.IGridColumnOf[TEntity], container: java.lang.String): scala.Unit
}

object IGridPinningApi {
  @scala.inline
  def apply[TEntity](
    columnPin: (angularLib.angularMod.IScope, columnPinHandler) => scala.Unit,
    pinColumn: (uiDashGridLib.uiDashGridMod.IGridColumnOf[TEntity], java.lang.String) => scala.Unit
  ): IGridPinningApi[TEntity] = {
    val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
  
    __obj.asInstanceOf[IGridPinningApi[TEntity]]
  }
}

