package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners which are called whenever a document event (see {@link EventObject} ) occurs
  * @deprecated Deprecated
  * @see XDocumentEventBroadcaster
  */
trait XEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers the given listener
    * @param Listener listener which is interested on such events
    */
  def addEventListener(Listener: XEventListener): scala.Unit
  /**
    * unregisters the given listener
    * @param Listener listener which isn't interested on such events any longer
    */
  def removeEventListener(Listener: XEventListener): scala.Unit
}

object XEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addEventListener: XEventListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: XEventListener => scala.Unit
  ): XEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XEventBroadcaster]
  }
}

