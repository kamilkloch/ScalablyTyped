package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSessionManagerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * approveInteraction is called when an outstanding interaction request was processed by the session manager
    * @param bInteractionGranted If `FALSE` the listener must not interact with the user. If `TRUE` the listener can interact with the user now. After interac
    * @see XSessionManagerClient
    * @see XSessionManagerClient.interactionDone()
    */
  def approveInteraction(bInteractionGranted: scala.Boolean): scala.Unit
  /** returns true, if a session was restored */
  def doRestore(): scala.Boolean
  /**
    * doSave gets called when a save event was issued by the session manager the listener should do what is necessary to restore the current state of the
    * application
    *
    * If the listener desires to interact with the user it must first issue a user interaction request and only do so if interaction was granted
    *
    * When the save request is processed (with or without user interaction) the listener must call {@link XSessionManagerClient.saveDone()} on the session
    * manager client service object.
    * @param bShutdown `TRUE` if a shutdown is in progress, `FALSE` if just a save point was requested
    * @param bCancelable `TRUE` if a shutdown in progress can be canceled by the listener, `FALSE` else  the listener may choose to ignore the saveDone() even
    * @see XSessionManagerClient
    * @see XSessionManagerClient.saveDone()
    */
  def doSave(bShutdown: scala.Boolean, bCancelable: scala.Boolean): scala.Unit
  /**
    * shutdownCanceled is called when a shutdown was canceled by the user The listener can cancel his saving operations. No further interaction is necessary
    * and further calls on the session manager client service object will be ignored.
    */
  def shutdownCanceled(): scala.Unit
}

object XSessionManagerListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    approveInteraction: scala.Boolean => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    doRestore: () => scala.Boolean,
    doSave: (scala.Boolean, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    shutdownCanceled: () => scala.Unit
  ): XSessionManagerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), disposing = js.Any.fromFunction1(disposing), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
  
    __obj.asInstanceOf[XSessionManagerListener]
  }
}

