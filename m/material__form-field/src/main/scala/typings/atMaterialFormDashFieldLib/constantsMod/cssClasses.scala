package typings
package atMaterialFormDashFieldLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ROOT: atMaterialFormDashFieldLib.atMaterialFormDashFieldLibStrings.`mdc-form-field`
}

object cssClasses {
  @scala.inline
  def apply(
    ROOT: atMaterialFormDashFieldLib.atMaterialFormDashFieldLibStrings.`mdc-form-field`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

