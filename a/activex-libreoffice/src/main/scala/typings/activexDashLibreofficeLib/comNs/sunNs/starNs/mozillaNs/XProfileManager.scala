package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to boot up and switch Mozilla/Thunderbird profiles
  * @see com.sun.star.mozilla.MozillaProductType
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XProfileManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  val CurrentProduct: MozillaProductType
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  val CurrentProfile: java.lang.String
  /**
    * attempts to init XPCOM runtime using given profile.
    * @param product is the product to start up.
    * @param profileName the profile name to be used.
    * @returns the current reference count for the given profile.
    */
  def bootupProfile(product: MozillaProductType, profileName: java.lang.String): scala.Double
  /**
    * attempts to get the current product.
    * @returns the current used product.
    */
  def getCurrentProduct(): MozillaProductType
  /**
    * attempts to get the current profile name.
    * @returns the current used profile.
    */
  def getCurrentProfile(): java.lang.String
  /**
    * attempts to check whether the current profile locked or not
    * @returns return sal_True is current profile is locked
    */
  def isCurrentProfileLocked(): scala.Boolean
  /**
    * attempts to set the current used profile name for the given product.
    * @param product is the product to be used.
    * @param profileName the profile name to be used.
    * @returns the current used profile name for the given product.
    */
  def setCurrentProfile(product: MozillaProductType, profileName: java.lang.String): java.lang.String
  /**
    * attempts to shutdown the current profile.
    * @returns the current reference count for the current profile.
    */
  def shutdownProfile(): scala.Double
}

object XProfileManager {
  @scala.inline
  def apply(
    CurrentProduct: MozillaProductType,
    CurrentProfile: java.lang.String,
    acquire: () => scala.Unit,
    bootupProfile: (MozillaProductType, java.lang.String) => scala.Double,
    getCurrentProduct: () => MozillaProductType,
    getCurrentProfile: () => java.lang.String,
    isCurrentProfileLocked: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCurrentProfile: (MozillaProductType, java.lang.String) => java.lang.String,
    shutdownProfile: () => scala.Double
  ): XProfileManager = {
    val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct, CurrentProfile = CurrentProfile, acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
  
    __obj.asInstanceOf[XProfileManager]
  }
}

