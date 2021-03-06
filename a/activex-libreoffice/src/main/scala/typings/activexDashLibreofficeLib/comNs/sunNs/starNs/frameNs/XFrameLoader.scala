package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * load components into a frame
  *
  * It's an asynchronous loading. For synchronous processes use {@link XSynchronousFrameLoader} instead of this one. The generic load algorithm of the
  * office supports both ones - but preferred the synchronous interface.
  * @see XFrame
  */
trait XFrameLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * cancels the loading process.
    *
    * After returning from this call, neither the frame nor the load-event-listener specified in {@link XFrameLoader.load()} may be called back. Because
    * only the owner of this process who called load method before can cancel this process. And he doesn't need any notification about that. On the other
    * hand - nobody then this owner himself can be registered as an {@link XLoadEventListener} here.
    */
  def cancel(): scala.Unit
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Frame specifies the loading target
    * @param URL describes the resource of loading component Support of special protocols are implementation details and depends from the environment.
    * @param Arguments optional arguments for loading (see {@link com.sun.star.document.MediaDescriptor} for further information)
    * @param Listener this listener will be informed about success
    * @see XLoadEventListener
    */
  def load(
    Frame: XFrame,
    URL: java.lang.String,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Listener: XLoadEventListener
  ): scala.Unit
}

object XFrameLoader {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    load: (XFrame, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], XLoadEventListener) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFrameLoader = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), load = js.Any.fromFunction4(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFrameLoader]
  }
}

