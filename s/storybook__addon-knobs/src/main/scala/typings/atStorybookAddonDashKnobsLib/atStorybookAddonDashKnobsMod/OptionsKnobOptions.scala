package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsKnobOptions extends js.Object {
  var display: js.UndefOr[
    atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.radio | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`inline-radio` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.check | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`inline-check` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.select | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`multi-select`
  ] = js.undefined
}

object OptionsKnobOptions {
  @scala.inline
  def apply(
    display: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.radio | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`inline-radio` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.check | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`inline-check` | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.select | atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsLibStrings.`multi-select` = null
  ): OptionsKnobOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsKnobOptions]
  }
}

