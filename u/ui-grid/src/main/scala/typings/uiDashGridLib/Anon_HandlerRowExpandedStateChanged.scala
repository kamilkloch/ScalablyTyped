package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerRowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(
    scope: angularLib.angularMod.IScope,
    handler: uiDashGridLib.uiDashGridMod.expandableNs.rowExpandedStateChangedHandler[TEntity]
  ): scala.Unit
}

object Anon_HandlerRowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](
    rowExpandedStateChanged: (angularLib.angularMod.IScope, uiDashGridLib.uiDashGridMod.expandableNs.rowExpandedStateChangedHandler[TEntity]) => scala.Unit
  ): Anon_HandlerRowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
  
    __obj.asInstanceOf[Anon_HandlerRowExpandedStateChanged[TEntity]]
  }
}

