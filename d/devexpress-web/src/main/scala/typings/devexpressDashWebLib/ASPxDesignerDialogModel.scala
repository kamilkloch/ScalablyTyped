package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model of dialogs used to save and open reports in the Web Report Designer.
  */
trait ASPxDesignerDialogModel extends js.Object {
  /**
    * Provides access to the collection of buttons displayed in a dialog.
    * Value: An array of objects that specify buttons displayed in a dialog.
    */
  var popupButtons: js.Array[js.Object]
  /**
    * Specifies a function that gets the report URL.
    */
  def getUrl(): java.lang.String
  /**
    * Specifies a function to be executed when showing a dialog.
    * @param tab An object that specifies the report tab for which a dialog is invoked.
    */
  def onShow(tab: ASPxDesignerNavigateTab): scala.Unit
  /**
    * Specifies a function that sets the report URL.
    * @param url A string that specifies the report URL.
    */
  def setUrl(url: java.lang.String): scala.Unit
}

object ASPxDesignerDialogModel {
  @scala.inline
  def apply(
    getUrl: () => java.lang.String,
    onShow: ASPxDesignerNavigateTab => scala.Unit,
    popupButtons: js.Array[js.Object],
    setUrl: java.lang.String => scala.Unit
  ): ASPxDesignerDialogModel = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction0(getUrl), onShow = js.Any.fromFunction1(onShow), popupButtons = popupButtons, setUrl = js.Any.fromFunction1(setUrl))
  
    __obj.asInstanceOf[ASPxDesignerDialogModel]
  }
}

