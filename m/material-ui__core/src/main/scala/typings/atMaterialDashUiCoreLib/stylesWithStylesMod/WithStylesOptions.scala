package typings
package atMaterialDashUiCoreLib.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesOptions[ClassKey /* <: java.lang.String */]
  extends jssLib.jssMod.CreateStyleSheetOptions[ClassKey] {
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var withTheme: js.UndefOr[scala.Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply[ClassKey /* <: java.lang.String */](
    classNamePrefix: java.lang.String = null,
    element: stdLib.HTMLStyleElement = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    generateClassName: jssLib.jssMod.GenerateClassName[ClassKey] = null,
    index: scala.Int | scala.Double = null,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null,
    meta: java.lang.String = null,
    name: java.lang.String = null,
    withTheme: js.UndefOr[scala.Boolean] = js.undefined
  ): WithStylesOptions[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(generateClassName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (media != null) __obj.updateDynamic("media")(media)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme)
    __obj.asInstanceOf[WithStylesOptions[ClassKey]]
  }
}

