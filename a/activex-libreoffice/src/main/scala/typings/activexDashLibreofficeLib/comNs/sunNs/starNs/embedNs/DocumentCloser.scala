package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main task of this service is to close an office document frame embedded in an application running in another process correctly.
  *
  * The usual usage of this service is to create it, initialize with document frame, and to dispose the service. While disposing the service will do all
  * the required actions to let the frame be closed using com::sun::star::util::XCloseable::close( true ). Thus in case there is a code that prevents
  * closing of the frame the code automatically becomes the owner of the frame.
  *
  * In addition the code will disconnect the VCL window the frame is based on from the container system window.
  */
trait DocumentCloser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * is used to initialize the object on it's creation.
    * @param xFrame the frame of the document that should be closed.
    */
  def DocumentCloserCtor1(xFrame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame): scala.Unit
}

object DocumentCloser {
  @scala.inline
  def apply(
    DocumentCloserCtor1: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame => scala.Unit,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): DocumentCloser = {
    val __obj = js.Dynamic.literal(DocumentCloserCtor1 = js.Any.fromFunction1(DocumentCloserCtor1), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[DocumentCloser]
  }
}

