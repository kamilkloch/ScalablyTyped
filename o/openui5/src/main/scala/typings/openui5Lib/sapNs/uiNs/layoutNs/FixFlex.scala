package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.FixFlex")
@js.native
class FixFlex protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new FixFlex.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some fixContent to the aggregation <code>fixContent</code>.
    * @param oFixContent the fixContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addFixContent(oFixContent: openui5Lib.sapNs.uiNs.coreNs.Control): FixFlex = js.native
  /**
    * Destroys all the fixContent in the aggregation <code>fixContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFixContent(): FixFlex = js.native
  /**
    * Destroys the flexContent in the aggregation <code>flexContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFlexContent(): FixFlex = js.native
  /**
    * Gets content of aggregation <code>fixContent</code>.Controls in the fixed part of the layout.
    */
  def getFixContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets current value of property <code>fixContentSize</code>.Determines the height (if the vertical
    * property is "true") or the width (if the vertical property is "false") of the fixed area. If left at
    * the default value "auto", the fixed-size area will be as large as its content. In this case the
    * content cannot use percentage sizes.Default value is <code>auto</code>.
    * @returns Value of property <code>fixContentSize</code>
    */
  def getFixContentSize(): js.Any = js.native
  /**
    * Gets current value of property <code>fixFirst</code>.Determines whether the fixed-size area should
    * be on the beginning/top ( if the value is "true") or beginning/bottom ( if the value is
    * "false").Default value is <code>true</code>.
    * @returns Value of property <code>fixFirst</code>
    */
  def getFixFirst(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>flexContent</code>.Control in the stretching part of the layout.
    */
  def getFlexContent(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets current value of property <code>minFlexSize</code>.Enables scrolling inside the flexible part.
    * The given size is calculated in "px". If the child control in the flexible part is larger then the
    * available flexible size on the screen and if the available size for the flexible part is smaller or
    * equal to the minFlexSize value, the scroll will be for the entire FixFlex control.Default value is
    * <code>0</code>.
    * @since 1.29
    * @returns Value of property <code>minFlexSize</code>
    */
  def getMinFlexSize(): scala.Double = js.native
  /**
    * Gets current value of property <code>vertical</code>.Determines the direction of the layout of child
    * elements. True for vertical and false for horizontal layout.Default value is <code>true</code>.
    * @returns Value of property <code>vertical</code>
    */
  def getVertical(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>fixContent</code>.and returns its index if found or -1 otherwise.
    * @param oFixContent The fixContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfFixContent(oFixContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a fixContent into the aggregation <code>fixContent</code>.
    * @param oFixContent the fixContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the fixContent should be inserted at; for             a
    * negative value of <code>iIndex</code>, the fixContent is inserted at position 0; for a value        
    *     greater than the current size of the aggregation, the fixContent is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertFixContent(oFixContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): FixFlex = js.native
  /**
    * Removes all the controls from the aggregation <code>fixContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllFixContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removeFixContent(vFixContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeFixContent(vFixContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a fixContent from the aggregation <code>fixContent</code>.
    * @param vFixContent The fixContent to remove or its index or id
    * @returns The removed fixContent or <code>null</code>
    */
  def removeFixContent(vFixContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Sets a new value for property <code>fixContentSize</code>.Determines the height (if the vertical
    * property is "true") or the width (if the vertical property is "false") of the fixed area. If left at
    * the default value "auto", the fixed-size area will be as large as its content. In this case the
    * content cannot use percentage sizes.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>auto</code>.
    * @param sFixContentSize New value for property <code>fixContentSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFixContentSize(sFixContentSize: js.Any): FixFlex = js.native
  /**
    * Sets a new value for property <code>fixFirst</code>.Determines whether the fixed-size area should be
    * on the beginning/top ( if the value is "true") or beginning/bottom ( if the value is "false").When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bFixFirst New value for property <code>fixFirst</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFixFirst(bFixFirst: scala.Boolean): FixFlex = js.native
  /**
    * Sets the aggregated <code>flexContent</code>.
    * @param oFlexContent The flexContent to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFlexContent(oFlexContent: openui5Lib.sapNs.uiNs.coreNs.Control): FixFlex = js.native
  /**
    * Sets a new value for property <code>minFlexSize</code>.Enables scrolling inside the flexible part.
    * The given size is calculated in "px". If the child control in the flexible part is larger then the
    * available flexible size on the screen and if the available size for the flexible part is smaller or
    * equal to the minFlexSize value, the scroll will be for the entire FixFlex control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>0</code>.
    * @since 1.29
    * @param iMinFlexSize New value for property <code>minFlexSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinFlexSize(iMinFlexSize: scala.Double): FixFlex = js.native
  /**
    * Sets a new value for property <code>vertical</code>.Determines the direction of the layout of child
    * elements. True for vertical and false for horizontal layout.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bVertical New value for property <code>vertical</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVertical(bVertical: scala.Boolean): FixFlex = js.native
}

