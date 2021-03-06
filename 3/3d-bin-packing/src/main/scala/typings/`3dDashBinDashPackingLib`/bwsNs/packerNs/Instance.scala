package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface of physical 3D-instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Instance extends js.Object {
  /**
    * <p> A type, identifier of derived class. </p>
    *
    * <h4> Derived types </h4>
    * <ul>
    *	<li> {@link Product product} </li>
    *	<li> {@link Wrapper wrapper} </li>
    * <ul>
    */
  def TYPE(): java.lang.String
  /**
    * Get height, length on the Y-axis in 3D.
    */
  def getHeight(): scala.Double
  /**
    * Get length, length on the Z-axis in 3D.
    */
  def getLength(): scala.Double
  /**
    * Get name.
    */
  def getName(): java.lang.String
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  def getVolume(): scala.Double
  /**
    * Get width, length on the X-axis in 3D.
    */
  def getWidth(): scala.Double
  /**
    * Set height, length on the Y-axis in 3D.
    */
  def setHeight(`val`: scala.Double): scala.Unit
  /**
    * Set length, length on the Z-axis in 3D.
    */
  def setLength(`val`: scala.Double): scala.Unit
  /**
    * Set name.
    */
  def setName(`val`: java.lang.String): scala.Unit
  /**
    * Set width, length on the X-axis in 3D.
    */
  def setWidth(`val`: scala.Double): scala.Unit
}

object Instance {
  @scala.inline
  def apply(
    TYPE: () => java.lang.String,
    getHeight: () => scala.Double,
    getLength: () => scala.Double,
    getName: () => java.lang.String,
    getVolume: () => scala.Double,
    getWidth: () => scala.Double,
    setHeight: scala.Double => scala.Unit,
    setLength: scala.Double => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setWidth: scala.Double => scala.Unit
  ): Instance = {
    val __obj = js.Dynamic.literal(TYPE = js.Any.fromFunction0(TYPE), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Instance]
  }
}

