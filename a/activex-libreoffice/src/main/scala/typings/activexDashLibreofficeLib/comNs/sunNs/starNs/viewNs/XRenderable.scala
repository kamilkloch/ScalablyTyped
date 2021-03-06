package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be rendered.
  * @since OOo 1.1.2
  */
trait XRenderable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns a descriptor of the specific renderer.  returns the specific renderer properties based on the given selection.  If the selection contains a valid
    * @see RenderDescriptor
    * @see RenderOptions
    */
  def getRenderer(
    nRenderer: scala.Double,
    aSelection: js.Any,
    xOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * @returns the count of renderers (based on paper count of a document, for example).  If a selection is given, the count has to be calculated based on this
    * @see RenderOptions
    */
  def getRendererCount(
    aSelection: js.Any,
    xOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Double
  /**
    * renders the object.
    *
    * renders the object with the specific renderer based on the given selection.
    *
    * If the selection contains a valid XModel interface, it is assumed that the whole document should be rendered. If the selection is empty, nothing
    * should be rendered.
    * @see RenderOptions
    */
  def render(
    nRenderer: scala.Double,
    aSelection: js.Any,
    xOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XRenderable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getRenderer: (scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getRendererCount: (js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    render: (scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit
  ): XRenderable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRenderer = js.Any.fromFunction3(getRenderer), getRendererCount = js.Any.fromFunction2(getRendererCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction3(render))
  
    __obj.asInstanceOf[XRenderable]
  }
}

