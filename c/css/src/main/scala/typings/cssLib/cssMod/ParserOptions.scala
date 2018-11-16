package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParserOptions extends js.Object {
  /** Silently fail on parse errors */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /** The path to the file containing css. Makes errors and source maps more helpful, by letting them know where code comes from. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}
