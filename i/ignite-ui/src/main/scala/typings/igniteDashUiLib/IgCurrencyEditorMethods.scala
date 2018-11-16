package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgCurrencyEditorMethods extends js.Object {
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.ignumericeditor#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.ignumericeditor#options:regional) option setter
  	 */
  def changeRegional(): scala.Unit = js.native
  /**
  	 * Gets/sets a string that is used as the currency symbol shown with the number in the input. The value provided as a param is propagated to the currencySymbol option and thus has the same priority as the option.
  	 *
  	 * @param symbol New currency symbol.
  	 */
  def currencySymbol(): java.lang.String = js.native
  /**
  	 * Gets/sets a string that is used as the currency symbol shown with the number in the input. The value provided as a param is propagated to the currencySymbol option and thus has the same priority as the option.
  	 *
  	 * @param symbol New currency symbol.
  	 */
  def currencySymbol(symbol: js.Object): java.lang.String = js.native
  /**
  	 * Finds index of list item by text that matches with the search parameters.
  	 *
  	 * @param number The text to search for.
  	 */
  def findListItemIndex(number: scala.Double): scala.Double = js.native
  /**
  	 * Gets current regional.
  	 */
  def getRegionalOption(): java.lang.String = js.native
  def getSelectedText(): scala.Unit = js.native
  def getSelectionEnd(): scala.Unit = js.native
  def getSelectionStart(): scala.Unit = js.native
  /**
  	 * This method is deprecated in favor of [spinDown](ui.%%WidgetNameLowered%%#options:spinDown).
  	 */
  def selectListIndexDown(): scala.Unit = js.native
  /**
  	 * This method is deprecated in favor of [spinUp](ui.%%WidgetNameLowered%%#options:spinUp).
  	 */
  def selectListIndexUp(): scala.Unit = js.native
  /**
  	 * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Decrement value.
  	 */
  def spinDown(): scala.Unit = js.native
  /**
  	 * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Decrement value.
  	 */
  def spinDown(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Increments value.
  	 */
  def spinUp(): scala.Unit = js.native
  /**
  	 * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Increments value.
  	 */
  def spinUp(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Gets/Sets editor value.
  	 *
  	 * @param newValue New editor value.
  	 */
  def value(): scala.Double = js.native
  /**
  	 * Gets/Sets editor value.
  	 *
  	 * @param newValue New editor value.
  	 */
  def value(newValue: scala.Double): scala.Double = js.native
}
