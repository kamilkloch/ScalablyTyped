package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteParams extends _EditorParams {
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var freetext: js.UndefOr[scala.Boolean] = js.undefined
  var listItemFormatter: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* text */ java.lang.String, java.lang.String]
  ] = js.undefined
  var searchFunc: js.UndefOr[
    js.Function2[
      /* term */ java.lang.String, 
      /* values */ js.Array[java.lang.String], 
      js.Array[java.lang.String]
    ]
  ] = js.undefined
  var showListOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var values: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | js.Array[java.lang.String] | JSONRecord
}

object AutoCompleteParams {
  @scala.inline
  def apply(
    values: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | js.Array[java.lang.String] | JSONRecord,
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    freetext: js.UndefOr[scala.Boolean] = js.undefined,
    listItemFormatter: (/* value */ java.lang.String, /* text */ java.lang.String) => java.lang.String = null,
    searchFunc: (/* term */ java.lang.String, /* values */ js.Array[java.lang.String]) => js.Array[java.lang.String] = null,
    showListOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(freetext)) __obj.updateDynamic("freetext")(freetext)
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (searchFunc != null) __obj.updateDynamic("searchFunc")(js.Any.fromFunction2(searchFunc))
    if (!js.isUndefined(showListOnEmpty)) __obj.updateDynamic("showListOnEmpty")(showListOnEmpty)
    __obj.asInstanceOf[AutoCompleteParams]
  }
}

