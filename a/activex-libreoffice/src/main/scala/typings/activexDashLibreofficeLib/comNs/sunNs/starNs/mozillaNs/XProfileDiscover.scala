package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface used to list and get information for Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.XProfileManager
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XProfileDiscover
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * attempts to get the default profile name for the given product.
    * @param product is the product name to get default profile.Currently support "Mozilla" and "Thunderbird".
    * @returns the default profile name for the given product.
    */
  def getDefaultProfile(product: MozillaProductType): java.lang.String
  /**
    * attempts to get the profiles count.
    * @param product is the product name to get profiles count.Currently support "Mozilla" and "Thunderbird".
    * @returns the profiles count of selected product.
    */
  def getProfileCount(product: MozillaProductType): scala.Double
  /**
    * return true if the given profile exists
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns whether given profile exists
    */
  def getProfileExists(product: MozillaProductType, profileName: java.lang.String): scala.Boolean
  /**
    * attempts to get the profile list for the given product.
    * @param product is the product name to get profile list.Currently support "Mozilla" and "Thunderbird".
    * @param list is a list of all profile of the given product.
    * @returns the profile count for the given product.
    */
  def getProfileList(
    product: MozillaProductType,
    list: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Double
  /**
    * attempts to get the full path for the given profile.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to get full path.
    * @returns the full path of the given profile.
    */
  def getProfilePath(product: MozillaProductType, profileName: java.lang.String): java.lang.String
  /**
    * attempts to get whether profile is locked by other applications.
    * @param product is the product name to get profile path.Currently support "Mozilla" and "Thunderbird".
    * @param profileName the profile name to check.
    * @returns true is the given profile is locked.
    */
  def isProfileLocked(product: MozillaProductType, profileName: java.lang.String): scala.Boolean
}

object XProfileDiscover {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getDefaultProfile: MozillaProductType => java.lang.String,
    getProfileCount: MozillaProductType => scala.Double,
    getProfileExists: (MozillaProductType, java.lang.String) => scala.Boolean,
    getProfileList: (MozillaProductType, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]) => scala.Double,
    getProfilePath: (MozillaProductType, java.lang.String) => java.lang.String,
    isProfileLocked: (MozillaProductType, java.lang.String) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XProfileDiscover = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XProfileDiscover]
  }
}

