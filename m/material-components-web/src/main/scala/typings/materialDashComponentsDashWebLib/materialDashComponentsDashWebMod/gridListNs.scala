package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "gridList")
@js.native
object gridListNs extends js.Object {
  @js.native
  class MDCGridList ()
    extends atMaterialGridDashListLib.gridDashListMod.MDCGridList
  
  @js.native
  class MDCGridListFoundation ()
    extends atMaterialGridDashListLib.gridDashListMod.MDCGridListFoundation
  
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialGridDashListLib.gridDashListMod.MDCGridList = js.native
  }
  
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: atMaterialGridDashListLib.adapterMod.MDCGridListAdapter = js.native
    val strings: atMaterialGridDashListLib.constantsMod.strings = js.native
  }
  
}
