package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1Algo2Options extends js.Object {
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pickAlgorithm: js.UndefOr[
    js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String]
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Algo1Algo2Options {
  @scala.inline
  def apply(
    options: js.Array[java.lang.String] = null,
    pickAlgorithm: (/* algo1 */ java.lang.String, /* algo2 */ java.lang.String) => java.lang.String = null,
    size: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Algo1Algo2Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Algo1Algo2Options]
  }
}

