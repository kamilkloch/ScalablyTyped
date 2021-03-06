package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier2 extends XEmbeddedObjectSupplier {
  /** allows to control the aspect of the object. */
  var Aspect: scala.Double
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject
}

object XEmbeddedObjectSupplier2 {
  @scala.inline
  def apply(
    Aspect: scala.Double,
    EmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    ExtendedControlOverEmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject,
    ReplacementGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    acquire: () => scala.Unit,
    getEmbeddedObject: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    getExtendedControlOverEmbeddedObject: () => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEmbeddedObjectSupplier2 = {
    val __obj = js.Dynamic.literal(Aspect = Aspect, EmbeddedObject = EmbeddedObject, ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject, ReplacementGraphic = ReplacementGraphic, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getExtendedControlOverEmbeddedObject = js.Any.fromFunction0(getExtendedControlOverEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
}

