package typings
package extjsLib.ExtNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewport extends IContainer {
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IViewport {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    isViewport: js.UndefOr[scala.Boolean] = js.undefined,
    onRender: () => scala.Unit = null
  ): IViewport = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(isViewport)) __obj.updateDynamic("isViewport")(isViewport)
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    __obj.asInstanceOf[IViewport]
  }
}

