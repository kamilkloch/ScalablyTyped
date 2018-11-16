package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCommonCommonMod {
  type IInjectable = js.Function | js.Array[js.Any]
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[java.lang.String | scala.Double], T]
  type Predicate[X] = js.Function1[/* x */ js.UndefOr[X], scala.Boolean]
}