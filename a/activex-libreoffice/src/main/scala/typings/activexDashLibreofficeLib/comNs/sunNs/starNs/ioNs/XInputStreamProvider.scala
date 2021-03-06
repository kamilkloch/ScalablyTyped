package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for providing an input stream.
  *
  * Every time {@link createInputStream()} is called a new input stream is returned, always pointing to the begin of the same data. All input streams
  * returned by {@link createInputStream()} are completely independent from each other.
  */
trait XInputStreamProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates a new input stream, every time providing the same data.
    * @returns a new input stream
    */
  def createInputStream(): XInputStream
}

object XInputStreamProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createInputStream: () => XInputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInputStreamProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInputStream = js.Any.fromFunction0(createInputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInputStreamProvider]
  }
}

