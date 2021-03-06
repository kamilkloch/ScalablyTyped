package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * additional interfaces for dispatch objects: allow to execute with return value
  * @see XDispatch
  * @since OOo 2.0
  */
trait XSynchronousDispatch
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * dispatches a URL synchronously and offers a return values
    *
    * After getting a dispatch object as a result of a queryDispatch call, this interface can be used to dispatch the URL synchronously and with a return
    * value.
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request They depend on the real implementation of the dispatch object.
    */
  def dispatchWithReturnValue(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): js.Any
}

object XSynchronousDispatch {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    dispatchWithReturnValue: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSynchronousDispatch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispatchWithReturnValue = js.Any.fromFunction2(dispatchWithReturnValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSynchronousDispatch]
  }
}

