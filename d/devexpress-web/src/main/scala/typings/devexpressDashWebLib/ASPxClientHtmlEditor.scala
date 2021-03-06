package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxHtmlEditor control.
  */
@js.native
trait ASPxClientHtmlEditor extends ASPxClientControl {
  /**
    * Fires on the client side after the active tab has been changed within a control.
    */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientHtmlEditorTabEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client side before the active tab is changed within a control.
    */
  var ActiveTabChanging: ASPxClientEvent[ASPxClientHtmlEditorTabCancelEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs before an HTML code is pasted to editor content, and allows you to modify it.
    */
  var BeforePaste: ASPxClientEvent[ASPxClientHtmlEditorBeforePasteEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHtmlEditor.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs after a default or custom command has been executed on the client side.
    */
  var CommandExecuted: ASPxClientEvent[ASPxClientHtmlEditorCommandEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs before a default or custom command has been executed and allows you to cancel the action.
    */
  var CommandExecuting: ASPxClientEvent[ASPxClientHtmlEditorCommandExecutingEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side before a context menu is shown.
    */
  var ContextMenuShowing: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Enables you to implement a custom command's logic.
    */
  var CustomCommand: ASPxClientEvent[ASPxClientHtmlEditorCommandEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires after a callback, sent by the CustomDataCallback event handler.
    */
  var CustomDataCallback: ASPxClientEvent[ASPxClientCustomDataCallbackEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after a custom dialog is closed.
    */
  var CustomDialogClosed: ASPxClientEvent[ASPxClientHtmlEditorCustomDialogClosedEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client side before a custom dialog is closed.
    */
  var CustomDialogClosing: ASPxClientEvent[ASPxClientHtmlEditorCustomDialogClosingEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after a custom dialog is opened.
    */
  var CustomDialogOpened: ASPxClientEvent[ASPxClientHtmlEditorCustomDialogEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after a dialog is closed.
    */
  var DialogClosed: ASPxClientEvent[ASPxClientHtmlEditorDialogClosedEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client side before a dialog is going to be closed.
    */
  var DialogClosing: ASPxClientEvent[ASPxClientHtmlEditorDialogClosingEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after a dialog has been initialized.
    */
  var DialogInitialized: ASPxClientEvent[ASPxClientHtmlEditorDialogInitializedEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client side when the editor's Design View Area receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side when the content of the editor changes.
    */
  var HtmlChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Fires on the client side when the editor's Design View Area loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client when a selection is changed within the ASPxHtmlEditor.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Occurs on the client side after the editor content is spell checked.
    */
  var SpellingChecked: ASPxClientEvent[ASPxClientEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Allows you to specify whether the value entered into the ASPxHtmlEditor is valid.
    */
  var Validation: ASPxClientEvent[ASPxClientHtmlEditorValidationEventHandler[ASPxClientHtmlEditor]] = js.native
  /**
    * Creates a parameter for ASPxHtmlEditor's client-side commands related to changing media elements.
    * @param element An element that is being changed.
    */
  def CreateChangeMediaElementCommandArguments(element: js.Object): ASPxClientHtmlEditorChangeMediaElementCommandArguments = js.native
  /**
    * Executes the specified command.
    * @param commandName A string value that specifies the command to perform.
    * @param parameter A string value specifying additional information about the command to perform.
    * @param addToUndoHistory true, to add the specified command to the undo stack; otherwise, false.
    */
  def ExecuteCommand(commandName: java.lang.String, parameter: js.Object, addToUndoHistory: scala.Boolean): scala.Boolean = js.native
  /**
    * Sets input focus to the ASPxHtmlEditor's edit region.
    */
  def Focus(): scala.Unit = js.native
  /**
    * Returns the name of the active HTML editor tab.
    */
  def GetActiveTabName(): java.lang.String = js.native
  /**
    * Returns a collection of client context menu objects.
    */
  def GetContextMenu(): ASPxClientPopupMenu = js.native
  /**
    * Returns the document object generated by an iframe element within a design view area.
    */
  def GetDesignViewDocument(): js.Object = js.native
  /**
    * Provides access to the client ASPxPopupControl object that is a Html Editor's dialog.
    */
  def GetDialogPopupControl(): ASPxClientPopupControl = js.native
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  def GetEnabled(): scala.Boolean = js.native
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  def GetErrorText(): java.lang.String = js.native
  /**
    * Gets the HTML markup that represents the editor's content.
    */
  def GetHtml(): java.lang.String = js.native
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  def GetIsValid(): scala.Boolean = js.native
  /**
    * Returns the document object generated by an iframe element within a preview area.
    */
  def GetPreviewDocument(): js.Object = js.native
  /**
    * Provides access to an object implementing the HtmlEditor's ribbon UI.
    */
  def GetRibbon(): ASPxClientRibbon = js.native
  /**
    * Returns the selection in the ASPxHtmlEditor.
    */
  def GetSelection(): ASPxClientHtmlEditorSelection = js.native
  /**
    * Returns a toolbar specified by its name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: java.lang.String): ASPxClientMenu = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomDataCallback event passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side CustomDataCallback event.
    * @param onCallback A ASPxClientDataCallback object that represents the JavaScript function which receives the callback data as a parameter.
    */
  def PerformDataCallback(parameter: java.lang.String, onCallback: ASPxClientDataCallback): scala.Unit = js.native
  /**
    * Reconnect the control to an external ribbon.
    */
  def ReconnectToExternalRibbon(): scala.Unit = js.native
  /**
    * Replaces placeholders with the specified values.
    * @param html A string value that specifies the HTML code to process.
    * @param placeholders An array of objects that specify the placeholders and values to replace them.
    */
  def ReplacePlaceholders(html: java.lang.String, placeholders: js.Array[js.Object]): java.lang.String = js.native
  /**
    * Restores the selection within the ASPxHtmlEditor.
    */
  def RestoreSelection(): scala.Boolean = js.native
  /**
    * Adds the current editor state to the undo/redo history.
    */
  def SaveToUndoHistory(): scala.Unit = js.native
  /**
    * Set an active tab specified by its name.
    * @param name A string value that is the name of the tab.
    */
  def SetActiveTabByName(name: java.lang.String): scala.Unit = js.native
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; false to disable it.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  def SetErrorText(errorText: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the HTML markup that represents the editor's content.
    * @param html A string value that specifies the HTML markup.
    */
  def SetHtml(html: java.lang.String): scala.Unit = js.native
  /**
    * Sets the HTML markup that represents the editor's content.
    * @param html A string value that specifies the HTML markup.
    * @param clearUndoHistory true to clear the undo stack; otherwise, false.
    */
  def SetHtml(html: java.lang.String, clearUndoHistory: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a value that specifies whether the editor's value passes validation.
    * @param isValid true if the editor's value passes validation; otherwise, false.
    */
  def SetIsValid(isValid: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the visibility of a ribbon context tab category specified by its name.
    * @param categoryName A Name property value of the required category.
    * @param active true to make a category visible; false to make it hidden.
    */
  def SetRibbonContextTabCategoryVisible(categoryName: java.lang.String, active: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the combo box within the HtmlEditor on the client side.
    * @param commandName A string value that identifies the combo box's command name within the HtmlEditor's control collection.
    * @param value A string value that specifies the combo box's new value.
    */
  def SetToolbarComboBoxValue(commandName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the dropdown item picker in the HtmlEditor on the client side.
    * @param commandName A string value that identifies the dropdown item picker by its command name. This value is contained in the CommandName property.
    * @param value A string value that specifies the dropdown item picker's new value, i.e., the ToolbarItemPickerItem object.
    */
  def SetToolbarDropDownItemPickerValue(commandName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Performs validation of the editor's content.
    */
  def Validate(): scala.Unit = js.native
}

