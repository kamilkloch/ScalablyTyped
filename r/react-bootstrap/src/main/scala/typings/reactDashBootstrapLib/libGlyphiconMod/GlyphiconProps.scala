package typings
package reactDashBootstrapLib.libGlyphiconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphiconProps
  extends reactLib.reactMod.HTMLProps[Glyphicon] {
  // Optional
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  // Required
  var glyph: java.lang.String
}

object GlyphiconProps {
  @scala.inline
  def apply(
    glyph: java.lang.String,
    HTMLProps: reactLib.reactMod.HTMLProps[Glyphicon] = null,
    bsClass: java.lang.String = null
  ): GlyphiconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[GlyphiconProps]
  }
}

