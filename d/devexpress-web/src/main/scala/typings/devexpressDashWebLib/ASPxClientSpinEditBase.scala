package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for the ASPxClientSpinEdit object.
  */
trait ASPxClientSpinEditBase extends ASPxClientButtonEditBase {
  /**
    * This event is not in effect for the ASPxClientSpinEditBase. Use the ASPxClientTimeEdit.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientSpinEditBase: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]]
}

object ASPxClientSpinEditBase {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    Focus: () => scala.Unit,
    GetButtonVisible: scala.Double => scala.Boolean,
    GetCaption: () => java.lang.String,
    GetCaretPosition: () => scala.Double,
    GetClientVisible: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetErrorText: () => java.lang.String,
    GetHeight: () => scala.Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => scala.Boolean,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetReadOnly: () => scala.Boolean,
    GetText: () => java.lang.String,
    GetValue: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: () => scala.Unit,
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetButtonVisible: (scala.Double, scala.Boolean) => scala.Unit,
    SetCaption: java.lang.String => scala.Unit,
    SetCaretPosition: scala.Double => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetErrorText: java.lang.String => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetIsValid: scala.Boolean => scala.Unit,
    SetReadOnly: scala.Boolean => scala.Unit,
    SetSelection: (scala.Double, scala.Double, scala.Boolean) => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetValue: js.Object => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => scala.Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientSpinEditBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ButtonClick = ButtonClick, Focus = js.Any.fromFunction0(Focus), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TextChanged = TextChanged, UserInput = UserInput, Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientSpinEditBase]
  }
}

