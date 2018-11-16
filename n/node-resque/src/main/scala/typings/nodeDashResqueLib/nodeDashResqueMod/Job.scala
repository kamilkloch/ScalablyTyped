package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var plugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  def perform(args: js.Any*): stdLib.Promise[TResult]
}
