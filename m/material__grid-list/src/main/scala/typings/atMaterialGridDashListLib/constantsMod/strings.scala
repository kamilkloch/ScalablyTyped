package typings
package atMaterialGridDashListLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var TILES_SELECTOR: atMaterialGridDashListLib.atMaterialGridDashListLibStrings.`DOTmdc-grid-list__tiles`
  var TILE_SELECTOR: atMaterialGridDashListLib.atMaterialGridDashListLibStrings.`DOTmdc-grid-tile`
}

object strings {
  @scala.inline
  def apply(
    TILES_SELECTOR: atMaterialGridDashListLib.atMaterialGridDashListLibStrings.`DOTmdc-grid-list__tiles`,
    TILE_SELECTOR: atMaterialGridDashListLib.atMaterialGridDashListLibStrings.`DOTmdc-grid-tile`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR, TILE_SELECTOR = TILE_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

