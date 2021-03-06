package typings
package primereactLib.componentsDatascrollerDataScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataScrollerProps extends js.Object {
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var loader: js.UndefOr[js.Any] = js.undefined
  var onLazyLoad: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_First, scala.Unit]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var scrollHeight: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataScrollerProps {
  @scala.inline
  def apply(
    buffer: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    footer: js.Any = null,
    header: js.Any = null,
    id: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    loader: js.Any = null,
    onLazyLoad: /* e */ primereactLib.Anon_First => scala.Unit = null,
    rows: scala.Int | scala.Double = null,
    scrollHeight: js.Any = null,
    style: js.Object = null,
    value: js.Array[_] = null
  ): DataScrollerProps = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataScrollerProps]
  }
}

