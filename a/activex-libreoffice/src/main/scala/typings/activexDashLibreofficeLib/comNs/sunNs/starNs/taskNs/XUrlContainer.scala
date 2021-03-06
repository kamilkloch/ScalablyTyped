package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to store and retrieve URLs. URLs can be stored persistently or until end of OOo session.
  * @since OOo 3.2
  */
trait XUrlContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add a URL to the container.
    * @param Url URL to add to the container
    * @param MakePersistent indicates whether the URL shall be stored persistently or just in memory (until end of OOo session)
    */
  def addUrl(Url: java.lang.String, MakePersistent: scala.Boolean): scala.Unit
  /**
    * Lookup a URL in the container.
    * @param Url URL to lookup.
    * @returns Best matched URL or empty string.
    */
  def findUrl(Url: java.lang.String): java.lang.String
  /**
    * Get all URLs.
    * @param OnlyPersistent Only URLs that are stored persistently shall be returned.
    * @returns List of URLs.
    */
  def getUrls(OnlyPersistent: scala.Boolean): stdLib.SafeArray[java.lang.String]
  /**
    * Remove a URL from the container.
    * @param Url URL to remove.
    */
  def removeUrl(Url: java.lang.String): scala.Unit
}

object XUrlContainer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addUrl: (java.lang.String, scala.Boolean) => scala.Unit,
    findUrl: java.lang.String => java.lang.String,
    getUrls: scala.Boolean => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeUrl: java.lang.String => scala.Unit
  ): XUrlContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUrl = js.Any.fromFunction2(addUrl), findUrl = js.Any.fromFunction1(findUrl), getUrls = js.Any.fromFunction1(getUrls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUrl = js.Any.fromFunction1(removeUrl))
  
    __obj.asInstanceOf[XUrlContainer]
  }
}

