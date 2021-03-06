package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to implement objects which may be loaded.
  *
  * The object is typically implemented by high-level objects which can connect to a data source.
  * @see XLoadListener
  */
trait XLoadable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive load-related events
    * @param aListener the listener to add.
    */
  def addLoadListener(aListener: XLoadListener): scala.Unit
  /** returns if the object is in loaded state. */
  def isLoaded(): scala.Boolean
  /**
    * loads the data.
    *
    * If the data is already loaded (->isLoaded), then the method returns silently. In this case, you should use ->reload.
    */
  def load(): scala.Unit
  /**
    * does a smart refresh of the object.
    *
    * The final state will be the same as if unload and load were called, but reload is the more efficient way to do the same. If the object isn't loaded,
    * nothing happens.
    */
  def reload(): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    */
  def removeLoadListener(aListener: XLoadListener): scala.Unit
  /** unloads the data. */
  def unload(): scala.Unit
}

object XLoadable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addLoadListener: XLoadListener => scala.Unit,
    isLoaded: () => scala.Boolean,
    load: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: () => scala.Unit,
    removeLoadListener: XLoadListener => scala.Unit,
    unload: () => scala.Unit
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLoadListener = js.Any.fromFunction1(addLoadListener), isLoaded = js.Any.fromFunction0(isLoaded), load = js.Any.fromFunction0(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeLoadListener = js.Any.fromFunction1(removeLoadListener), unload = js.Any.fromFunction0(unload))
  
    __obj.asInstanceOf[XLoadable]
  }
}

