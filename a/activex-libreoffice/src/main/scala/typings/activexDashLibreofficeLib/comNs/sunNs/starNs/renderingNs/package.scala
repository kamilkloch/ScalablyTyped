package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderingNs {
  type Canvas = XCanvas
  /**
    * The {@link CanvasFactory} is used to create the {@link Canvas} objects, evaluating the user's configuration preferences from
    *
    * `/org.openoffice.VCL/Settings/Canvas/PreferredServices` .
    *
    * The latter specifies a string list of service names to use.
    *
    * Instantiating this service, you can use its {@link com.sun.star.lang.XMultiComponentFactory} interface to create {@link Canvas} objects, passing an
    * empty string as service specifier (default). If you want to manually override the configured service list, you can pass a service name to try first.
    * @since OOo 2.0
    */
  type CanvasFactory = activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiComponentFactory
  type Color = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent]
  type ColorComponent = scala.Double
  /**
    * This exception indicates an invalid volatile bitmap content.
    *
    * When accessing or rendering {@link XVolatileBitmap} data, that has been invalidated by the system, this exception will be thrown.
    * @since OOo 2.0
    */
  type VolatileContentDestroyedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
}
