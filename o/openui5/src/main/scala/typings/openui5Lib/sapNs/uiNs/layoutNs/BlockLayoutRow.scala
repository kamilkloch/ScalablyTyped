package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.BlockLayoutRow")
@js.native
class BlockLayoutRow protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new BlockLayoutRow.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new BlockLayoutRow.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some content to the aggregation <code>content</code>.
           * @param oContent the content to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContent(oContent: BlockLayoutCell): BlockLayoutRow = js.native
  /**
           * Destroys all the content in the aggregation <code>content</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContent(): BlockLayoutRow = js.native
  /**
           * Gets content of aggregation <code>content</code>.The content cells to be included in the row.
          */
  def getContent(): js.Array[BlockLayoutCell] = js.native
  /**
           * Gets current value of property <code>scrollable</code>.Sets the rendering mode of the BlockLayoutRow
           * to scrollable. In scrollable mode, the cells getaligned side by side, with horizontal scroll bar for
           * the row.Default value is <code>false</code>.
           * @returns Value of property <code>scrollable</code>
          */
  def getScrollable(): scala.Boolean = js.native
  /**
           * Checks for the provided <code>sap.ui.layout.BlockLayoutCell</code> in the aggregation
           * <code>content</code>.and returns its index if found or -1 otherwise.
           * @param oContent The content whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfContent(oContent: BlockLayoutCell): scala.Double = js.native
  /**
           * Inserts a content into the aggregation <code>content</code>.
           * @param oContent the content to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
           * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
           *  greater than the current size of the aggregation, the content is inserted at             the last
           * position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertContent(oContent: BlockLayoutCell, iIndex: scala.Double): BlockLayoutRow = js.native
  /**
           * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
           * from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllContent(): js.Array[BlockLayoutCell] = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: java.lang.String): BlockLayoutCell = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: BlockLayoutCell): BlockLayoutCell = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: scala.Double): BlockLayoutCell = js.native
  /**
           * Sets a new value for property <code>scrollable</code>.Sets the rendering mode of the BlockLayoutRow
           * to scrollable. In scrollable mode, the cells getaligned side by side, with horizontal scroll bar for
           * the row.When called with a value of <code>null</code> or <code>undefined</code>, the default value
           * of the property will be restored.Default value is <code>false</code>.
           * @param bScrollable New value for property <code>scrollable</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setScrollable(bScrollable: scala.Boolean): BlockLayoutRow = js.native
}
