package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActiveEventArgs extends js.Object {
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns, is it triggered by interaction or not.
    */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ItemActiveEventArgs {
  @scala.inline
  def apply(
    activeHeader: stdLib.HTMLElement = null,
    activeIndex: scala.Int | scala.Double = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    isInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    prevActiveHeader: stdLib.HTMLElement = null,
    prevActiveIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ItemActiveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader)
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemActiveEventArgs]
  }
}

