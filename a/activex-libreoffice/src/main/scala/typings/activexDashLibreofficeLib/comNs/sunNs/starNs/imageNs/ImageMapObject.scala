package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this is a base service for objects inside a image maps.
  * @see ImageMap
  * @see ImageMapRectangleObject
  * @see ImageMapCircleObject
  * @see ImageMapPolygonObject
  */
trait ImageMapObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventsSupplier {
  /** This is an optional description text for the link. */
  var Description: java.lang.String
  /** If an object is not active, it is ignored when the user clicks on the {@link ImageMap} . */
  var IsActive: scala.Boolean
  /** Optionally, objects could be named. */
  var Name: java.lang.String
  /** This is the target frame */
  var Target: java.lang.String
  /** This is the URL for this object */
  var URL: java.lang.String
}

object ImageMapObject {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    IsActive: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Target: java.lang.String,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getEvents: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): ImageMapObject = {
    val __obj = js.Dynamic.literal(Description = Description, Events = Events, IsActive = IsActive, Name = Name, PropertySetInfo = PropertySetInfo, Target = Target, URL = URL, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ImageMapObject]
  }
}

