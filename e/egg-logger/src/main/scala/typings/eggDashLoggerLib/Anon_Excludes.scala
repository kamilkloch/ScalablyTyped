package typings
package eggDashLoggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Excludes extends js.Object {
  var excludes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Excludes {
  @scala.inline
  def apply(excludes: js.Array[java.lang.String] = null): Anon_Excludes = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    __obj.asInstanceOf[Anon_Excludes]
  }
}

