package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Breadcrumbs")
@js.native
class Breadcrumbs protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new BreadcrumbsAccepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new BreadcrumbsAccepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some link to the aggregation <code>links</code>.
         * @since 1.34
         * @param oLink the link to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addLink(oLink: Link): Breadcrumbs = js.native
  /**
         * Destroys all the links in the aggregation <code>links</code>.
         * @since 1.34
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyLinks(): Breadcrumbs = js.native
  /**
         * Gets current value of property <code>currentLocationText</code>.Determines the text of current/last
         * element in the Breadcrumbs path.
         * @since 1.34
         * @returns Value of property <code>currentLocationText</code>
        */
  def getCurrentLocationText(): java.lang.String = js.native
  /**
         * Gets content of aggregation <code>links</code>.A list of all the active link elements in the
         * Breadcrumbs control.<b>Note:</b> Enabling the property <code>wrapping</code> of the link will not
         * worksince it's incompatible with the concept of the control.The other properties will work, but
         * their effect may be undesirable.
         * @since 1.34
        */
  def getLinks(): js.Array[Link] = js.native
  /**
         * Checks for the provided <code>sap.m.Link</code> in the aggregation <code>links</code>.and returns
         * its index if found or -1 otherwise.
         * @since 1.34
         * @param oLink The link whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfLink(oLink: Link): scala.Double = js.native
  /**
         * Inserts a link into the aggregation <code>links</code>.
         * @since 1.34
         * @param oLink the link to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the link should be inserted at; for             a
         * negative value of <code>iIndex</code>, the link is inserted at position 0; for a value            
         * greater than the current size of the aggregation, the link is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertLink(oLink: Link, iIndex: scala.Double): Breadcrumbs = js.native
  /**
         * Removes all the controls from the aggregation <code>links</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @since 1.34
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllLinks(): js.Array[Link] = js.native
  /**
         * Removes a link from the aggregation <code>links</code>.
         * @since 1.34
         * @param vLink The link to remove or its index or id
         * @returns The removed link or <code>null</code>
        */
  def removeLink(vLink: java.lang.String): Link = js.native
  /**
         * Removes a link from the aggregation <code>links</code>.
         * @since 1.34
         * @param vLink The link to remove or its index or id
         * @returns The removed link or <code>null</code>
        */
  def removeLink(vLink: Link): Link = js.native
  /**
         * Removes a link from the aggregation <code>links</code>.
         * @since 1.34
         * @param vLink The link to remove or its index or id
         * @returns The removed link or <code>null</code>
        */
  def removeLink(vLink: scala.Double): Link = js.native
  /**
         * Sets a new value for property <code>currentLocationText</code>.Determines the text of current/last
         * element in the Breadcrumbs path.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.
         * @since 1.34
         * @param sCurrentLocationText New value for property <code>currentLocationText</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setCurrentLocationText(sCurrentLocationText: java.lang.String): Breadcrumbs = js.native
}
