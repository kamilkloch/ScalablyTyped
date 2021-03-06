package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An enumeration for a set of annotations. */
trait XAnnotationEnumeration extends js.Object {
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): scala.Boolean
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextElement(): XAnnotation
}

object XAnnotationEnumeration {
  @scala.inline
  def apply(hasMoreElements: () => scala.Boolean, nextElement: () => XAnnotation): XAnnotationEnumeration = {
    val __obj = js.Dynamic.literal(hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement))
  
    __obj.asInstanceOf[XAnnotationEnumeration]
  }
}

