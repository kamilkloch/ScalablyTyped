package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client editor objects that display a list of items.
  */
trait ASPxClientListEdit extends ASPxClientEdit {
  /**
    * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
    */
  var SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]]
  /**
    * Returns the index of the selected item within the list editor.
    */
  def GetSelectedIndex(): scala.Double
  /**
    * Returns the list editor's selected item.
    */
  def GetSelectedItem(): ASPxClientListEditItem
  /**
    * Sets the list editor's selected item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to select.
    */
  def SetSelectedIndex(index: scala.Double): scala.Unit
  /**
    * Sets the list editor's selected item.
    * @param item An ASPxClientListEditItem object that specifies the item to select.
    */
  def SetSelectedItem(item: ASPxClientListEditItem): scala.Unit
}

object ASPxClientListEdit {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    Focus: () => scala.Unit,
    GetCaption: () => java.lang.String,
    GetClientVisible: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetErrorText: () => java.lang.String,
    GetHeight: () => scala.Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => scala.Boolean,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetReadOnly: () => scala.Boolean,
    GetSelectedIndex: () => scala.Double,
    GetSelectedItem: () => ASPxClientListEditItem,
    GetValue: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetCaption: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetErrorText: java.lang.String => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetIsValid: scala.Boolean => scala.Unit,
    SetReadOnly: scala.Boolean => scala.Unit,
    SetSelectedIndex: scala.Double => scala.Unit,
    SetSelectedItem: ASPxClientListEditItem => scala.Unit,
    SetValue: js.Object => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    Validate: () => scala.Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientListEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedIndex = js.Any.fromFunction0(GetSelectedIndex), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, LostFocus = LostFocus, SelectedIndexChanged = SelectedIndexChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedIndex = js.Any.fromFunction1(SetSelectedIndex), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientListEdit]
  }
}

