package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Title")
@js.native
class Title protected () extends Element {
  /**
    * Constructor for a new Title.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>emphasized</code>.If set the title is displayed emphasized.This
    * feature is nor supported by all controls using the Title.control.Default value is
    * <code>false</code>.
    * @returns Value of property <code>emphasized</code>
    */
  def getEmphasized(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>icon</code>.Defines the URL for icon display
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>level</code>.Defines the level of the title. If set to auto the
    * level of the title is chosen by the control rendering the title.Currently not all controls using the
    * Title.control supporting this property.Default value is <code>Auto</code>.
    * @returns Value of property <code>level</code>
    */
  def getLevel(): TitleLevel = js.native
  /**
    * Gets current value of property <code>text</code>.Defines the title text
    * @returns Value of property <code>text</code>
    */
  def getText(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>emphasized</code>.If set the title is displayed emphasized.This
    * feature is nor supported by all controls using the Title.control.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bEmphasized New value for property <code>emphasized</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEmphasized(bEmphasized: scala.Boolean): Title = js.native
  /**
    * Sets a new value for property <code>icon</code>.Defines the URL for icon displayWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Title = js.native
  /**
    * Sets a new value for property <code>level</code>.Defines the level of the title. If set to auto the
    * level of the title is chosen by the control rendering the title.Currently not all controls using the
    * Title.control supporting this property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Auto</code>.
    * @param sLevel New value for property <code>level</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLevel(sLevel: TitleLevel): Title = js.native
  /**
    * Sets a new value for property <code>text</code>.Defines the title textWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: java.lang.String): Title = js.native
}

