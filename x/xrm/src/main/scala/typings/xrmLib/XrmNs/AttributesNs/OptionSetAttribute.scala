package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface an OptionSet attribute.
  * @see {@link EnumAttribute}
  */
@js.native
trait OptionSetAttribute extends EnumAttribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_OptionSetAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.OptionSetControl] = js.native
  /**
    * Gets the option matching a label.
    * @param label The label of the option desired.
    * @returns The option.
    */
  def getOption(label: java.lang.String): xrmLib.XrmNs.OptionSetValue = js.native
  /**
    * Gets the option matching a value.
    * @param value The enumeration value of the option desired.
    * @returns The option.
    */
  def getOption(value: scala.Double): xrmLib.XrmNs.OptionSetValue = js.native
  /**
    * Gets all of the options.
    * @returns An array of options.
    */
  def getOptions(): js.Array[xrmLib.XrmNs.OptionSetValue] = js.native
  /**
    * Gets selected option.
    * @returns The selected option.
    */
  def getSelectedOption(): xrmLib.XrmNs.OptionSetValue = js.native
  /**
    * Gets the label of the currently selected option.
    * @returns The current value's label.
    */
  def getText(): java.lang.String = js.native
  /**
    * Sets the value.
    * @param value The value.
    * @remarks     The getOptions() method returns option values as strings. You must use parseInt
    *              to convert them to numbers before you can use those values to set the value of an
    *              OptionSet attribute. Attributes on Quick Create Forms will not save values set
    *              with this method.
    */
  def setValue(value: scala.Double): scala.Unit = js.native
}

