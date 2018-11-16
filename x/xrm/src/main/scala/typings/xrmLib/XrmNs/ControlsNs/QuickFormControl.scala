package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for a quick view control instance on a form.
         * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-quickforms External Link: formContext.ui.quickForms (Client API reference)}
         */
@js.native
trait QuickFormControl extends Control {
  /**
               * Gets the constituent controls in a quick view control.
               * @returns An array of controls.
               * @remarks Constituent controls in a quick view control are read only.
               */
  def getControl(): js.Array[Control] = js.native
  /**
               * Gets the constituent controls in a quick view control.
               * @param controlName Name of the control.
               * @returns The control.
               * @remarks Constituent controls in a quick view control are read only.
               */
  def getControl(controlName: java.lang.String): Control = js.native
  /**
               * Gets a control by index.
               * @param index The control index.
               * @returns The control.
               * @remarks Constituent controls in a quick view control are read only.
               */
  def getControl(index: scala.Double): Control = js.native
  /**
               * Gets the constituent controls in a quick view control.
               * @param T A Control type
               * @param controlName Name of the control.
               * @returns The control.
               * @remarks Constituent controls in a quick view control are read only.
               */
  @JSName("getControl")
  def getControl_TControlT[T /* <: Control */](controlName: java.lang.String): T = js.native
  /**
               * Gets a control by index.
               * @param T A Control type
               * @param index The control index.
               * @returns The control.
               * @remarks Constituent controls in a quick view control are read only.
               */
  @JSName("getControl")
  def getControl_TControlT[T /* <: Control */](index: scala.Double): T = js.native
  /**
               * Returns whether the data binding for the constituent controls in a quick view control is complete.
               * @returns  True is the data binding for a constituent control is complete, otherwise false.
               *          because the quick view form that the control is bound to may not have loaded completely.
               *          As a result, using the getAttribute or any data-related methods on a constituent control might not work.
               *          The isLoaded method for the quick view control helps determine the data binding status for constituent controls in a quick view control.
               * @remarks The data binding for the constituent controls in a quick view control may not be complete during the main form OnLoad event
               */
  def isLoaded(): scala.Boolean = js.native
  /**
               * Refreshes the data displayed in a quick view control.
               */
  def refresh(): scala.Unit = js.native
}
