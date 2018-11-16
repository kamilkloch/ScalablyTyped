package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to serialize a DOM tree or subtree to a string representation. */

trait IXmlNodeSerializer extends js.Object {
  /** Gets and sets the text from inside the XML. */
  var innerText: java.lang.String
  /**
                       * Returns the XML representation of the node and all its descendants.
                       * @return The XML representation of the node and all its descendants.
                       */
  def getXml(): java.lang.String
}
