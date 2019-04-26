package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  media  :string,   meta  :string,   link  :boolean,   element  :std.HTMLStyleElement,   index  :number,   generateClassName  :jss.jss.GenerateClassName<Name>,   classNamePrefix  :string}> */
trait CreateStyleSheetOptions[Name /* <: java.lang.String */] extends js.Object {
  var classNamePrefix: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[stdLib.HTMLStyleElement] = js.undefined
  var generateClassName: js.UndefOr[GenerateClassName[Name]] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var link: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.UndefOr[java.lang.String] = js.undefined
}

object CreateStyleSheetOptions {
  @scala.inline
  def apply[Name /* <: java.lang.String */](
    classNamePrefix: java.lang.String = null,
    element: stdLib.HTMLStyleElement = null,
    generateClassName: GenerateClassName[Name] = null,
    index: scala.Int | scala.Double = null,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null,
    meta: java.lang.String = null
  ): CreateStyleSheetOptions[Name] = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (element != null) __obj.updateDynamic("element")(element)
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(generateClassName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (media != null) __obj.updateDynamic("media")(media)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[CreateStyleSheetOptions[Name]]
  }
}

