package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Link")
@js.native
class Link protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new Link.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new Link.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): Link = js.native
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): Link = js.native
  /**
         * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Link = js.native
  /**
         * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): Link = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
         * <code>sap.m.Link</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Link</code> itself.Event is fired when the user triggers the link control.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Link</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachPress(oData: js.Any, fnFunction: js.Any): Link = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
         * <code>sap.m.Link</code>.When called, the context of the event handler (its <code>this</code>) will
         * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.Link</code> itself.Event is fired when the user triggers the link control.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.Link</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Link = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
         * <code>sap.m.Link</code>.The passed function and listener object must match the ones used for event
         * registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Link = js.native
  /**
         * Fires event <code>press</code> to attached listeners.Listeners may prevent the default action of
         * this event by using the <code>preventDefault</code>-method on the event object.
         * @param mArguments The arguments to pass along with the event
         * @returns Whether or not to prevent the default action
        */
  def firePress(mArguments: js.Any): scala.Boolean = js.native
  /**
         * Returns array of IDs of the elements which are the current targets of the association
         * <code>ariaDescribedBy</code>.
        */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Returns array of IDs of the elements which are the current targets of the association
         * <code>ariaLabelledBy</code>.
        */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
         * Gets current value of property <code>emphasized</code>.Emphasized links look visually more important
         * than regular links.Default value is <code>false</code>.
         * @since 1.22
         * @returns Value of property <code>emphasized</code>
        */
  def getEmphasized(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>enabled</code>.Determines whether the link can be triggered by
         * the user.Default value is <code>true</code>.
         * @returns Value of property <code>enabled</code>
        */
  def getEnabled(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>href</code>.The link target URI. Supports standard hyperlink
         * behavior. If a JavaScript action should be triggered, this should not be set, but instead an event
         * handler for the "press" event should be registered.
         * @returns Value of property <code>href</code>
        */
  def getHref(): js.Any = js.native
  /**
         * Gets current value of property <code>subtle</code>.Subtle links look more like standard text than
         * like links. They should only be used to help with visual hierarchy between large data lists of
         * important and less important links. Subtle links should not be used in any other use case.Default
         * value is <code>false</code>.
         * @since 1.22
         * @returns Value of property <code>subtle</code>
        */
  def getSubtle(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>target</code>.Options are the standard values for window.open()
         * supported by browsers: _self, _top, _blank, _parent, _search. Alternatively, a frame name can be
         * entered. This property is only used when the href property is set.
         * @returns Value of property <code>target</code>
        */
  def getTarget(): java.lang.String = js.native
  /**
         * Gets current value of property <code>text</code>.Link text to be displayed.Default value is
         * <code></code>.
         * @returns Value of property <code>text</code>
        */
  def getText(): java.lang.String = js.native
  /**
         * Gets current value of property <code>textAlign</code>.Sets the horizontal alignment of the
         * text.Default value is <code>Initial</code>.
         * @since 1.28.0
         * @returns Value of property <code>textAlign</code>
        */
  def getTextAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
         * Gets current value of property <code>textDirection</code>.This property specifies the element's text
         * directionality with enumerated options. By default, the control inherits text direction from the
         * parent DOM.Default value is <code>Inherit</code>.
         * @since 1.28.0
         * @returns Value of property <code>textDirection</code>
        */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
         * Gets current value of property <code>width</code>.Width of the link (CSS-size such as % or px). When
         * it is set, this is the exact size. When left blank, the text defines the size.
         * @returns Value of property <code>width</code>
        */
  def getWidth(): js.Any = js.native
  /**
         * Gets current value of property <code>wrapping</code>.Determines whether the link text is allowed to
         * wrap when there is not sufficient space.Default value is <code>false</code>.
         * @returns Value of property <code>wrapping</code>
        */
  def getWrapping(): scala.Boolean = js.native
  /**
         * Removes all the controls in the association named <code>ariaDescribedBy</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Removes all the controls in the association named <code>ariaLabelledBy</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: scala.Double): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  /**
         * Sets a new value for property <code>emphasized</code>.Emphasized links look visually more important
         * than regular links.When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.Default value is <code>false</code>.
         * @since 1.22
         * @param bEmphasized New value for property <code>emphasized</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setEmphasized(bEmphasized: scala.Boolean): Link = js.native
  /**
         * Sets a new value for property <code>enabled</code>.Determines whether the link can be triggered by
         * the user.When called with a value of <code>null</code> or <code>undefined</code>, the default value
         * of the property will be restored.Default value is <code>true</code>.
         * @param bEnabled New value for property <code>enabled</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setEnabled(bEnabled: scala.Boolean): Link = js.native
  /**
         * Sets a new value for property <code>href</code>.The link target URI. Supports standard hyperlink
         * behavior. If a JavaScript action should be triggered, this should not be set, but instead an event
         * handler for the "press" event should be registered.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.
         * @param sHref New value for property <code>href</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setHref(sHref: js.Any): Link = js.native
  /**
         * Sets a new value for property <code>subtle</code>.Subtle links look more like standard text than
         * like links. They should only be used to help with visual hierarchy between large data lists of
         * important and less important links. Subtle links should not be used in any other use case.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.Default value is <code>false</code>.
         * @since 1.22
         * @param bSubtle New value for property <code>subtle</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubtle(bSubtle: scala.Boolean): Link = js.native
  /**
         * Sets a new value for property <code>target</code>.Options are the standard values for window.open()
         * supported by browsers: _self, _top, _blank, _parent, _search. Alternatively, a frame name can be
         * entered. This property is only used when the href property is set.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param sTarget New value for property <code>target</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTarget(sTarget: java.lang.String): Link = js.native
  /**
         * Sets a new value for property <code>text</code>.Link text to be displayed.When called with a value
         * of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code></code>.
         * @param sText New value for property <code>text</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setText(sText: java.lang.String): Link = js.native
  /**
         * Sets a new value for property <code>textAlign</code>.Sets the horizontal alignment of the text.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.Default value is <code>Initial</code>.
         * @since 1.28.0
         * @param sTextAlign New value for property <code>textAlign</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTextAlign(sTextAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): Link = js.native
  /**
         * Sets a new value for property <code>textDirection</code>.This property specifies the element's text
         * directionality with enumerated options. By default, the control inherits text direction from the
         * parent DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default
         * value of the property will be restored.Default value is <code>Inherit</code>.
         * @since 1.28.0
         * @param sTextDirection New value for property <code>textDirection</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): Link = js.native
  /**
         * Sets a new value for property <code>width</code>.Width of the link (CSS-size such as % or px). When
         * it is set, this is the exact size. When left blank, the text defines the size.When called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.
         * @param sWidth New value for property <code>width</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setWidth(sWidth: js.Any): Link = js.native
  /**
         * Sets a new value for property <code>wrapping</code>.Determines whether the link text is allowed to
         * wrap when there is not sufficient space.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>false</code>.
         * @param bWrapping New value for property <code>wrapping</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setWrapping(bWrapping: scala.Boolean): Link = js.native
}
