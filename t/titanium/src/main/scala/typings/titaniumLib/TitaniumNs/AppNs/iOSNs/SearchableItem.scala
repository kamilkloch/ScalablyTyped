package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Used to create a unique object containing all of the search information that will appear in the device search index.
			 */
trait SearchableItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Set of metadata properties to display for the item.
  				 */
  var attributeSet: SearchableItemAttributeSet
  /**
  				 * Identifier that represents the "domain" or owner of this item.
  				 */
  var domainIdentifier: java.lang.String
  /**
  				 * Searchable items have an expiration date or time to live.  By default it is set to one month.
  				 */
  var expirationDate: java.lang.String
  /**
  				 * Unique identifier to your application group.
  				 */
  var uniqueIdentifier: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def getDomainIdentifier(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def getExpirationDate(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def getUniqueIdentifier(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def setDomainIdentifier(domainIdentifier: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def setUniqueIdentifier(uniqueIdentifier: java.lang.String): scala.Unit
}

object SearchableItem {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    attributeSet: SearchableItemAttributeSet,
    bubbleParent: scala.Boolean,
    domainIdentifier: java.lang.String,
    expirationDate: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDomainIdentifier: () => java.lang.String,
    getExpirationDate: () => java.lang.String,
    getUniqueIdentifier: () => java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDomainIdentifier: java.lang.String => scala.Unit,
    setExpirationDate: java.lang.String => scala.Unit,
    setUniqueIdentifier: java.lang.String => scala.Unit,
    uniqueIdentifier: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SearchableItem = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attributeSet = attributeSet, bubbleParent = bubbleParent, domainIdentifier = domainIdentifier, expirationDate = expirationDate, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomainIdentifier = js.Any.fromFunction0(getDomainIdentifier), getExpirationDate = js.Any.fromFunction0(getExpirationDate), getUniqueIdentifier = js.Any.fromFunction0(getUniqueIdentifier), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomainIdentifier = js.Any.fromFunction1(setDomainIdentifier), setExpirationDate = js.Any.fromFunction1(setExpirationDate), setUniqueIdentifier = js.Any.fromFunction1(setUniqueIdentifier), uniqueIdentifier = uniqueIdentifier)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchableItem]
  }
}

