package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var action: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var message: reactLib.reactMod.ReactNode
  var onActionClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ java.lang.String, scala.Unit]] = js.undefined
  var open: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    message: reactLib.reactMod.ReactNode,
    open: scala.Boolean,
    action: reactLib.reactMod.ReactNode = null,
    autoHideDuration: scala.Int | scala.Double = null,
    bodyStyle: reactLib.reactMod.CSSProperties = null,
    className: java.lang.String = null,
    contentStyle: reactLib.reactMod.CSSProperties = null,
    onActionClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onRequestClose: /* reason */ java.lang.String => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], open = open)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(onActionClick)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SnackbarProps]
  }
}

