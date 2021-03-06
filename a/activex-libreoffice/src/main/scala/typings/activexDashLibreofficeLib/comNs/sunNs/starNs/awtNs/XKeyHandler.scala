package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This key handler is similar to {@link com.sun.star.awt.XKeyListener} but allows the consumption of key events. If a key event is consumed by one
  * handler both the following handlers, with respect to the list of key handlers of the broadcaster, and a following handling by the broadcaster will not
  * take place.
  * @since OOo 1.1.2
  */
trait XKeyHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * This function is called by the broadcaster, an {@link com.sun.star.awt.XExtendedToolkit} for instance, after a key has been pressed but before it is
    * released. The return value decides about whether other handlers will be called and a handling by the broadcaster will take place.
    *
    * Consume the event if the action performed by the implementation is mutually exclusive with the default action of the broadcaster or, when known, with
    * that of other handlers.
    *
    * Consuming this event does not prevent the pending key-release event from being broadcasted.
    * @param aEvent The key event informs about the pressed key.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def keyPressed(aEvent: KeyEvent): scala.Boolean
  /**
    * This function is called by the broadcaster, an {@link com.sun.star.awt.XExtendedToolkit} for instance, after a key has been pressed and released. The
    * return value decides about whether other handlers will be called and a handling by the broadcaster will take place.
    *
    * Consume the event if the action performed by the implementation is mutually exclusive with the default action of the broadcaster or, when known, with
    * that of other handlers.
    * @param aEvent The key event informs about the pressed key.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def keyReleased(aEvent: KeyEvent): scala.Boolean
}

object XKeyHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    keyPressed: KeyEvent => scala.Boolean,
    keyReleased: KeyEvent => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XKeyHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XKeyHandler]
  }
}

