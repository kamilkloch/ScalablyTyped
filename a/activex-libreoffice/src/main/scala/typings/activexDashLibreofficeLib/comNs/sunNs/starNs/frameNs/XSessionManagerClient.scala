package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Connect to a session manager to get information about pending desktop shutdown */
trait XSessionManagerClient
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * addSessionManagerListener registers a listener for session management events
    * @param xListener listener for session management events
    * @see XSessionManagerListener
    * @see XSessionManagerClient.removeSessionManagerListener()
    */
  def addSessionManagerListener(xListener: XSessionManagerListener): scala.Unit
  /**
    * Call cancelShutdown to try to cancel a desktop shutdown in progress
    * @returns `TRUE` if shutdown was canceled, `FALSE` else.
    */
  def cancelShutdown(): scala.Boolean
  /**
    * interactionDone is called when a listener has finished user interaction
    * @param xListener the listener done with user interaction
    * @see XSessionManagerListener
    */
  def interactionDone(xListener: XSessionManagerListener): scala.Unit
  /**
    * queryInteraction issues a request for a user interaction slot from the session manager
    * @param xListener the listener requesting user interaction
    * @see XSessionManagerListener
    */
  def queryInteraction(xListener: XSessionManagerListener): scala.Unit
  /**
    * removeSessionManagerListener deregisters a listener for session events
    * @param xListener listener to be removed
    * @see XSessionManagerListener
    * @see XSessionManagerClient.addSessionManagerListener()
    */
  def removeSessionManagerListener(xListener: XSessionManagerListener): scala.Unit
  /**
    * saveDone signals that a listener has processed a save request
    * @param xListener the listener having finished save request processing
    * @see XSessionManagerListener
    */
  def saveDone(xListener: XSessionManagerListener): scala.Unit
}

object XSessionManagerClient {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addSessionManagerListener: XSessionManagerListener => scala.Unit,
    cancelShutdown: () => scala.Boolean,
    interactionDone: XSessionManagerListener => scala.Unit,
    queryInteraction: XSessionManagerListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSessionManagerListener: XSessionManagerListener => scala.Unit,
    saveDone: XSessionManagerListener => scala.Unit
  ): XSessionManagerClient = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSessionManagerListener = js.Any.fromFunction1(addSessionManagerListener), cancelShutdown = js.Any.fromFunction0(cancelShutdown), interactionDone = js.Any.fromFunction1(interactionDone), queryInteraction = js.Any.fromFunction1(queryInteraction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSessionManagerListener = js.Any.fromFunction1(removeSessionManagerListener), saveDone = js.Any.fromFunction1(saveDone))
  
    __obj.asInstanceOf[XSessionManagerClient]
  }
}

