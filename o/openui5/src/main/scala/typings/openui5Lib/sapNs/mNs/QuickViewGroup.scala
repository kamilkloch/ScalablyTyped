package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.QuickViewGroup")
@js.native
class QuickViewGroup protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
    * Constructor for a new QuickViewGroup.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some element to the aggregation <code>elements</code>.
    * @param oElement the element to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addElement(oElement: QuickViewGroupElement): QuickViewGroup = js.native
  /**
    * Binds aggregation <code>elements</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindElements(oBindingInfo: js.Any): QuickViewGroup = js.native
  /**
    * Destroys all the elements in the aggregation <code>elements</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyElements(): QuickViewGroup = js.native
  /**
    * Gets content of aggregation <code>elements</code>.A combination of one label and another control
    * (Link or Text) associated to this label.
    */
  def getElements(): js.Array[QuickViewGroupElement] = js.native
  /**
    * Gets current value of property <code>heading</code>.The title of the groupDefault value is
    * <code></code>.
    * @returns Value of property <code>heading</code>
    */
  def getHeading(): java.lang.String = js.native
  /**
    * Gets current value of property <code>visible</code>.Determines whether the group is visible on the
    * screen.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.QuickViewGroupElement</code> in the aggregation
    * <code>elements</code>.and returns its index if found or -1 otherwise.
    * @param oElement The element whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfElement(oElement: QuickViewGroupElement): scala.Double = js.native
  /**
    * Inserts a element into the aggregation <code>elements</code>.
    * @param oElement the element to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the element should be inserted at; for             a
    * negative value of <code>iIndex</code>, the element is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the element is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertElement(oElement: QuickViewGroupElement, iIndex: scala.Double): QuickViewGroup = js.native
  /**
    * Removes all the controls from the aggregation <code>elements</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllElements(): js.Array[QuickViewGroupElement] = js.native
  def removeElement(vElement: java.lang.String): QuickViewGroupElement = js.native
  def removeElement(vElement: QuickViewGroupElement): QuickViewGroupElement = js.native
  /**
    * Removes a element from the aggregation <code>elements</code>.
    * @param vElement The element to remove or its index or id
    * @returns The removed element or <code>null</code>
    */
  def removeElement(vElement: scala.Double): QuickViewGroupElement = js.native
  /**
    * Sets a new value for property <code>heading</code>.The title of the groupWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sHeading New value for property <code>heading</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeading(sHeading: java.lang.String): QuickViewGroup = js.native
  /**
    * Sets a new value for property <code>visible</code>.Determines whether the group is visible on the
    * screen.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: scala.Boolean): QuickViewGroup = js.native
  /**
    * Unbinds aggregation <code>elements</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindElements(): QuickViewGroup = js.native
}

