package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies methods for obtaining information on a content in different levels.
  *
  * For example, if there is a cursor which points to XContents, this interface could be used to give the user access to the content under the cursor. If
  * the client only needs the identifier string of the content, there is no need to first create the content object, then to obtain the string from it and
  * after that to release the content.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the content ( "most expensive method" ).
    * @returns the content.
    */
  def queryContent(): XContent
  /**
    * returns the identifier object of the content.
    * @returns the identifier object.
    */
  def queryContentIdentifier(): XContentIdentifier
  /**
    * returns the identifier string of the content ( "cheap method" ).
    *
    * Note that this string can be used later to recreate the content.
    * @returns the identifier string.
    */
  def queryContentIdentifierString(): java.lang.String
}

object XContentAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryContent: () => XContent,
    queryContentIdentifier: () => XContentIdentifier,
    queryContentIdentifierString: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XContentAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryContent = js.Any.fromFunction0(queryContent), queryContentIdentifier = js.Any.fromFunction0(queryContentIdentifier), queryContentIdentifierString = js.Any.fromFunction0(queryContentIdentifierString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContentAccess]
  }
}

