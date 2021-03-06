package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to an object's methods and properties. Container access is available through {@link com.sun.star.container.XIndexContainer} , {@link
  * com.sun.star.container.XNameContainer} and {@link com.sun.star.container.XEnumerationAccess} .
  */
trait XInvocation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  val Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  def getIntrospection(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess
  /**
    * returns the value of the property with the specified name.
    * @param aPropertyName specifies the name of the property.
    */
  def getValue(aPropertyName: java.lang.String): js.Any
  /**
    * returns `TRUE` if the method with the specified name exists, else `FALSE` .
    *
    * This optimizes the calling sequence ( {@link XInvocation.hasMethod()} , {@link XInvocation.invoke()} )!
    * @@param aName        specifies the name of the method.
    */
  def hasMethod(aName: java.lang.String): scala.Boolean
  /**
    * returns `TRUE` if the property with the specified name exists, else `FALSE` . <p>This optimizes the calling sequence
    *
    *     ( XInvocation::hasProperty(),
    *
    *     XInvocation::getValue() ) or
    *
    *
    *
    *     ( XInvocation::hasProperty(),
    *
    *     XInvocation::setValue() )!
    * @@param aName    specifies the name of the property.
    */
  def hasProperty(aName: java.lang.String): scala.Boolean
  /**
    * provides access to methods exposed by an object.
    * @param aFunctionName the method to invoke
    * @param aParams all parameters; pure out params are undefined in sequence, the value has to be ignored by the callee
    * @param aOutParamIndex This sequence contains the indices of all parameters that are specified as out or inout.
    * @param aOutParam This sequence contains the values of all parameters that are specified as out or inout and corresponds with the indices provided by the
    */
  def invoke(
    aFunctionName: java.lang.String,
    aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    aOutParamIndex: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    aOutParam: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): js.Any
  /**
    * sets a value to the property with the specified name.
    *
    * If the underlying object implements an {@link com.sun.star.container.XNameContainer} , then this method will insert the value if there is no such
    * **aPropertyName** .
    */
  def setValue(aPropertyName: java.lang.String, aValue: js.Any): scala.Unit
}

object XInvocation {
  @scala.inline
  def apply(
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    acquire: () => scala.Unit,
    getIntrospection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    getValue: java.lang.String => js.Any,
    hasMethod: java.lang.String => scala.Boolean,
    hasProperty: java.lang.String => scala.Boolean,
    invoke: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValue: (java.lang.String, js.Any) => scala.Unit
  ): XInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection, acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XInvocation]
  }
}

