package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.pinningNs

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
  def columnPin(scope: angularLib.angularMod.angularNs.IScope, handler: columnPinHandler): scala.Unit
  // Methods
  /**
               * Pin column left, right, or none
               * @param {IGridColumn} col The column being pinned
               * @param {string} container One of the recognized container types from uiGridPinningConstants
               */
  def pinColumn(col: uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity], container: java.lang.String): scala.Unit
}
