package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  var parameters: js.UndefOr[js.Any] = js.undefined
  var `type`: StandardValidatorType | (js.Function3[
    /* cell */ CellComponent, 
    /* value */ js.Any, 
    /* parameters */ js.UndefOr[js.Any], 
    scala.Boolean
  ])
}

object Validator {
  @scala.inline
  def apply(
    `type`: StandardValidatorType | (js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* parameters */ js.UndefOr[js.Any], 
      scala.Boolean
    ]),
    parameters: js.Any = null
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Validator]
  }
}

