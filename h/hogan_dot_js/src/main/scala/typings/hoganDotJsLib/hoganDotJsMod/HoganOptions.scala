package typings
package hoganDotJsLib.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoganOptions extends js.Object {
  var asString: js.UndefOr[scala.Boolean] = js.undefined
  var delimiters: js.UndefOr[java.lang.String] = js.undefined
  var disableLambda: js.UndefOr[scala.Boolean] = js.undefined
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
}

object HoganOptions {
  @scala.inline
  def apply(
    asString: js.UndefOr[scala.Boolean] = js.undefined,
    delimiters: java.lang.String = null,
    disableLambda: js.UndefOr[scala.Boolean] = js.undefined,
    sectionTags: js.Array[SectionTags] = null
  ): HoganOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (!js.isUndefined(disableLambda)) __obj.updateDynamic("disableLambda")(disableLambda)
    if (sectionTags != null) __obj.updateDynamic("sectionTags")(sectionTags)
    __obj.asInstanceOf[HoganOptions]
  }
}

