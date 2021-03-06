package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference to an IMemoryBuffer object. */
trait IMemoryBufferReference extends IClosable {
  /** Gets the size of the memory buffer in bytes. */
  var capacity: scala.Double
}

object IMemoryBufferReference {
  @scala.inline
  def apply(capacity: scala.Double, close: () => scala.Unit): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity, close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[IMemoryBufferReference]
  }
}

